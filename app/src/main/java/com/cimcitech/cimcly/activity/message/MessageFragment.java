package com.cimcitech.cimcly.activity.message;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.chaychan.library.BottomBarLayout;
import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.home.order_contract.OrderContractDetailActivity;
import com.cimcitech.cimcly.activity.home.quoted_price.QuotedPriceDetailActivity;
import com.cimcitech.cimcly.adapter.message.Adapter;
import com.cimcitech.cimcly.adapter.message.MessagePopupWindowAdapter;
import com.cimcitech.cimcly.receiver.MyReceiver;
import com.cimcitech.cimcly.task.QueryMessageTask;
import com.cimcitech.cimcly.task.RemoveMessageTask;
import com.cimcitech.cimcly.task.UpdateMessageTask;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.OnTaskFinishedListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by cimcitech on 2017/7/31.
 */

public class MessageFragment extends Fragment {
    @Bind(R.id.recyclerView)
    RecyclerView mRecyclerView;
    @Bind(R.id.message_top_area)
    LinearLayout message_top_Area;
    @Bind(R.id.message_top_category_name)
    TextView message_top_category_Name;
    @Bind(R.id.message_top_category_label)
    TextView message_top_category_Label;

    private Adapter adapter;
    private List<MessageData> data;
    private PopupWindow pop;

