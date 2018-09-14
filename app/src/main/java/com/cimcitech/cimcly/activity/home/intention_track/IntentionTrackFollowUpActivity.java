package com.cimcitech.cimcly.activity.home.intention_track;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Switch;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.home.customer_visit.CustomerVisitAddActivity;
import com.cimcitech.cimcly.activity.main.EditValueActivity;
import com.cimcitech.cimcly.adapter.PopupWindowAdapter;
import com.cimcitech.cimcly.bean.opport_unit.OpportSelectVo;
import com.cimcitech.cimcly.bean.opport_unit.OpportUnitInfoVo;
import com.cimcitech.cimcly.bean.opport_unit.OpportUnitUpdateReq;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.CustSelectUtils;
import com.cimcitech.cimcly.utils.DateTool;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.cimcitech.cimcly.widget.BaseActivity;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.MediaType;

public class IntentionTrackFollowUpActivity extends BaseActivity {
    @Bind(R.id.add_bt)
    Button addBt;
    @Bind(R.id.intentional_theme_et)
    TextView intentionalThemeEt;
    @Bind(R.id.product_category_tv)
    TextView productCategoryTv;
    @Bind(R.id.product_variety_tv)
    TextView productVarietyTv;
    @Bind(R.id.product_model_tv)
    TextView productModelTv;
    @Bind(R.id.product_number_tv)
    TextView productNumberTv;
    @Bind(R.id.contract_amount_tv)
    TextView contractAmountTv;
    @Bind(R.id.delivery_date_tv)
    TextView deliveryDateTv;
    @Bind(R.id.stage_tv)
    TextView stageTv;
    @Bind(R.id.possibility_tv)
    TextView possibilityTv;
    @Bind(R.id.follow_up_time_tv)
    TextView followUpTimeTv;
    @Bind(R.id.follow_up_type_tv)
    TextView followUpTypeTv;
    @Bind(R.id.payment_method_tv)
    TextView paymentMethodTv;
    @Bind(R.id.detailed_requirements_et)
    EditText detailedRequirementsEt;
    @Bind(R.id.intentional_number_tv)
    TextView intentionalNumberTv;
    @Bind(R.id.more_tv)
    TextView more_Tv;
    @Bind(R.id.title_ll)
    LinearLayout title_Ll;
    @Bind(R.id.titleName_tv)
    TextView titleName_Tv;
    @Bind(R.id.back_iv)
    ImageView back_Iv;

    private String intentionalThemeValue = "";
    private String productCategoryValue = "";
    private String productVarietyValue = "";
    private String productModelValue = "";
    private String productNumberValue = "";
    private String contractAmountValue = "";
    private String deliveryDateValue = "";
    private String stageValue = "";
    private String possibilityValue = "";
    private String followUpTypeValue = "";
    private String paymentMethodValue = "";
    private String detailedRequirementsValue = "";
    private String intentionalNumberValue = "";

    public int intValue = 0;
    private PopupWindow pop;
    private OpportUnitInfoVo infoVo;

    private OpportSelectVo opportSelectVo; //选择项
    private OpportSelectVo.DataBean.ProductBean productBean;//产品类别
    private OpportSelectVo.DataBean.ProductBean.CodeValueListBeanX codeValueListBeanX; //产品品种
    private OpportSelectVo.DataBean.ProductBean.CodeValueListBeanX.CodeValueListBean codeValueListBean;//产品型号
    private OpportSelectVo.DataBean.PayMethodBean payMethodBean; //付款方式
    private OpportSelectVo.DataBean.PossibiltyBean possibiltyBean;//可能性
    private OpportSelectVo.DataBean.FollowBean followBean;//跟进方式

