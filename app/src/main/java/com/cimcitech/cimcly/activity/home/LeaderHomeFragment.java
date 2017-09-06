package com.cimcitech.cimcly.activity.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.customer_visit.CustomerVisitActivity;
import com.cimcitech.cimcly.activity.home.annount.AnnounceDetailActivity;
import com.cimcitech.cimcly.activity.home.annount.AnnounceListActivity;
import com.cimcitech.cimcly.activity.home.contact_person.ContactPersonActivity;
import com.cimcitech.cimcly.activity.home.feed_back.FeedBackActivity;
import com.cimcitech.cimcly.activity.home.intention_track.IntentionTrackActivity;
import com.cimcitech.cimcly.activity.home.my_client.MyClientActivity;
import com.cimcitech.cimcly.activity.home.order_contract.OrderContractActivity;
import com.cimcitech.cimcly.activity.home.payment.PaymentActivity;
import com.cimcitech.cimcly.activity.home.production.ProductionActivity;
import com.cimcitech.cimcly.activity.home.quoted_price.QuotedPriceActivity;
import com.cimcitech.cimcly.activity.home.report.ReportMainActivity;
import com.cimcitech.cimcly.activity.home.work_weekly.WorkWeeklyActivity;
import com.cimcitech.cimcly.adapter.HomeGridAdapter;
import com.cimcitech.cimcly.adapter.LeaderHomeGridAdapter;
import com.cimcitech.cimcly.adapter.announce.AnnounceHomeAdapter;
import com.cimcitech.cimcly.bean.announce.AnnounceReq;
import com.cimcitech.cimcly.bean.announce.AnnounceVo;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.cimcitech.cimcly.utils.Utility;
import com.cimcitech.cimcly.widget.MyGridView;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.MediaType;

import static com.cimcitech.cimcly.utils.Config.context;

public class LeaderHomeFragment extends Fragment {

    @Bind(R.id.homeGrid)
    MyGridView homeGrid;
    @Bind(R.id.listContent)
    ListView listContent;
    @Bind(R.id.news_mote_tv)
    TextView newsMoteTv;

    private LeaderHomeGridAdapter gridAdapter;
    private AnnounceVo announceVo;
    private AnnounceHomeAdapter adapter;
    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home, container, false);
        ButterKnife.bind(this, view);
        initViewData();
        getData();
        return view;
    }

    @OnClick(R.id.news_mote_tv)
    public void newsMore() {
        if(null != mContext) startActivity(new Intent(mContext, AnnounceListActivity.class));
    }

    class listContentItemListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            AnnounceVo.DataBean.ListBean listBean = adapter.getAll().get(i);
            if(null != mContext){
                Intent intent = new Intent(mContext, AnnounceDetailActivity.class);
                intent.putExtra("annId", listBean.getAnnid());
                startActivity(intent);
            }
        }
    }

    public void initViewData() {
        if(null != mContext){
            listContent.setOnItemClickListener(new listContentItemListener());
            gridAdapter = new LeaderHomeGridAdapter(mContext);
            homeGrid.setAdapter(gridAdapter);
            homeGrid.setSelector(R.drawable.hide_listview_yellow_selector);
            homeGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {//客户拜访
                        startActivity(new Intent(mContext, CustomerVisitActivity.class));
                    }
                    if (position == 1) { //意向跟踪
                        startActivity(new Intent(mContext, IntentionTrackActivity.class));
                    }
                    if (position == 2) {//报价单
                        startActivity(new Intent(mContext, QuotedPriceActivity.class));
                    }
                    if (position == 3) { //订单合同
                        startActivity(new Intent(mContext, OrderContractActivity.class));
                    }

                    if (position == 4) {//工作周报
                        startActivity(new Intent(mContext, WorkWeeklyActivity.class));
                    }
                    if (position == 5) {//我的客户
                        startActivity(new Intent(mContext, MyClientActivity.class));
                    }
                    if (position == 6) { //联系人
                        startActivity(new Intent(mContext, ContactPersonActivity.class));
                    }
                    if (position == 7) {//问题反馈
                        startActivity(new Intent(mContext, FeedBackActivity.class));
                    }
                    if (position == 8) {//回款跟踪
                        startActivity(new Intent(mContext, PaymentActivity.class));
                        //ToastUtil.showToast("开发中...");
                    }
                    if (position == 9) { //生产进度
                        startActivity(new Intent(mContext, ProductionActivity.class));
                        //ToastUtil.showToast("开发中...");
                    }
                    if (position == 10) { //报表
                        startActivity(new Intent(mContext, ReportMainActivity.class));
                        //ToastUtil.showToast("开发中...");
                    }
                }
            });
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = getActivity();
    }

    public void getData() {
        String json = new Gson().toJson(new AnnounceReq(1, 10, ""));
        OkHttpUtils
                .postString()
                .url(Config.announceList)
                .addHeader("checkTokenKey", Config.loginback.getToken())
                .addHeader("sessionKey", Config.loginback.getUserId() + "")
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
                                //ToastUtil.showToast(response);
                                announceVo = GjsonUtil.parseJsonWithGson(response, AnnounceVo.class);
                                if (announceVo != null)
                                    if (announceVo.isSuccess())
                                        if (announceVo.getData().getList().size() > 0) {
                                            if(mContext != null){
                                                adapter = new AnnounceHomeAdapter(mContext, announceVo.getData().getList());
                                                if(null != listContent){
                                                    listContent.setAdapter(adapter);
                                                    new Utility().setListViewHeightBasedOnChildren(listContent);
                                                }
                                            }
                                        }
                            }
                        }
                );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
