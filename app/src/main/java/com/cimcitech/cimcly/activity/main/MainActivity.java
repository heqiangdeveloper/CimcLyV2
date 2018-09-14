package com.cimcitech.cimcly.activity.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.chaychan.library.BottomBarItem;
import com.chaychan.library.BottomBarLayout;
import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.message.MessageFragment;
import com.cimcitech.cimcly.activity.user.DataCleanManager;
import com.cimcitech.cimcly.bean.AreaVo;
import com.cimcitech.cimcly.receiver.MyReceiver;
import com.cimcitech.cimcly.task.QueryUnReadMessageTask;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.cimcitech.cimcly.utils.OnTaskFinishedListener;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.cimcitech.cimcly.widget.DataGenerator;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.FileCallBack;
import com.zhy.http.okhttp.callback.StringCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import cn.jpush.android.api.JPushInterface;
import okhttp3.Call;


public class MainActivity extends AppCompatActivity {
    private RadioGroup mRadioGroup;
    private Fragment[] mFragments;
    private RadioButton mRadioButtonHome;

    private String appAuthString = "";
    private static boolean mBackKeyPressed = false;//记录是否有首次按键
    private long firstTime = 0;
    private BottomBarLayout mBottomBarLayout;

    public static final String MESSAGE_RECEIVED_ACTION = "com.cimcitech.cimcly" +
            ".MESSAGE_RECEIVED_ACTION";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_EXTRAS = "extras";
    public int unReadMsg  = 0;
    public IntentFilter filter;
    private ArrayList<MyOnTouchListener> onTouchListeners = new ArrayList<MyOnTouchListener>(
            10);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mFragments = DataGenerator.getFragments();
        mBottomBarLayout = (BottomBarLayout) findViewById(R.id.bbl) ;

        initView2();
        getAreaData();

        getUnreadMsg();
        //设置极光推送
        //初始化sdk
        JPushInterface.setDebugMode(true);//正式版的时候设置false，关闭调试
        JPushInterface.init(this);
        //建议添加tag标签，发送消息的之后就可以指定tag标签来发送了
        Set<String> setTags = new HashSet<>();
        setTags.add("debug");//名字任意，可多添加几个
        JPushInterface.setTags(this, setTags, null);//设置标签
        JPushInterface.setAlias(this, String.valueOf(Config.USERID), null);

        String content = getIntent().getStringExtra("content");
        if (null != content && !content.equals("")){
            mBottomBarLayout.getBottomItem(0).callOnClick();//选中消息页
        }

        registRefreshReceiver();

        //达到缓存的上限，就清理缓存
        Runtime rt = Runtime.getRuntime();
        long maxMemory = rt.maxMemory();//该手机分配给每个APP的最大内存
        Log.i("heqmom", Long.toString(maxMemory / (1024 * 1024)));
        DataCleanManager manager = new DataCleanManager();
        long maxCache = maxMemory / 8;//缓存的上限
        try {
            long currentCache = manager.getFolderSize(getApplication().getCacheDir());
            if (currentCache >= maxCache) {
                manager.clearAllCache(getApplication());
            }
        } catch (Exception e) {

        }
    }

    public void registRefreshReceiver(){
        filter = new IntentFilter();
        filter.addAction(MyReceiver.REFRESH_MESSAGE_COUNT);
        LocalBroadcastManager.getInstance(MainActivity.this).registerReceiver(refreshReceiver,filter);
    }

    public BroadcastReceiver refreshReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent.getAction().equals(MyReceiver.REFRESH_MESSAGE_COUNT)){
                getUnreadMsg();
            }
        }
    };

    public void unRegistRefreshReceiver(){
        LocalBroadcastManager.getInstance(MainActivity.this).unregisterReceiver(refreshReceiver);
    }

    public void getUnreadMsg(){
        new QueryUnReadMessageTask(MainActivity.this, new OnTaskFinishedListener<Integer>() {
            @Override
            public void onTaskFinished(Integer data) {
                mBottomBarLayout.setUnread(0,data);
            }
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public void initView2(){
        mBottomBarLayout.setOnItemSelectedListener(new BottomBarLayout.OnItemSelectedListener() {
            Fragment mFragment = null;
            @Override
            public void onItemSelected(BottomBarItem bottomBarItem, int i, int position) {
                for(int n = 0; n < 4; n++){
                    mBottomBarLayout.getBottomItem(n).setStatus(false);
                }
                if(position == 0){//消息
                    mFragment = mFragments[0];
                }else if(position == 1){//首页
                    mFragment = mFragments[1];
                }else if(position == 2){//意向跟踪
                    mFragment = mFragments[2];
                }else{//我的
                    mFragment = mFragments[3];
                }
                mBottomBarLayout.getBottomItem(position).setStatus(true);
                if (mFragments != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.home_container, mFragment).commit();
                }
            }
        });
        //mBottomBarLayout.getBottomItem(1).setStatus(true);
        mBottomBarLayout.getBottomItem(1).callOnClick();//默认选中首页
    }

    /**
     * 获取省市级联的省市信息
     */
    public void getAreaData() {
        /*if( Config.loginback == null){
            Config.loginback.setToken("2FD08ED0-E53B-48B1-B8E6-E6B4290A2770");
        }*/
        OkHttpUtils
                .post()
                .url(Config.getProviceAndCity)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                // ToastUtil.showToast(response);
                                try {
                                    Config.areaVo = GjsonUtil.parseJsonWithGson(response, AreaVo.class);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                );
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //防止快速切换Fragment 和 在fragment中，使用getActivity() 结果为null导致的FC
        //解决方法：不保存Fragment的状态，让其与activity一同消亡
        //super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unRegistRefreshReceiver();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            long secondTime = System.currentTimeMillis();
            if (secondTime - firstTime > 2000) {
                Toast.makeText(MainActivity.this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                firstTime = secondTime;
                return true;
            } else {
                System.exit(0);
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        for (MyOnTouchListener listener : onTouchListeners) {
            listener.onTouch(ev);
        }
        return super.dispatchTouchEvent(ev);
    }

    public void registerMyOnTouchListener(MyOnTouchListener myOnTouchListener) {
        onTouchListeners.add(myOnTouchListener);
    }

    public void unregisterMyOnTouchListener(MyOnTouchListener myOnTouchListener) {
        onTouchListeners.remove(myOnTouchListener);
    }

    public interface MyOnTouchListener {
        public boolean onTouch(MotionEvent ev);
    }
}
