
package com.cimcitech.cimcly.activity.home.car_in_storage;

import android.graphics.Color;
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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.cimcitech.cimcly.ApkApplication;
import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.home.car_out_factory.CarOutFactoryActivity;
import com.cimcitech.cimcly.adapter.car_in_storage.AlreadyInStorageAdapter;
import com.cimcitech.cimcly.adapter.car_in_storage.WaitInStorageAdapter;
import com.cimcitech.cimcly.bean.ListPagers;
import com.cimcitech.cimcly.bean.car_in_storage.WaitInStorageInfo;
import com.cimcitech.cimcly.bean.car_in_storage.WaitInStorageReq;
import com.cimcitech.cimcly.bean.Result;
import com.cimcitech.cimcly.bean.depart_request.RequestFeedbackBean;
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
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.MediaType;

/**
 * 我的客户
 */
public class CarInStorageActivity extends BaseActivity {
    @Bind(R.id.add_bt)
    Button addBt;
    @Bind(R.id.my_tv)
    TextView myTv;
    @Bind(R.id.xs_tv)
    TextView xsTv;
    @Bind(R.id.my_view)
    View myView;
    @Bind(R.id.xs_view)
    View xsView;
    @Bind(R.id.search_et)
    EditText searchEt;
    @Bind(R.id.search_bt)
    Button searchBt;
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;
    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefreshLayout;
    @Bind(R.id.recycler_view_layout)
    CoordinatorLayout recyclerViewLayout;
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
    @Bind(R.id.popup_menu_layout)
    LinearLayout popup_menu_Layout;

