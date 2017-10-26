package com.cimcitech.cimcly.activity.home.production;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.production.ProductionVo;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.DateTool;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.text.SimpleDateFormat;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

public class ProductionDetailActivity extends AppCompatActivity {

    @Bind(R.id.title)
    TextView title;
    @Bind(R.id.back_rl)
    RelativeLayout backRl;

    //@Bind(R.id.prodorderdetid_tv)
    //TextView prodorderdetid_Tv;
    @Bind(R.id.sorderno_tv)
    TextView sorderno_Tv;
    @Bind(R.id.confirmdate_tv)
    TextView confirmdate_Tv;
    @Bind(R.id.vehicleno_tv)
    TextView vehicleno_Tv;
    @Bind(R.id.productmodel_tv)
    TextView productmodel_Tv;
    @Bind(R.id.planbegindate_tv)
    TextView planbegindate_Tv;
    @Bind(R.id.planenddate_tv)
    TextView planenddate_Tv;
    @Bind(R.id.actualbegindate_tv)
    TextView actualbegindate_Tv;
    @Bind(R.id.actualenddate_tv)
    TextView actualenddate_Tv;

    private long prodOrderDetId;
    private ProductionVo productionVo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production_detail);
        ButterKnife.bind(this);
        prodOrderDetId = this.getIntent().getLongExtra("prodOrderDetId", 0);
        Log.d("heqpd","sortid is：" + prodOrderDetId);
        getData();
    }

    @OnClick({R.id.back_rl})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.back_rl:
                finish();
                break;
        }
    }

    public void getData() {
        OkHttpUtils
                .post()
                .url(Config.productionDetailUrl)
                .addHeader("checkTokenKey", Config.loginback.getToken())
                .addHeader("sessionKey", Config.loginback.getUserId() + "")
                .addParams("prodOrderDetId", prodOrderDetId + "")
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                Log.e("CustomerVisitActivity", "请求失败");
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                Log.i("heqpmd","payment detail response is: " + response);
                                try {
                                    productionVo = GjsonUtil.parseJsonWithGson(response, ProductionVo.class);
                                    if (productionVo.isSuccess()) {
                                        initViewData();
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                );
    }

    private void initViewData() {
        /*prodorderdetid_Tv.setText(productionVo.getData().getProdorderdetid() > 0 ?
                productionVo.getData().getProdorderdetid() + "" : "");*/
        sorderno_Tv.setText(productionVo.getData().getSorderno() != null ?
                productionVo.getData().getSorderno() + "" : "");
        if(productionVo.getData().getConfirmdate() > 0){
            confirmdate_Tv.setText(DateTool.getDateStr(productionVo.getData().getConfirmdate()));
        }

        vehicleno_Tv.setText(productionVo.getData().getVehicleno() != null ?
                productionVo.getData().getVehicleno() + "" : "");
        productmodel_Tv.setText(productionVo.getData().getProductmodel() != null ?
                productionVo.getData().getProductmodel() + "" : "");

        if(productionVo.getData().getPlanbegindate() > 0){
            Long l = productionVo.getData().getPlanbegindate();
            planbegindate_Tv.setText(DateTool.getDateStr(productionVo.getData().getPlanbegindate()));
        }
        if(productionVo.getData().getPlanenddate() > 0){
            planenddate_Tv.setText(DateTool.getDateStr(productionVo.getData().getPlanenddate()));
        }
        if(productionVo.getData().getActualbegindate() > 0){
            actualbegindate_Tv.setText(DateTool.getDateStr(productionVo.getData().getActualbegindate()));
        }
        if(productionVo.getData().getActualenddate() > 0){
            actualenddate_Tv.setText(DateTool.getDateStr(productionVo.getData().getActualenddate()));
        }
    }
}
