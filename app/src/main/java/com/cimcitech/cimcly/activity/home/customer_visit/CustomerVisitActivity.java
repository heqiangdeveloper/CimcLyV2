package com.cimcitech.cimcly.activity.home.customer_visit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.cimcitech.cimcly.ApkApplication;
import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.adapter.customer_visit.CustomerVisitAdapter;
import com.cimcitech.cimcly.bean.CustomerVisit;
import com.cimcitech.cimcly.bean.ListPagers;
import com.cimcitech.cimcly.bean.RequestBean.RuquMyVisit;
import com.cimcitech.cimcly.bean.Result;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.cimcitech.cimcly.widget.BaseActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.MediaType;
/**
 * 拜访记录列表
 */
public class CustomerVisitActivity extends BaseActivity {

    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;
    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefreshLayout;
    @Bind(R.id.recycler_view_layout)
    CoordinatorLayout recyclerViewLayout;
    @Bind(R.id.popup_menu_layout)
    LinearLayout popup_menu_Layout;
    @Bind(R.id.item_my_rl)
    RelativeLayout item_my_Rl;
    @Bind(R.id.item_others_rl)
    RelativeLayout item_others_Rl;
    @Bind(R.id.item_my_tv)
    TextView item_my_Tv;
    @Bind(R.id.item_others_tv)
    TextView item_others_Tv;
    @Bind(R.id.item_my_checked_tv)
    TextView item_my_checked_Tv;
    @Bind(R.id.item_others_checked_tv)
    TextView item_others_checked_Tv;
    @Bind(R.id.search_et)
    EditText searchEt;
    @Bind(R.id.search_bt)
    Button searchBt;
    @Bind(R.id.title_ll)
    LinearLayout title_Ll;
    @Bind(R.id.more_tv)
    TextView more_Tv;
    @Bind(R.id.titleName_tv)
    TextView titleName_Tv;
    @Bind(R.id.status_ll)
    LinearLayout status_Ll;
    @Bind(R.id.who_spinner)
    Spinner whoSpinner;
    @Bind(R.id.who_ll)
    LinearLayout who_Ll;