    private int mYear, mMonth, mDay;
    private final int DATE_DIALOG = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intention_track_follow_up2);
        ButterKnife.bind(this);
        initTitle();
        mLoading.show();
        getOpportSelect();
        final Calendar ca = Calendar.getInstance();
        mYear = ca.get(Calendar.YEAR);
        mMonth = ca.get(Calendar.MONTH);
        mDay = ca.get(Calendar.DAY_OF_MONTH);
        followUpTimeTv.setText(DateTool.getSystemDate());
        infoVo = (OpportUnitInfoVo) this.getIntent().getSerializableExtra("infoVo");
    }

    public void initTitle(){
        more_Tv.setVisibility(View.GONE);
        title_Ll.setVisibility(View.GONE);
        titleName_Tv.setText("意向跟进");
    }

    private void initViewData() {
        if (infoVo != null) {
            OpportUnitInfoVo.DataBean info = infoVo.getData();
            intentionalNumberTv.setText(info.getOpportno());
            intentionalNumberValue = intentionalNumberTv.getText().toString();

            intentionalThemeEt.setText(info.getOpportsubject());
            intentionalThemeValue = intentionalThemeEt.getText().toString().trim();

            productCategoryTv.setText(CustSelectUtils.getProductCategory(opportSelectVo, info.getProductcategory()));
            productCategoryValue = productCategoryTv.getText().toString().trim();

            productVarietyTv.setText(CustSelectUtils.getProductVariety(opportSelectVo, info.getProductcategory(),
                    info.getProductvariety()));
            productVarietyValue = productVarietyTv.getText().toString().trim();

            productModelTv.setText(info.getProductid() + "|" +
                    CustSelectUtils.getProductModel(opportSelectVo, info.getProductcategory(),
                            info.getProductvariety(),
                            info.getProductid()));
            productModelValue = productModelTv.getText().toString().trim();

            productNumberTv.setText(info.getProductcount() + "");
            productNumberValue = productNumberTv.getText().toString().trim();

            contractAmountTv.setText(info.getPlanmoney() + "");
            contractAmountValue = contractAmountTv.getText().toString().trim();

            deliveryDateTv.setText(DateTool.getDateStr(info.getPlansigndate()));
            deliveryDateValue = deliveryDateTv.getText().toString().trim();

            stageTv.setText(info.getStageValue());
            stageValue = stageTv.getText().toString().trim();

            possibilityTv.setText(info.getPossibilityValue());
            possibilityValue = possibilityTv.getText().toString().trim();

            paymentMethodTv.setText(CustSelectUtils.getPaymentmethod(opportSelectVo, infoVo.getData().getPaymentmethod()));
            paymentMethodValue = paymentMethodTv.getText().toString().trim();
        }
    }

    @OnClick({R.id.back_iv, R.id.product_category_tv,
            R.id.product_variety_tv, R.id.product_model_tv, R.id.delivery_date_tv,
            R.id.possibility_tv, R.id.payment_method_tv, R.id.add_bt, R.id.follow_up_type_tv,
            R.id.product_number_tv,R.id.contract_amount_tv})
    public void onclick(View v) {
        List<String> list;
        switch (v.getId()) {
            case R.id.back_iv:
                if(isChanged()){
                    String content = getResources().getString(R.string.content_changed_warning);
                    new AlertDialog.Builder(IntentionTrackFollowUpActivity.this)
                            .setMessage(content)
                            .setCancelable(false)
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                    finish();
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            }).create().show();
                }else{
                    finish();
                }
                break;
            case R.id.product_model_tv:
                intValue = 4;
                if (infoVo != null) {
                    productBean = CustSelectUtils.getProductCategoryVo(opportSelectVo, infoVo.getData().getProductcategory());
                    codeValueListBeanX = CustSelectUtils.getProductVarietyVo(opportSelectVo,
                            infoVo.getData().getProductcategory(),
                            infoVo.getData().getProductvariety());
                }
                if (opportSelectVo != null)
                    if (productBean != null)
                        if (codeValueListBeanX != null) {
                            list = new ArrayList<>();
                            for (int i = 0; i < codeValueListBeanX.getCodeValueList().size(); i++)
                                list.add(codeValueListBeanX.getCodeValueList().get(i).getCodetype() + "|"
                                        + codeValueListBeanX.getCodeValueList().get(i).getCodevalue());
                            showContactUsPopWin(IntentionTrackFollowUpActivity.this, "选择产品型号", list);
                            pop.showAtLocation(v, Gravity.CENTER, 0, 0);
                        } else
                            ToastUtil.showToast("请先选择产品品种");
                    else
                        ToastUtil.showToast("请先选择产品类别");
                break;
            case R.id.delivery_date_tv:
                showDialog(DATE_DIALOG);//跳出时间选择控件
                break;
            case R.id.possibility_tv:
                intValue = 6;
                if (opportSelectVo != null) {
                    list = new ArrayList<>();
                    for (int i = 0; i < opportSelectVo.getData().getPossibilty().size(); i++)
                        list.add(opportSelectVo.getData().getPossibilty().get(i).getCodevalue());
                    showContactUsPopWin(IntentionTrackFollowUpActivity.this, "选择可能性", list);
                    pop.showAtLocation(v, Gravity.CENTER, 0, 0);
                }
                break;
            case R.id.payment_method_tv:
                intValue = 7;
                if (opportSelectVo != null) {
                    list = new ArrayList<>();
                    for (int i = 0; i < opportSelectVo.getData().getPayMethod().size(); i++)
                        list.add(opportSelectVo.getData().getPayMethod().get(i).getCodevalue());
                    showContactUsPopWin(IntentionTrackFollowUpActivity.this, "选择付款方式", list);
                    pop.showAtLocation(v, Gravity.CENTER, 0, 0);
                }
                break;
            case R.id.add_bt:
                if (!checkInput()) return;
                mLoading.dismiss();
                updateOpportUnitData();
                break;
            case R.id.follow_up_type_tv:
                intValue = 8;
                if (opportSelectVo != null) {
                    list = new ArrayList<>();
                    for (int i = 0; i < opportSelectVo.getData().getFollow().size(); i++)
                        list.add(opportSelectVo.getData().getFollow().get(i).getCodevalue());
                    showContactUsPopWin(IntentionTrackFollowUpActivity.this, "选择跟进方式", list);
                    pop.showAtLocation(v, Gravity.CENTER, 0, 0);
                }
                break;
            case R.id.product_number_tv:
                startEditActivity("num","产品数量",productNumberTv.getText().toString().trim(),0);
                break;
            case R.id.contract_amount_tv:
                startEditActivity("num","预计合同金额",contractAmountTv.getText().toString().trim(),1);
                break;
        }
    }

    public boolean isChanged(){
        if(!intentionalNumberValue.equals(intentionalNumberTv.getText().toString()) ||
                !intentionalThemeValue.equals(intentionalThemeEt.getText().toString()) ||
                !productCategoryValue.equals(productCategoryTv.getText().toString()) ||
                !productVarietyValue.equals(productVarietyTv.getText().toString()) ||
                !productModelValue.equals(productModelTv.getText().toString()) ||
                !productNumberValue.equals(productNumberTv.getText().toString()) ||
                !contractAmountValue.equals(contractAmountTv.getText().toString()) ||
                !deliveryDateValue.equals(deliveryDateTv.getText().toString()) ||
                !stageValue.equals(stageTv.getText().toString()) ||
                !possibilityValue.equals(possibilityTv.getText().toString()) ||
                !paymentMethodValue.equals(paymentMethodTv.getText().toString()) ||
                followUpTypeValue.length() != 0 ||
                detailedRequirementsValue.length() != 0){
            return true;
        }else{
            return false;
        }
    }

    public void startEditActivity(String type,String title,String content,int requestCode){
        Intent intent2 = new Intent(IntentionTrackFollowUpActivity.this, EditValueActivity.class);
        intent2.putExtra("type",type);
        intent2.putExtra("title",title);
        intent2.putExtra("content",content);
        startActivityForResult(intent2,requestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(RESULT_OK == resultCode){
            String result = data.getStringExtra("result");
            switch (requestCode){
                case 0:
                    productNumberTv.setText(result);
                    break;
                case 1:
                    contractAmountTv.setText(result);
                    break;
            }
        }
    }

    public void showContactUsPopWin(Context context, String title, List<String> list) {
        LayoutInflater inflater = LayoutInflater.from(context);
        // 引入窗口配置文件
        View view = inflater.inflate(R.layout.dialog_add_client_view, null);
        view.getBackground().setAlpha(100);
        // 创建PopupWindow对象
        pop = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, false);
        View pop_reward_view = view.findViewById(R.id.pop_reward_view);
        TextView title_tv = view.findViewById(R.id.title_tv);
        title_tv.setText(title);
        final PopupWindowAdapter adapter = new PopupWindowAdapter(context, list);
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
                pop.dismiss();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (intValue == 4) {
                    codeValueListBean = codeValueListBeanX.getCodeValueList().get(i);
                    productModelTv.setText(adapter.getAll().get(i));
                    productModelTv.setTextColor(Color.parseColor("#333333"));
                    pop.dismiss();
                }
                if (intValue == 6) {
                    possibiltyBean = opportSelectVo.getData().getPossibilty().get(i);
                    possibilityTv.setText(possibiltyBean.getCodevalue());
                    possibilityTv.setTextColor(Color.parseColor("#333333"));
                    pop.dismiss();
                }
                if (intValue == 7) {
                    payMethodBean = opportSelectVo.getData().getPayMethod().get(i);
                    paymentMethodTv.setText(payMethodBean.getCodevalue());
                    paymentMethodTv.setTextColor(Color.parseColor("#333333"));
                    pop.dismiss();
                }
                if (intValue == 8) {
                    followBean = opportSelectVo.getData().getFollow().get(i);
                    followUpTypeTv.setText(followBean.getCodevalue());
                    followUpTypeTv.setTextColor(Color.parseColor("#333333"));
                    pop.dismiss();
                }
            }
        });
    }

    /*******时间控件start********/

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_DIALOG:
                return new DatePickerDialog(this, mdateListener, mYear, mMonth, mDay);
        }
        return null;
    }

    /**
     * 设置日期 利用StringBuffer追加
     */
    public void display() {
        //dateDisplay.setText(new StringBuffer().append(mMonth + 1).append("-")
        //.append(mDay).append("-").append(mYear).append(" "));
        String string = (new StringBuffer()
                .append(mYear).append("-")
                .append(mMonth + 1).append("-")
                .append(mDay).append(""))
                .toString();
        string = DateTool.transferDateStr(string);
        deliveryDateTv.setText(string);
        deliveryDateTv.setTextColor(Color.parseColor("#333333"));


    }

    private DatePickerDialog.OnDateSetListener mdateListener = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            mYear = year;
            mMonth = monthOfYear;
            mDay = dayOfMonth;
            display();
        }
    };

    /**
     * 获取联系人
     */
    public void getOpportSelect() {
        OkHttpUtils
                .post()
                .url(Config.getOpportSelect)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                if(mLoading.isShowing()){
                                    mLoading.dismiss();
                                }
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                //ToastUtil.showToast(response);
                                try {
                                    opportSelectVo = GjsonUtil.parseJsonWithGson(response, OpportSelectVo.class);
                                    initViewData();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                if(mLoading.isShowing()){
                                    mLoading.dismiss();
                                }
                            }
                        }
                );
    }

    public boolean checkInput() {
        if (productNumberTv.getText().toString().trim().equals("")) {
            ToastUtil.showToast("请输入产品数量");
            return false;
        }
        if (contractAmountTv.getText().toString().trim().equals("")) {
            ToastUtil.showToast("请输入预计合同金额");
            return false;
        }
        if (followBean == null) {
            ToastUtil.showToast("请选择跟进方式");
            return false;
        }
        return true;
    }

    public void updateOpportUnitData() {
        int productcount;
        //意向id
        int opportid = infoVo.getData().getOpportid();
        //客户id
        int custid = infoVo.getData().getCustid();
        //意向主题
        String opportsubject = infoVo.getData().getOpportsubject();
        String productid = "";
        //产品型号
        if (codeValueListBean != null)
            productid = codeValueListBean.getCodetype();
        else
            productid = infoVo.getData().getProductid();
        //数量
        if (productNumberTv.getText().toString().trim().equals("")) {
            productcount = infoVo.getData().getProductcount();
        } else {
            productcount = Integer.parseInt(productNumberTv.getText().toString().trim());
        }
        //需求交付日
        String plansigndate = deliveryDateTv.getText().toString().trim();
        //预计合同金额
        String planmoney = contractAmountTv.getText().toString().trim();
        //可能性
        String possibility = "";
        if (possibiltyBean != null)
            possibility = possibiltyBean.getCodeid();
        else
            possibility = infoVo.getData().getPossibility();
        //详细需求
        String detail = detailedRequirementsEt.getText().toString().trim();
        //备注
        String remark = "";
        //修改人
        int modify = Config.USERID;
        //币种
        String currency = infoVo.getData().getCurrency();
        //意向类型
        String opporttype = infoVo.getData().getOpporttype();
        //付款方式
        String paymentmethod = "";
        if (payMethodBean != null)
            paymentmethod = payMethodBean.getCodeid();
        else
            paymentmethod = infoVo.getData().getPaymentmethod();
        //产品类别
        String productcategory = infoVo.getData().getProductcategory();
        //产品品种
        String productvariety = infoVo.getData().getProductvariety();
        //跟进方式
        String followStyle = followBean.getCodeid();


        String json = new Gson().toJson(new OpportUnitUpdateReq(opportid, custid, opportsubject, productid,
                plansigndate, planmoney, possibility, detail, remark, modify, currency, opporttype, paymentmethod,
                productcategory, productvariety, followStyle, productcount));

        OkHttpUtils
                .postString()
                .url(Config.updateOpportUnit)
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
                                mLoading.dismiss();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                ToastUtil.showToast(response);
                                try {
                                    JSONObject json = new JSONObject(response);
                                    if (json.getBoolean("success")) {
                                        ToastUtil.showToast("跟进成功");
                                        Config.isFollowUp = true;
                                        finish();
                                    } else
                                        ToastUtil.showToast("跟进失败");
                                    mLoading.dismiss();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }

                            }
                        }
                );
    }

    @Override
    public void onBackPressed() {
        back_Iv.callOnClick();
    }
}