    private BottomBarLayout mBottomBarLayout;
    public static final String REFRESH_UNREADMSG_BROADCAST = "com.cimcitech.cimcly" +
            ".refresh_unreadmsg_broadcast";
    public static final String KEY_MESSAGE = "content";
    public static final String KEY_EXTRAS = "title";
    private IntentFilter myIntentFilter;
    private Bundle savedInstanceState;
    private TextView opened_Tv;
    private TextView remove_Tv;
    private LinearLayout view2;
    private AlertDialog dialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_message, container, false);
        ButterKnife.bind(this,view);
        this.savedInstanceState = savedInstanceState;
        //initDialog();
        registBroadcastReceiver();

        Config.contractType = 0;
        data = new ArrayList<MessageData>();
        getData();
        return view;
    }

    public void registBroadcastReceiver(){
        myIntentFilter = new IntentFilter();
        myIntentFilter.addAction(MyReceiver.REFRESH_MESSAGE_STATE);
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(mBroadcastReceiver,
                myIntentFilter);
    }

    public  void unRegistBroadcastReceiver(){
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(mBroadcastReceiver);
    }

    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver(){
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if(action.equals(MyReceiver.REFRESH_MESSAGE_COUNT)){
                getData();
                adapter.updateList(data);
            }
        }
    };

    public void getData(){
        new QueryMessageTask(getActivity(), new OnTaskFinishedListener<List<MessageData>>() {
            @Override
            public void onTaskFinished(final List<MessageData> datas) {
                sendRefreshUnReadMsgBroadcast();//更新未读信息数
                data = datas;
                final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
                mRecyclerView.setLayoutManager(layoutManager);
                adapter = new Adapter(getActivity(),data);
                mRecyclerView.setAdapter(adapter);
                //给List添加点击事件
                adapter.setOnItemClickListener(new Adapter.IonSlidingViewClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        MessageData msgData = data.get(position);
                        int id = msgData.getId();
                        int opened = msgData.getOpened();
                        Intent intent = null;
                        if(msgData.getFlag().equals(MyReceiver.FLAG[0])){//报价单
                            intent = new Intent(getActivity(), QuotedPriceDetailActivity.class);
                            intent.putExtra("quoteid",msgData.getMessageContent().getQuoteid());
                        }else if(msgData.getFlag().equals(MyReceiver.FLAG[1])){//合同
                            changeUnReadMsgAndOpened(id,opened);
                            intent = new Intent(getActivity(), OrderContractDetailActivity.class);
                            //传递参数：sOrderId 订单id
                            intent.putExtra("sOrderId",data.get(position).getMessageContent().getsOrderId());
                        }
                        getActivity().startActivity(intent);
                    }

                    @Override
                    public void onDeleteBtnCilck(View view, final int position) {
                        new AlertDialog.Builder(getActivity())
                                .setTitle("提示")
                                .setMessage("您确定要删除吗？")
                                .setCancelable(false)
                                .setPositiveButton("确认", new DialogInterface.OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        int id = data.get(position).getId();
                                        removeMsg(id);
                                    }
                                })
                                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        dialogInterface.dismiss();
                                    }
                                }).create().show();
                    }

                    @Override
                    public void onSetBtnCilck(View view, int position) {
                        int id = data.get(position).getId();
                        int opened = data.get(position).getOpened();
                        changeMsgOpened(id,opened);
                    }
                });
                adapter.updateList(data);
            }
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public void changeUnReadMsgAndOpened(int id,int opened){
        if(opened == 0){
            new UpdateMessageTask(getActivity(), new OnTaskFinishedListener<Boolean>() {
                @Override
                public void onTaskFinished(Boolean data) {
                    if(data){
                        getData();
                        sendRefreshUnReadMsgBroadcast();
                    }
                }
            },id,1).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        }
    }

    public void sendRefreshUnReadMsgBroadcast(){
        Intent intent = new Intent();
        intent.setAction(MyReceiver.REFRESH_MESSAGE_COUNT);
        LocalBroadcastManager.getInstance(getActivity()).sendBroadcast(intent);
    }

    public void showDialog(final int id,final int opened){
        /*String openedStr = (opened == 0) ? getResources().getString(R.string
                .message_dialog_is_opend):
                getResources().getString(R.string.message_dialog_not_opend);
        opened_Tv.setText(openedStr);*/

        String[] items = new String[2];
        items[0] = (opened == 0) ? getResources().getString(R.string.message_dialog_is_opend):
                getResources().getString(R.string.message_dialog_not_opend);
        items[1] = getResources().getString(R.string.message_dialog_remove);

        new AlertDialog.Builder(getActivity())
                //.setTitle()
        .setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case 0://标为已读/未读
                        dialog.dismiss();
                        changeMsgOpened(id,opened);
                        break;
                    case 1://移除
                        dialog.dismiss();
                        removeMsg(id);
                        break;
                }
            }
        }).create().show();
    }

    public void changeMsgOpened(int id,int opened){
        int mOpened = (opened == 0) ? 1:0;
        new UpdateMessageTask(getActivity(), new OnTaskFinishedListener<Boolean>() {
            @Override
            public void onTaskFinished(Boolean data) {
                if(data){
                    getData();
                }
            }
        },id,mOpened).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public void removeMsg(int id){
        new RemoveMessageTask(getActivity(), new OnTaskFinishedListener<Boolean>() {
            @Override
            public void onTaskFinished(Boolean data) {
                if(data){
                    getData();
                }
            }
        },id).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @OnClick({R.id.message_top_area})
    public void onclick(View view) {
        switch (view.getId()){
            case R.id.message_top_area:
                message_top_category_Label.setText(getResources().getString(R.string.
                        message_top_category_label_open));
                List<String> list = new ArrayList<String>();
                list.add("全部");
                list.add("审核通过");
                list.add("审核不通过");
                showContactUsPopWin(getActivity(), "", list);
                pop.showAtLocation(view, Gravity.CENTER, 0, 0);
                break;
        }
    }

    public void showContactUsPopWin(Context context, String title, final List<String> list) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dialog_message, null);
        //view.getBackground().setAlpha(100);
        // 创建PopupWindow对象，并沿x居中
        //获取屏幕宽度
        WindowManager wm = (WindowManager) getActivity().getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        //pop = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams
           //     .MATCH_PARENT, false);
        pop = new PopupWindow(view, width/2, ViewGroup.LayoutParams.MATCH_PARENT, false);
        View pop_reward_view = view.findViewById(R.id.pop_reward_view);
        TextView name_tv = view.findViewById(R.id.pop_item_name_tv);
        TextView label_tv = view.findViewById(R.id.pop_item_label_tv);
        String content = message_top_category_Name.getText().toString();
        final MessagePopupWindowAdapter adapter = new MessagePopupWindowAdapter(context, list, content);
        ListView listView = view.findViewById(R.id.listContent);
        listView.setAdapter(adapter);
        // 需要设置一下此参数，点击外边可消失
        pop.setBackgroundDrawable(new BitmapDrawable());
        // 设置点击窗口外边窗口消失
        pop.setOutsideTouchable(true);
        // 设置此参数获得焦点，否则无法点击
        pop.setFocusable(true);
        pop_reward_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message_top_category_Label.setText(getResources().getString(R.string.
                        message_top_category_label_close));
                pop.dismiss();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                message_top_category_Name.setText(list.get(i));
                message_top_category_Label.setText(getResources().getString(R.string.
                        message_top_category_label_close));
                pop.dismiss();
                int index = 0;
                switch(i){
                    case 0:
                        index = 0;
                        break;
                    case 1:
                        index = 1;
                        break;
                    case 2:
                        index = 2;
                        break;
                }
                grepMessages(index);
            }
        });
    }

    public void grepMessages(final int index){
        new QueryMessageTask(getActivity(), new OnTaskFinishedListener<List<MessageData>>() {
            @Override
            public void onTaskFinished(final List<MessageData> datas) {
                //sendRefreshUnReadMsgBroadcast();//更新未读信息数
                data = datas;
                if(null != data && data.size() != 0){
                    switch (index){
                        case 0:
                            Config.contractType = 0;
                            break;
                        case 1://通过
                            Config.contractType = 1;
                            break;
                        case 2://未通过
                            Config.contractType = 2;
                            break;
                    }
                    adapter.updateList(data);
                }
            }
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unRegistBroadcastReceiver();
    }
}