    private int pageNum = 1;
    private CustomerVisitAdapter adapter;
    private boolean isLoading;
    private List<CustomerVisit> data = new ArrayList<>();
    private Handler uiHandler = null;
    private Handler handler = new Handler();
    private final int INIT_DATA = 1003;
    private Result<ListPagers<CustomerVisit>> status;
    public static boolean myData = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_visit2);
        ButterKnife.bind(this);
        initTitle();
        initPopupMenu();
        myData = true;
        setItemChechedLableVisible();
        initHandler();
        initViewData();
        updateData();
    }

    public void initTitle(){
        more_Tv.setVisibility(View.VISIBLE);
        whoSpinner.setVisibility(View.GONE);
        who_Ll.setVisibility(View.GONE);
        titleName_Tv.setText("拜访记录");
        status_Ll.setVisibility(View.GONE);
        searchEt.setHint("请输入客户名称查询");
    }

    public void setItemChechedLableVisible(){
        if(myData){
            item_my_checked_Tv.setVisibility(View.VISIBLE);
            item_others_checked_Tv.setVisibility(View.GONE);
            item_my_Tv.setTextColor(getResources().getColor(R.color.colorPrimary));
            item_others_Tv.setTextColor(getResources().getColor(R.color.black));
        }else {
            item_my_checked_Tv.setVisibility(View.GONE);
            item_others_checked_Tv.setVisibility(View.VISIBLE);
            item_my_Tv.setTextColor(getResources().getColor(R.color.black));
            item_others_Tv.setTextColor(getResources().getColor(R.color.colorPrimary));
        }
    }

    public void initPopupMenu(){
        popup_menu_Layout.setVisibility(View.GONE);
        item_my_Rl.setVisibility(View.VISIBLE);
        item_others_Rl.setVisibility(View.VISIBLE);
    }

    public void setSpinnerListener(){
        whoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String whos = (String) whoSpinner.getAdapter().getItem(position);
                myData = whos.equals("我的") ? true:false;
                updateData();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    //刷新数据
    private void updateData() {
        swipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(true);
            }
        });
        //清除数据
        adapter.notifyDataSetChanged();
        this.data.clear();
        pageNum = 1;
        //mLoading.show();
        if (myData)
            getData(); //获取数据
        else
            getSubData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (Config.isAddVisit) {
            Config.isAddVisit = false;
            updateData();
        }
    }

    @OnClick({R.id.back_iv, R.id.add_ib, R.id.search_bt,R.id.more_tv,R.id.item_my_rl,R.id.item_others_rl})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.back_iv:
                finish();
                break;
            case R.id.add_ib:
                startActivity(new Intent(CustomerVisitActivity.this, CustomerVisitAddActivity.class));
                break;
            case R.id.search_bt:
                updateData();
                ApkApplication.imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
                break;
            case R.id.more_tv:
                popup_menu_Layout.setVisibility(View.VISIBLE);
                break;
            case R.id.item_my_rl:
                popup_menu_Layout.setVisibility(View.GONE);
                myData = true;
                updateData();
                break;
            case R.id.item_others_rl:
                popup_menu_Layout.setVisibility(View.GONE);
                myData = false;
                updateData();
                break;
        }
        setItemChechedLableVisible();
    }

    public void initViewData() {
        adapter = new CustomerVisitAdapter(CustomerVisitActivity.this, data);
        swipeRefreshLayout.setColorSchemeResources(R.color.blueStatus);
        swipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(true);
            }
        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //下拉刷新
                        adapter.notifyDataSetChanged();
                        data.clear(); //清除数据
                        pageNum = 1;
                        isLoading = false;
                        if (myData)
                            getData(); //获取数据
                        else
                            getSubData();
                    }
                }, 1000);
            }
        });
        final LinearLayoutManager layoutManager = new LinearLayoutManager(CustomerVisitActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                /*int lastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
                if (lastVisibleItemPosition + 1 == adapter.getItemCount()) {
                    boolean isRefreshing = swipeRefreshLayout.isRefreshing();
                    if (isRefreshing) {
                        adapter.notifyItemRemoved(adapter.getItemCount());
                        return;
                    }*/
                int topRowVerticalPosition = (recyclerView == null || recyclerView.getChildCount() == 0)
                        ? 0 : recyclerView.getChildAt(0).getTop();
                if (topRowVerticalPosition > 0) {
                    swipeRefreshLayout.setRefreshing(false);
                } else {
                    boolean isRefreshing = swipeRefreshLayout.isRefreshing();
                    if (isRefreshing) {
                        return;
                    }

                    if (!isLoading) {
                        isLoading = true;
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //上拉加载
                                if (status.getData().isHasNextPage()) {
                                    pageNum++;
                                    if (myData)
                                        getData();//添加数据
                                    else
                                        getSubData();
                                }
                                isLoading = false;
                            }
                        }, 1000);
                    }
                }
            }
        });
        //给List添加点击事件
        adapter.setOnItemClickListener(new CustomerVisitAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                CustomerVisit customerVisit = (CustomerVisit) adapter.getAll().get(position);
                Intent intent = new Intent(CustomerVisitActivity.this, CustomerVisitDetailActivity.class);
                intent.putExtra("cvid", customerVisit.getCvid());
                startActivity(intent);
            }

            @Override
            public void onItemLongClickListener(View view, int position) {
                //长按
            }
        });
    }

    private void initHandler() {
        uiHandler = new Handler() {
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case INIT_DATA:
                        adapter.notifyDataSetChanged();
                        swipeRefreshLayout.setRefreshing(false);
                        adapter.notifyItemRemoved(adapter.getItemCount());
                        break;
                }
            }
        };
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            int x = (int) ev.getX();
            int y = (int) ev.getY();

            if (null != popup_menu_Layout && popup_menu_Layout.getVisibility() == View.VISIBLE) {
                Rect hitRect = new Rect();
                popup_menu_Layout.getGlobalVisibleRect(hitRect);
                if (!hitRect.contains(x, y)) {
                    popup_menu_Layout.setVisibility(View.GONE);
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    public void getData() {
        String json = new Gson().toJson(new RuquMyVisit(pageNum, 10, "",
                new RuquMyVisit.CustomerVisitBean(Config.USERID,
                        searchEt.getText().toString().trim())));

        Log.e("CustomerVisitActivity", json);
        OkHttpUtils
                .postString()
                .url(Config.custVisit)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .content(json)
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                swipeRefreshLayout.setRefreshing(false);
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                Log.d("heqcus","my cust response is: " + response);
                                Type userlistType = new TypeToken<Result<ListPagers<CustomerVisit>>>() {
                                }.getType();
                                status = new Gson().fromJson(response, userlistType);
                                if (status != null) {
                                    if (status.isSuccess()) {
                                        if (status.getData().getList() != null && status.getData().getList().size() > 0) {
                                            for (int i = 0; i < status.getData().getList().size(); i++) {
                                                data.add(status.getData().getList().get(i));
                                            }
                                        }
                                        if (status.getData().isHasNextPage()) {
                                            adapter.setNotMoreData(false);
                                        } else {
                                            adapter.setNotMoreData(true);
                                        }
                                        adapter.notifyDataSetChanged();
                                        adapter.notifyItemRemoved(adapter.getItemCount());
                                    }
                                } else {
                                    adapter.notifyDataSetChanged();
                                }
                                swipeRefreshLayout.setRefreshing(false);
                            }
                        }
                );
    }

    public void getSubData() {
        String json = new Gson().toJson(new RuquMyVisit(pageNum, 10, "",
                new RuquMyVisit.CustomerVisitBean(Config.USERID,
                        searchEt.getText().toString().trim())));
        Log.e("CustomerVisitActivity", json);
        OkHttpUtils
                .postString()
                .url(Config.custSubVisit)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .content(json)
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                //if(mLoading.isShowing()) mLoading.dismiss();
                                swipeRefreshLayout.setRefreshing(false);
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                Type userlistType = new TypeToken<Result<ListPagers<CustomerVisit>>>() {
                                }.getType();
                                status = new Gson().fromJson(response, userlistType);
                                if (status != null) {
                                    if (status.isSuccess()) {
                                        if (status.getData().getList() != null && status.getData().getList().size() > 0) {
                                            for (int i = 0; i < status.getData().getList().size(); i++) {
                                                data.add(status.getData().getList().get(i));
                                            }
                                        }
                                        if (status.getData().isHasNextPage()) {
                                            adapter.setNotMoreData(false);
                                        } else {
                                            adapter.setNotMoreData(true);
                                        }
                                        adapter.notifyDataSetChanged();
                                        adapter.notifyItemRemoved(adapter.getItemCount());
                                    }
                                } else {
                                    adapter.notifyDataSetChanged();
                                }
                                swipeRefreshLayout.setRefreshing(false);
                            }
                        }
                );
    }
}