    private int pageNum = 1;
    private Result<ListPagers<WaitInStorageInfo>> status;
    private List<WaitInStorageInfo> data_WaitInStorage = new ArrayList<>();
    private List<WaitInStorageInfo> data_AlreadyInStorage = new ArrayList<>();
    private WaitInStorageAdapter adapter_WaitInStorage;
    private AlreadyInStorageAdapter adapter_AlreadyInStorage;
    private Handler handler = new Handler();
    private boolean isLoading;
    public static boolean isWaitInStorage = true;
    private final int REFRESH_DATA = 1;
    private ArrayAdapter<String> arr_adapter;
    private String carInStorageLabel ;//“入库”
    private String carOutStorageLabel ;//“退库”

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case REFRESH_DATA:
                    updateData();
                    break;
            }
        }
    };

    private void sendMsg(int flag){
        Message msg = new Message();
        msg.what = flag;
        mHandler.sendMessage(msg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_in_storage2);
        ButterKnife.bind(this);
        initTitle();
        initPopupMenu();
        isWaitInStorage = true;
        initViewData();
        getData();
    }

    public void initTitle(){
        more_Tv.setVisibility(View.VISIBLE);
        whoSpinner.setVisibility(View.GONE);
        titleName_Tv.setText("车辆入库");
        title_Ll.setVisibility(View.VISIBLE);
        status_Ll.setVisibility(View.GONE);
        who_Ll.setVisibility(View.GONE);
        searchEt.setHint("请输入客户名称查询");

        //myTv.setText("待入库");
        //xsTv.setText("已入库");
        carInStorageLabel = getResources().getString(R.string.car_in_storage);
        carOutStorageLabel = getResources().getString(R.string.car_out_storage);
        //数据
        List<String> data_list = new ArrayList<String>();
        data_list.add("待入库");
        data_list.add("已入库");

        item_my_Tv.setText("待入库");
        item_others_Tv.setText("已入库");

        addBt.setText(carInStorageLabel);
        //适配器
        arr_adapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data_list);
        //设置样式
        arr_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //加载适配器
        whoSpinner.setAdapter(arr_adapter);
    }

    public void setItemChechedLableVisible(){
        if(isWaitInStorage){
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
                //设置Spinner显示的字体颜色
                TextView tv = (TextView) view;
                tv.setTextColor(Color.WHITE);
                String whos = (String) whoSpinner.getAdapter().getItem(position);
                isWaitInStorage = whos.equals("待入库") ? true:false;
                addBt.setText(isWaitInStorage? "入库":"退库");
                updateData();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void initViewData() {
        adapter_WaitInStorage = new WaitInStorageAdapter(CarInStorageActivity.this, data_WaitInStorage);
        adapter_AlreadyInStorage = new AlreadyInStorageAdapter(CarInStorageActivity.this, data_AlreadyInStorage);
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
                        adapter_WaitInStorage.notifyDataSetChanged();
                        data_WaitInStorage.clear(); //清除数据
                        adapter_AlreadyInStorage.notifyDataSetChanged();
                        data_AlreadyInStorage.clear(); //清除数据
                        pageNum = 1;
                        isLoading = false;
                        if (isWaitInStorage)
                            getData(); //获取数据
                        else
                            getSubData();
                    }
                }, 1000);
            }
        });
        final LinearLayoutManager layoutManager = new LinearLayoutManager(CarInStorageActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        if(isWaitInStorage){
            recyclerView.setAdapter(adapter_WaitInStorage);
        }else {
            recyclerView.setAdapter(adapter_AlreadyInStorage);
        }
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
                                    if (isWaitInStorage)
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
        /*adapter_InStorage.setOnItemClickListener(new CarInStorageAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

            }

            @Override
            public void onItemLongClickListener(View view, int position) {
            }
        });*/
    }

    //刷新数据
    private void updateData() {
        //adapter = new CarInStorageAdapter(CarInStorageActivity.this, data);
        swipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(true);
            }
        });
        //清除数据
        //adapter.notifyDataSetChanged();
        //this.data.clear();
        pageNum = 1;
        if (isWaitInStorage){
            adapter_WaitInStorage = new WaitInStorageAdapter(CarInStorageActivity.this, data_WaitInStorage);
            recyclerView.setAdapter(adapter_WaitInStorage);
            adapter_WaitInStorage.notifyDataSetChanged();
            data_WaitInStorage.clear();
            getData(); //获取数据
        }else {
            adapter_AlreadyInStorage = new AlreadyInStorageAdapter(CarInStorageActivity.this, data_AlreadyInStorage);
            recyclerView.setAdapter(adapter_AlreadyInStorage);
            adapter_AlreadyInStorage.notifyDataSetChanged();
            data_AlreadyInStorage.clear();
            getSubData();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (Config.isCarInStorage) {
            Config.isCarInStorage = false;
            updateData();
        }
    }

    @OnClick({R.id.back_iv, R.id.my_tv, R.id.xs_tv, R.id.add_bt, R.id.search_bt,
            R.id.more_tv,R.id.item_my_rl,R.id.item_others_rl})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.back_iv:
                finish();
                break;
            case R.id.my_tv:
                isWaitInStorage = true;
                addBt.setText(isWaitInStorage? "入库":"退库");
                myView.setVisibility(View.VISIBLE);
                xsView.setVisibility(View.INVISIBLE);
                updateData();
                break;
            case R.id.xs_tv:
                isWaitInStorage = false;
                addBt.setText(isWaitInStorage? "入库":"退库");
                myView.setVisibility(View.INVISIBLE);
                xsView.setVisibility(View.VISIBLE);
                updateData();
                break;
            case R.id.add_bt:
                //startActivity(new Intent(MyClientActivity.this, MyClientAddActivity.class));
                if(isWaitInStorage){
                    submitCarInStorage();//入库
                }else{
                    submitCarOutStorage();//退库
                }
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
                isWaitInStorage = true;
                addBt.setText(carInStorageLabel);
                updateData();
                break;
            case R.id.item_others_rl:
                popup_menu_Layout.setVisibility(View.GONE);
                isWaitInStorage = false;
                addBt.setText(carOutStorageLabel);
                updateData();
                break;
        }
        setItemChechedLableVisible();
    }

    public void submitCarInStorage(){
        if(adapter_WaitInStorage != null){
            Map<Integer, Boolean> map = adapter_WaitInStorage.getMap();
            List<WaitInStorageInfo> selectData = new ArrayList<>();
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < map.size(); i++){
                if(map.get(i)){
                    WaitInStorageInfo info = data_WaitInStorage.get(i);
                    selectData.add(info);
                }
            }
            if(selectData.size() == 0){
                Toast.makeText(CarInStorageActivity.this,"您还未选择待入库的车辆！",Toast.LENGTH_SHORT).show();
            }else if(selectData.size() == 1){
                sb.delete(0,sb.length());
                sb.append(selectData.get(0).getVehicleno());
                submitCarInStorageData(sb.toString());
            }else if(selectData.size() > 1){
                sb.delete(0,sb.length());
                String sorderno = selectData.get(0).getSorderno();
                sb.append(selectData.get(0).getVehicleno() + ",");
                int i;
                for(i = 1; i < selectData.size(); i++){
                    Log.d("hqtest","car sorderno is: " +  selectData.get(i).getSorderno());
                    if(!selectData.get(i).getSorderno().equals(sorderno)){
                        break;
                    }
                    sb.append(selectData.get(i).getVehicleno() + ",");
                }
                if(i >= selectData.size()){
                    submitCarInStorageData(sb.toString().substring(0,sb.toString().length()-1));
                }else {
                    Toast.makeText(CarInStorageActivity.this,"所选择的车辆订单号须一致！",Toast.LENGTH_SHORT).show();
                }

            }
        }
    }

    public void submitCarInStorageData(String vehiclenos){
        OkHttpUtils
                .post()
                .url(Config.waitInStorageAction)
                .addParams("userId", Config.USERID + "")
                .addParams("vehicleNos", vehiclenos)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                //.content(json)
                //.mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                Toast.makeText(CarInStorageActivity.this,"入库失败,请检查网络",Toast
                                        .LENGTH_SHORT).show();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                RequestFeedbackBean requestFeedbackStr = new Gson().fromJson(response, RequestFeedbackBean.class);
                                if(requestFeedbackStr.isSuccess()){
                                    Toast.makeText(CarInStorageActivity.this,"入库成功",Toast.LENGTH_SHORT).show();
                                    sendMsg(REFRESH_DATA);
                                }else{
                                    Toast.makeText(CarInStorageActivity.this,requestFeedbackStr.getMsg(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                );
    }

    public void submitCarOutStorageData(String vehiclenos){
        OkHttpUtils
                .post()
                .url(Config.outStorageAction)
                //.addParams("userId", Config.USERID + "")
                .addParams("vehicleNos", vehiclenos)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                //.content(json)
                //.mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                Toast.makeText(CarInStorageActivity.this,"退库失败，请检查网络",Toast
                                        .LENGTH_SHORT).show();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                RequestFeedbackBean RequestFeedbackStr = new Gson().fromJson(response, RequestFeedbackBean.class);
                                if(RequestFeedbackStr.isSuccess()){
                                    Toast.makeText(CarInStorageActivity.this,"退库成功",Toast.LENGTH_SHORT).show();
                                }else {
                                    Toast.makeText(CarInStorageActivity.this,RequestFeedbackStr.getMsg(),
                                            Toast.LENGTH_SHORT).show();
                                    sendMsg(REFRESH_DATA);
                                }
                            }
                        }
                );
    }

    //
    public void submitCarOutStorage(){
        if(adapter_AlreadyInStorage != null){
            Map<Integer, Boolean> map = adapter_AlreadyInStorage.getMap();
            List<WaitInStorageInfo> selectData = new ArrayList<>();
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < map.size(); i++){
                if(map.get(i)){
                    WaitInStorageInfo info = data_AlreadyInStorage.get(i);
                    selectData.add(info);
                }
            }
            if(selectData.size() == 0){
                Toast.makeText(CarInStorageActivity.this,"您还未选择要退库的车辆！",Toast.LENGTH_SHORT).show();
            }else if(selectData.size() == 1){
                sb.delete(0,sb.length());
                sb.append(selectData.get(0).getVehicleno());
                submitCarOutStorageData(sb.toString());
                /*if(isSubmitCarOutFactory && data != null && data.size() != 0){
                    Log.d("inlog","refresh data!");
                    isWaitInStorage = false;
                    data.clear();
                    updateData();
                }*/
            }else if(selectData.size() > 1){
                sb.delete(0,sb.length());
                String sorderno = selectData.get(0).getSorderno();
                sb.append(selectData.get(0).getVehicleno() + ",");
                int i;
                for(i = 1; i < selectData.size(); i++){
                    Log.d("hqtest","car sorderno is: " +  selectData.get(i).getSorderno());
                    if(!selectData.get(i).getSorderno().equals(sorderno)){
                        break;
                    }
                    sb.append(selectData.get(i).getVehicleno() + ",");
                }
                if(i >= selectData.size()){
                    submitCarOutStorageData(sb.toString().substring(0,sb.toString().length()-1));
                    /*if(isSubmitCarOutFactory && data != null && data.size() != 0){
                        data.clear();
                        updateData();
                    }*/
                }else {
                    Toast.makeText(CarInStorageActivity.this,"所选择的车辆订单号须一致！",Toast.LENGTH_SHORT).show();
                }
            }
        }

    }

    public void getData() {
        //recyclerView.setAdapter(adapter_InStorage);//绑定数据源
        String json = new Gson().toJson(new WaitInStorageReq(pageNum, 10, "",
                new WaitInStorageReq.WaitInStorageReqBean(Config.USERID + "",
                        searchEt.getText().toString().trim())));
        OkHttpUtils
                .postString()
                .url(Config.waitInStorageList)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .content(json)
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                Type userlistType = new TypeToken<Result<ListPagers<WaitInStorageInfo>>>() {
                                }.getType();
                                status = new Gson().fromJson(response, userlistType);
                                if (status != null) {
                                    if (status.isSuccess()) {
                                        if (status.getData().getList() != null && status.getData().getList().size() > 0) {
                                            for (int i = 0; i < status.getData().getList().size(); i++) {
                                                data_WaitInStorage.add(status.getData().getList().get(i));
                                            }
                                        }
                                        if (status.getData().isHasNextPage()) {
                                            adapter_WaitInStorage.setNotMoreData(false);
                                        } else {
                                            adapter_WaitInStorage.setNotMoreData(true);
                                        }

                                        adapter_WaitInStorage.notifyDataSetChanged();
                                        swipeRefreshLayout.setRefreshing(false);
                                        adapter_WaitInStorage.notifyItemRemoved(adapter_WaitInStorage.getItemCount());
                                    }
                                } else {
                                    adapter_WaitInStorage.notifyDataSetChanged();
                                    swipeRefreshLayout.setRefreshing(false);
                                }
                            }
                        }
                );
    }

    /**
     * 获取已入库列表
     */
    public void getSubData() {
        //recyclerView.setAdapter(adapter_OutFactory);//绑定数据源
        String json = new Gson().toJson(new WaitInStorageReq(pageNum, 10, "",
                new WaitInStorageReq.WaitInStorageReqBean(Config.USERID + "",
                        searchEt.getText().toString().trim())));
        OkHttpUtils
                .postString()
                .url(Config.alreadyInStorageList)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .content(json)
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                Type userlistType = new TypeToken<Result<ListPagers<WaitInStorageInfo>>>() {
                                }.getType();
                                status = new Gson().fromJson(response, userlistType);
                                if (status != null) {
                                    if (status.isSuccess()) {
                                        if (status.getData().getList() != null && status.getData().getList().size() > 0) {
                                            for (int i = 0; i < status.getData().getList().size(); i++) {
                                                data_AlreadyInStorage.add(status.getData().getList().get(i));
                                            }
                                        }
                                        if (status.getData().isHasNextPage()) {
                                            adapter_AlreadyInStorage.setNotMoreData(false);
                                        } else {
                                            adapter_AlreadyInStorage.setNotMoreData(true);
                                        }
                                        adapter_AlreadyInStorage.notifyDataSetChanged();
                                        swipeRefreshLayout.setRefreshing(false);
                                        adapter_AlreadyInStorage.notifyItemRemoved(adapter_AlreadyInStorage.getItemCount());
                                    }
                                } else {
                                    adapter_AlreadyInStorage.notifyDataSetChanged();
                                    swipeRefreshLayout.setRefreshing(false);
                                }
                            }
                        }
                );
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
}
