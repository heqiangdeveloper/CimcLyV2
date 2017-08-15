package com.cimcitech.cimcly.activity.home.intention_track;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.home.quoted_price.QuotedPriceAddActivity;
import com.cimcitech.cimcly.bean.opport_unit.OpportUnitInfoVo;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.DateTool;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

public class IntentionTrackDetailActivity extends AppCompatActivity {

    @Bind(R.id.back_rl)
    RelativeLayout backRl;
    @Bind(R.id.add_bt)
    LinearLayout addBt;
    @Bind(R.id.client_no)
    TextView clientNo;
    @Bind(R.id.time_tv)
    TextView timeTv;
    @Bind(R.id.client_name_tv)
    TextView clientNameTv;
    @Bind(R.id.intentional_theme_et)
    TextView intentionalThemeEt;
    @Bind(R.id.product_model_tv)
    TextView productModelTv;
    @Bind(R.id.product_number_et)
    TextView productNumberEt;
    @Bind(R.id.contract_amount_et)
    TextView contractAmountEt;
    @Bind(R.id.delivery_date_tv)
    TextView deliveryDateTv;
    @Bind(R.id.stage_tv)
    TextView stageTv;
    @Bind(R.id.possibility_tv)
    TextView possibilityTv;
    @Bind(R.id.status_tv)
    TextView statusTv;
    @Bind(R.id.productCategoryName_tv)
    TextView productCategoryNameTv;
    @Bind(R.id.productVarietyName_tv)
    TextView productVarietyNameTv;
    @Bind(R.id.user_name_tv)
    TextView userNameTv;

    private int opportId;
    private OpportUnitInfoVo infoVo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intention_track_detail);
        ButterKnife.bind(this);
        opportId = getIntent().getIntExtra("opportId", 0);
        getData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (Config.isFollowUp)
            getData();
    }


    @OnClick({R.id.back_rl, R.id.quoted_price_bt, R.id.follow_up_bt, R.id.record_bt})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.back_rl:
                finish();
                break;
            case R.id.quoted_price_bt:
                if (("ST01".equals(infoVo.getData().getStage()) || "ST02".equals(infoVo.getData().getStage())
                        || "ST06".equals(infoVo.getData().getStage())) && !("CS05".equals(infoVo.getData().getCurrentstage()) ||
                        "CS04".equals(infoVo.getData().getCurrentstage()))) {
                    Intent intent = new Intent(IntentionTrackDetailActivity.this, QuotedPriceAddActivity.class);
                    if (infoVo != null)
                        intent.putExtra("infoVo", infoVo);
                    startActivity(intent);
                } else {
                    ToastUtil.showToast("此状态意向订单不可编辑");
                }

                break;
            case R.id.follow_up_bt:
                if (("ST01".equals(infoVo.getData().getStage()) || "ST02".equals(infoVo.getData().getStage())
                        || "ST06".equals(infoVo.getData().getStage())) && !("CS05".equals(infoVo.getData().getCurrentstage()) ||
                        "CS04".equals(infoVo.getData().getCurrentstage()))) {
                    Intent intent = new Intent(IntentionTrackDetailActivity.this, IntentionTrackFollowUpActivity.class);
                    if (infoVo != null)
                        intent.putExtra("infoVo", infoVo);
                    startActivity(intent);
                } else {
                    ToastUtil.showToast("此状态意向订单不可编辑");
                }
                break;
            case R.id.record_bt:
                Intent intent = new Intent(IntentionTrackDetailActivity.this, IntentionTrackRecordingActivity.class);
                intent.putExtra("opportId", opportId);
                startActivity(intent);
                break;
        }
    }

    public void getData() {
        OkHttpUtils
                .post()
                .url(Config.opportUnitInfo)
                .addHeader("checkTokenKey", Config.loginback.getToken())
                .addHeader("sessionKey", Config.loginback.getUserId() + "")
                .addParams("opportId", opportId + "")
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
                                try {
                                    infoVo = GjsonUtil.parseJsonWithGson(response, OpportUnitInfoVo.class);
                                    if (infoVo != null)
                                        if (infoVo.isSuccess()) {
                                            OpportUnitInfoVo.DataBean item = infoVo.getData();
                                            clientNo.setText(item.getCustid() + "");
                                            timeTv.setText(DateTool.getDateStr(item.getCreatedate()));
                                            clientNameTv.setText(item.getCustName());
                                            intentionalThemeEt.setText(item.getOpportsubject());//
                                            productNumberEt.setText(item.getProductcount() + "");
                                            contractAmountEt.setText(item.getPlanmoney() + "");
                                            deliveryDateTv.setText(DateTool.getDateStr(item.getPlansigndate()));
                                            stageTv.setText(item.getStageValue());
                                            possibilityTv.setText(item.getPossibilityValue());
                                            statusTv.setText(item.getCurrentStageValue());
                                            productCategoryNameTv.setText(item.getProductCategoryName());
                                            productVarietyNameTv.setText(item.getProductVarietyName());
                                            productModelTv.setText(item.getProductid());
                                            userNameTv.setText(item.getUserName());
                                        }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }

                            }
                        }
                );
    }

}
