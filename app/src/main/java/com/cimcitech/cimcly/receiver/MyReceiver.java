package com.cimcitech.cimcly.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;

import com.cimcitech.cimcly.activity.main.LoginActivity;
import com.cimcitech.cimcly.activity.main.MainActivity;
import com.cimcitech.cimcly.activity.message.MessageContent;
import com.cimcitech.cimcly.activity.message.MessageData;
import com.cimcitech.cimcly.bean.message.ContractMessageBean;
import com.cimcitech.cimcly.bean.message.QuotedMessageBean;
import com.cimcitech.cimcly.task.AddMessageTask;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.cimcitech.cimcly.utils.OnTaskFinishedListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

import cn.jpush.android.api.JPushInterface;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by qianghe on 2018/7/4.
 */

public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "jiguang";
    public final static String REFRESH_MESSAGE_COUNT = "com.cimcitech.cimcly.receiver.refresh" +
            ".message.count";
    public final static String REFRESH_MESSAGE_STATE = "com.cimcitech.cimcly.receiver.refresh" +
            ".message.state";
    //区分是谁推送的：quoted:报价单，contract:订单合同
    public final static String [] FLAG = {"0","1"};

    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            Bundle bundle = intent.getExtras();
            Log.d(TAG, "[MyReceiver] onReceive - " + intent.getAction() + ", extras: " + printBundle(bundle));

            if (JPushInterface.ACTION_REGISTRATION_ID.equals(intent.getAction())) {
                String regId = bundle.getString(JPushInterface.EXTRA_REGISTRATION_ID);
                Log.d(TAG, "[MyReceiver] 接收Registration Id : " + regId);
                //send the Registration Id to your server...

            } else if (JPushInterface.ACTION_MESSAGE_RECEIVED.equals(intent.getAction())) {
                Log.d(TAG, "[MyReceiver] 接收到推送下来的自定义消息: " + bundle.getString(JPushInterface.EXTRA_MESSAGE));
                processCustomMessage(context, bundle);

            } else if (JPushInterface.ACTION_NOTIFICATION_RECEIVED.equals(intent.getAction())) {
                Log.d(TAG, "[MyReceiver] 接收到推送下来的通知");
                int notifactionId = bundle.getInt(JPushInterface.EXTRA_NOTIFICATION_ID);
                Log.d(TAG, "[MyReceiver] 接收到推送下来的通知的ID: " + notifactionId);

                //{"contractType":"0","msg":"桥号:10-7555-3755已派工，请接单","planId":"4328","title":"接单提醒"}
                String content = bundle.getString(JPushInterface.EXTRA_EXTRA);
                MessageContent msgContent = null;
                String msg = "";
                String flag = "";
                try {
                    JSONObject json = new JSONObject(content);
                    flag = json.getString("flag");
                    if (FLAG[0].equals(flag)) {//报价单
                        QuotedMessageBean quotedBean = GjsonUtil.parseJsonWithGson(content,
                                QuotedMessageBean.class);
                        msg = "报价单号：" + quotedBean.getQuoteid() + ",审核结果：" +
                                quotedBean.getQuoteStatusValue() + "，请查看。" ;
                        msgContent = new MessageContent(quotedBean.getTitle(),msg,quotedBean
                                .getQuoteid(),quotedBean.getQuoteStatusValue(),quotedBean.getQuoteStatus());
                    }else if(FLAG[1].equals(flag)){//合同
                        ContractMessageBean contractBean = GjsonUtil.parseJsonWithGson(content,
                                ContractMessageBean.class);
                        msg = "合同号：" + contractBean.getContractNo() + "，审核结果：" +
                                contractBean.getfStatus() + "，请查看。" ;
                        msgContent = new MessageContent(contractBean.getTitle(),msg,contractBean
                                .getsOrderId(),contractBean.getfStatus(),contractBean.getfState(),contractBean.getContractNo());
                    }
                }catch (JSONException e){
                    //do nothing
                }
                //将新消息写入数据库中
                addMsg(context, msgContent,flag);

            } else if (JPushInterface.ACTION_NOTIFICATION_OPENED.equals(intent.getAction())) {
                Log.d(TAG, "[MyReceiver] 用户点击打开了通知");
                String content = bundle.getString(JPushInterface.EXTRA_ALERT);

                //先判断用户是否已登录
                Intent i = null;
                if(isLogin(context)){
                    //打开自定义的Activity
                    i = new Intent(context, MainActivity.class);
                    i.putExtra("content", content);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                }else{
                    i = new Intent(context, LoginActivity.class);
                }
                context.startActivity(i);

            } else if (JPushInterface.ACTION_RICHPUSH_CALLBACK.equals(intent.getAction())) {
                Log.d(TAG, "[MyReceiver] 用户收到到RICH PUSH CALLBACK: " + bundle.getString(JPushInterface.EXTRA_EXTRA));
                //在这里根据 JPushInterface.EXTRA_EXTRA 的内容处理代码，比如打开新的Activity， 打开一个网页等..

            } else if (JPushInterface.ACTION_CONNECTION_CHANGE.equals(intent.getAction())) {
                boolean connected = intent.getBooleanExtra(JPushInterface.EXTRA_CONNECTION_CHANGE, false);
                Log.w(TAG, "[MyReceiver]" + intent.getAction() + " connected state change to " + connected);
            } else {
                Log.d(TAG, "[MyReceiver] Unhandled intent - " + intent.getAction());
            }
        } catch (Exception e) {

        }
    }

    private boolean isLogin(Context context){
        //如果是已登录过的，直接跳过登录界面
        SharedPreferences sp = context.getSharedPreferences(Config.KEY_LOGIN_AUTO, MODE_PRIVATE);
        if(sp.getString("user_name","").length() != 0 &&
                sp.getString("password","").length() != 0 &&
                sp.getString("realName","").length() != 0 &&
                sp.getLong("userId",0) != 0){
            return true;
        }else{
            return false;
        }
    }

    private void addMsg(final Context context, MessageContent messageContent,String flag){
        //time
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String time = format.format(calendar.getTime());

        MessageData messageData = new MessageData(flag,0,time,messageContent);//默认未读

        new AddMessageTask(context, new OnTaskFinishedListener<Boolean>() {
            @Override
            public void onTaskFinished(Boolean data) {
                //通知MessageFragment页面进行更新
                if(data){
                    Config.unReadMsg++;
                    Intent intent = new Intent();
                    intent.setAction(MyReceiver.REFRESH_MESSAGE_COUNT);
                    LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                }
            }
        }, messageData).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    //send msg to MainActivity
    private void processCustomMessage(Context context, Bundle bundle) {
        //if (MainActivity.isForeground) {
        String message = bundle.getString(JPushInterface.EXTRA_MESSAGE);
        String extras = bundle.getString(JPushInterface.EXTRA_EXTRA);
        Intent msgIntent = new Intent(MyReceiver.REFRESH_MESSAGE_COUNT);
        msgIntent.putExtra(MainActivity.KEY_MESSAGE, message);
        if (extras.length() != 0 ) {
            try {
                JSONObject extraJson = new JSONObject(extras);
                if (extraJson.length() > 0) {
                    msgIntent.putExtra(MainActivity.KEY_EXTRAS, extras);
                }
            } catch (JSONException e) {

            }

        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(msgIntent);
        //}
    }

    // 打印所有的 intent extra 数据
    private static String printBundle(Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        for (String key : bundle.keySet()) {
            if (key.equals(JPushInterface.EXTRA_NOTIFICATION_ID)) {
                sb.append("\nkey:" + key + ", value:" + bundle.getInt(key));
            }else if(key.equals(JPushInterface.EXTRA_CONNECTION_CHANGE)){
                sb.append("\nkey:" + key + ", value:" + bundle.getBoolean(key));
            } else if (key.equals(JPushInterface.EXTRA_EXTRA)) {
                if (TextUtils.isEmpty(bundle.getString(JPushInterface.EXTRA_EXTRA))) {
                    Log.i(TAG, "This message has no Extra data");
                    continue;
                }

                try {
                    JSONObject json = new JSONObject(bundle.getString(JPushInterface.EXTRA_EXTRA));
                    Iterator<String> it =  json.keys();

                    while (it.hasNext()) {
                        String myKey = it.next();
                        sb.append("\nkey:" + key + ", value: [" +
                                myKey + " - " +json.optString(myKey) + "]");
                    }
                } catch (JSONException e) {
                    Log.e(TAG, "Get message extra JSON error!");
                }

            } else {
                sb.append("\nkey:" + key + ", value:" + bundle.get(key));
            }
        }
        return sb.toString();
    }
}
