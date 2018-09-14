package com.cimcitech.cimcly.activity.home.my_client;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.home.customer_visit.CustomerVisitAddActivity;
import com.cimcitech.cimcly.activity.home.contact_person.ContactPersonActivity;
import com.cimcitech.cimcly.activity.home.intention_track.IntentionTrackAddActivity;
import com.cimcitech.cimcly.activity.home.work_weekly.WorkWeeklyAddActivity;
import com.cimcitech.cimcly.activity.main.EditValueActivity;
import com.cimcitech.cimcly.adapter.PopupWindowAdapter;
import com.cimcitech.cimcly.bean.CustSelectVo;
import com.cimcitech.cimcly.bean.client.AddMyClientReq;
import com.cimcitech.cimcly.bean.client.ClientVo;
import com.cimcitech.cimcly.utils.AccountValidatorUtil;
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
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.MediaType;

public class MyClientUpdateActivity extends BaseActivity {
    @Bind(R.id.contact_person_tv)
    TextView contactPersonTv;
    @Bind(R.id.visit_tv)
    TextView visitTv;
    @Bind(R.id.intention_tv)
    TextView intentionTv;
    @Bind(R.id.save_tv)
    TextView saveTv;
    @Bind(R.id.system_date_tv)
    TextView systemDateTv;
    @Bind(R.id.customer_category_tv)
    TextView customerCategoryTv;
    @Bind(R.id.client_name_tv)
    TextView clientNameTv;
    @Bind(R.id.abbreviation_tv)
    TextView abbreviationTv;
    @Bind(R.id.mobile_tv)
    TextView mobileTv;
    @Bind(R.id.fax_tv)
    TextView faxTv;
    @Bind(R.id.country_tv)
    TextView countryTv;
    @Bind(R.id.province_tv)
    TextView provinceTv;
    @Bind(R.id.city_tv)
    TextView cityTv;
    @Bind(R.id.address_tv)
    TextView addressTv;
    @Bind(R.id.zip_code_tv)
    TextView zipCodeTv;
    @Bind(R.id.taxes_tv)
    TextView taxesTv;
    @Bind(R.id.invoice_tv)
    TextView invoiceTv;
    @Bind(R.id.beizhu_et)
    EditText beizhuEt;

    @Bind(R.id.title_ll)
    LinearLayout title_Ll;
    @Bind(R.id.more_tv)
    TextView more_Tv;
    @Bind(R.id.titleName_tv)
    TextView titleName_Tv;
    @Bind(R.id.back_iv)
    ImageView back_Iv;

    //modidied by qianghe on 2017/10/11 begin
    @Bind(R.id.province_Linear)
    LinearLayout provinceLinear;
    @Bind(R.id.city_Linear)
    LinearLayout cityLinear;
    //modidied by qianghe on 2017/10/11 end

    private String customerCategoryValue = "";
    private String abbreviationValue = "";
    private String mobileValue = "";
    private String faxValue = "";
    private String countryValue = "";
    private String provinceValue = "";
    private String cityValue = "";
    private String clientNameValue = "";
    private String addressValue = "";
    private String zipCodeValue = "";
    private String taxesValue = "";
    private String invoiceValue = "";
    private String beizhuValue = "";

    private Long custid;
    private ClientVo customer;
    private CustSelectVo custSelectVo;
    private PopupWindow pop;
    public int intValue = 0;
    private boolean isUpdate = false; //是否修改了省份，如果修改要一同修改城市

    private CustSelectVo.Data.CustType custType;  //类型
    private CustSelectVo.Data.Region region;//国家
    private CustSelectVo.Data.Region.CateList cateList; //省份
    private CustSelectVo.Data.Region.CateList.City city; //城市
    private CustSelectVo.Data.Web web; //税种

    private ProgressDialog dialog = null;
    private  static final int SAVEDATA = 1001;
    private  static final int SAVEDATA_HIDE = 1002;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case SAVEDATA:
                    dialog = new ProgressDialog(MyClientUpdateActivity.this);
                    dialog.setMessage("数据保存中…");
                    dialog.setCancelable(false);
                    dialog.show();
                    break;
                case SAVEDATA_HIDE:
                    if(dialog.isShowing())
                        dialog.dismiss();
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_client_update2);
        ButterKnife.bind(this);
        initTitle();
        systemDateTv.setText(DateTool.getSystemDate());
        custid = this.getIntent().getLongExtra("custid", 0);
        mLoading.show();
        getData();
    }

    public void initTitle(){
        more_Tv.setVisibility(View.GONE);
        titleName_Tv.setText("客户信息详情");
        title_Ll.setVisibility(View.GONE);
    }

    @OnClick({R.id.save_tv, R.id.contact_person_tv, R.id.visit_tv, R.id.intention_tv,
            R.id.customer_category_tv, R.id.country_tv, R.id.province_tv, R.id.city_tv,
            R.id.taxes_tv, R.id.back_iv,R.id.abbreviation_tv,R.id.mobile_tv,R.id.fax_tv,
            R.id.address_tv,R.id.zip_code_tv,R.id.invoice_tv})
    public void onclick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.abbreviation_tv://客户简称
                startEditActivity("str","客户简称",abbreviationTv.getText().toString().trim(),0);
                break;
            case R.id.mobile_tv:
                startEditActivity("num","电话",mobileTv.getText().toString().trim(),1);
                break;
            case R.id.fax_tv:
                startEditActivity("str","传真",faxTv.getText().toString().trim(),2);
                break;
            case R.id.address_tv:
                startEditActivity("str","详细地址",addressTv.getText().toString().trim(),3);
                break;
            case R.id.zip_code_tv://邮编
                startEditActivity("num","邮编",zipCodeTv.getText().toString().trim(),4);
                break;
            case R.id.invoice_tv://发票抬头
                startEditActivity("str","发票抬头",invoiceTv.getText().toString().trim(),5);
                break;
            case R.id.save_tv:
                if (!checkInput())
                    return;
                if (customer != null) {
                    //mLoading.show();
                    sendMsg(SAVEDATA);
                    updateData(customer);
                }
                break;
            case R.id.customer_category_tv: //获取客户类别
                intValue = 0;
                if (custSelectVo.isSuccess()) {
                    List<String> list = new ArrayList<>();
                    for (int i = 0; i < custSelectVo.getData().getCustType().size(); i++) {
                        list.add(custSelectVo.getData().getCustType().get(i).getCodevalue());
                    }
                    showContactUsPopWin(MyClientUpdateActivity.this, "选择客户类别", list);
                    pop.showAtLocation(view, Gravity.CENTER, 0, 0);
                }
                break;
            case R.id.country_tv: //国家
                intValue = 1;
                if (custSelectVo.isSuccess()) {
                    List<String> list = new ArrayList<>();
                    for (int i = 0; i < custSelectVo.getData().getRegion().size(); i++) {
                        list.add(custSelectVo.getData().getRegion().get(i).getCategoryname());
                    }
                    showContactUsPopWin(MyClientUpdateActivity.this, "选择国家", list);
                    pop.showAtLocation(view, Gravity.CENTER, 0, 0);
                }
                break;
            case R.id.province_tv:
                intValue = 2;//省份
                if (custSelectVo.isSuccess()) {
                    List<String> list = new ArrayList<>();
                    for (int i = 0; i < custSelectVo.getData().getRegion().get(0).getCateList().size(); i++) {
                        list.add(custSelectVo.getData().getRegion().get(0).getCateList().get(i).getCategoryname());
                    }
                    showContactUsPopWin(MyClientUpdateActivity.this, "选择省份", list);
                    pop.showAtLocation(view, Gravity.CENTER, 0, 0);
                }
                break;
            case R.id.city_tv:
                intValue = 3;//城市
                if (custSelectVo.isSuccess()) {
                    if (cateList != null) {
                        List<String> list = new ArrayList<>();
                        for (int i = 0; i < cateList.getCateList().size(); i++) {
                            list.add(cateList.getCateList().get(i).getCategoryname());
                        }
                        showContactUsPopWin(MyClientUpdateActivity.this, "选择城市", list);
                        pop.showAtLocation(view, Gravity.CENTER, 0, 0);
                    } else {
                        ToastUtil.showToast("请先选择省份");
                    }
                }
                break;
            case R.id.taxes_tv: //税种
                intValue = 4;
                if (custSelectVo.isSuccess()) {
                    List<String> list = new ArrayList<>();
                    for (int i = 0; i < custSelectVo.getData().getWeb().size(); i++) {
                        list.add(custSelectVo.getData().getWeb().get(i).getCodevalue());
                    }
                    showContactUsPopWin(MyClientUpdateActivity.this, "选择客户分区", list);
                    pop.showAtLocation(view, Gravity.CENTER, 0, 0);
                }
                break;
            case R.id.back_iv:
                if(isChanged()){
                    String content = getResources().getString(R.string.content_changed_warning);
                    new AlertDialog.Builder(MyClientUpdateActivity.this)
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
            case R.id.contact_person_tv:
                intent = new Intent(MyClientUpdateActivity.this, ContactPersonActivity.class);
                intent.putExtra("custid", custid);
                startActivity(intent);
                break;
            case R.id.visit_tv:
                intent = new Intent(MyClientUpdateActivity.this, CustomerVisitAddActivity.class);
                intent.putExtra("customer", customer);
                startActivity(intent);
                break;
            case R.id.intention_tv:
                intent = new Intent(MyClientUpdateActivity.this, IntentionTrackAddActivity.class);
                intent.putExtra("customer", customer);
                startActivity(intent);
                break;
        }
    }

    public boolean isChanged(){
        if(!customerCategoryValue.equals(customerCategoryTv.getText().toString()) ||
            !abbreviationValue.equals(abbreviationTv.getText().toString()) ||
             !mobileValue.equals(mobileTv.getText().toString()) ||
               !faxValue.equals(faxTv.getText().toString()) ||
                 !countryValue.equals(countryTv.getText().toString()) ||
                   !provinceValue.equals(provinceTv.getText().toString()) ||
                    !cityValue.equals(cityTv.getText().toString()) ||
                       !clientNameValue.equals(clientNameTv.getText().toString()) ||
                          !addressValue.equals(addressTv.getText().toString()) ||
                             !zipCodeValue.equals(zipCodeTv.getText().toString()) ||
                                 !taxesValue.equals(taxesTv.getText().toString()) ||
                                     !invoiceValue.equals(invoiceTv.getText().toString()) ||
                                          !beizhuValue.equals(beizhuEt.getText().toString())){
            return true;
        }else{
            return false;
        }
    }

    public void startEditActivity(String type,String title,String content,int requestCode){
        Intent intent2 = new Intent(MyClientUpdateActivity.this, EditValueActivity.class);
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
                    abbreviationTv.setText(result);
                    break;
                case 1:
                    mobileTv.setText(result);
                    break;
                case 2:
                    faxTv.setText(result);
                    break;
                case 3:
                    addressTv.setText(result);
                    break;
                case 4:
                    zipCodeTv.setText(result);
                    break;
                case 5:
                    invoiceTv.setText(result);
                    break;
            }
        }
    }

    public void sendMsg(int flag){
        Message msg = new Message();
        msg.what = flag;
        handler.sendMessage(msg);
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
                if (intValue == 0) {//类型
                    custType = custSelectVo.getData().getCustType().get(i);
                    customerCategoryTv.setText(adapter.getAll().get(i));
                    customerCategoryTv.setTextColor(Color.parseColor("#666666"));
                    pop.dismiss();
                }
                if (intValue == 1) {//国家
                    region = custSelectVo.getData().getRegion().get(i);
                    countryTv.setText(adapter.getAll().get(i));
                    countryTv.setTextColor(Color.parseColor("#666666"));
                    pop.dismiss();
                    //modidied by qianghe on 2017/10/11 begin
                    if(countryTv.getText().equals("中国")){
                        provinceLinear.setVisibility(View.VISIBLE);
                        cityLinear.setVisibility(View.VISIBLE);
                    }else{
                        provinceLinear.setVisibility(View.GONE);
                        cityLinear.setVisibility(View.GONE);
                    }
                    //modidied by qianghe on 2017/10/11 end
                }
                if (intValue == 2) {//省份
                    provinceTv.setText(adapter.getAll().get(i));
                    provinceTv.setTextColor(Color.parseColor("#666666"));
                    cateList = custSelectVo.getData().getRegion().get(0).getCateList().get(i);
                    //如果用户修改了省份，那么同样要修改城市
                    isUpdate = true;
                    pop.dismiss();
                }
                if (intValue == 3) {//城市
                    city = cateList.getCateList().get(i);
                    cityTv.setText(adapter.getAll().get(i));
                    cityTv.setTextColor(Color.parseColor("#666666"));
                    //如果用户修改了省份，那么同样要修改城市
                    isUpdate = false;
                    pop.dismiss();
                }
                if (intValue == 4) {
                    web = custSelectVo.getData().getWeb().get(i);
                    taxesTv.setText(adapter.getAll().get(i));
                    taxesTv.setTextColor(Color.parseColor("#666666"));
                    pop.dismiss();
                }
            }
        });
    }

    public boolean checkInput() {
        if (customer != null) {
            if (customer.getData().getCusttype() == null || customer.getData().getCusttype().equals("")) {
                if (custType == null) {
                    ToastUtil.showToast("请选择客户类型");
                    return false;
                }
            }
            if (customer.getData().getCountry() == null || customer.getData().getCountry().equals("")) {
                if (region == null) {
                    ToastUtil.showToast("请选择国家");
                    return false;
                }
            }
            if (customer.getData().getProvince() == null || customer.getData().getProvince().equals("")) {
                if (countryTv.getText().equals("中国") && cateList == null) {
                    ToastUtil.showToast("请选择省份");
                    return false;
                }
            }

            if (isUpdate) {
                ToastUtil.showToast("请选择城市");
                return false;
            } else if (customer.getData().getCity() == null || customer.getData().getCity().equals("")) {
                if (countryTv.getText().equals("中国") && city == null) {
                    ToastUtil.showToast("请选择城市");
                    return false;
                }
            }

            if (customer.getData().getWeb() == null || customer.getData().getWeb().equals("")) {
                if (web == null) {
                    ToastUtil.showToast("请选择税种");
                    return false;
                }
            }
        }
        if (mobileTv.getText().toString().trim().equals("") || mobileTv.getText().toString().trim()
                .length() < 11) {
            ToastUtil.showToast("请输入正确电话号码");
            return false;
        }
        if (!AccountValidatorUtil.isMobile(mobileTv.getText().toString().trim())) {
            ToastUtil.showToast("请输入正确电话号码");
            return false;
        }
        if (clientNameTv.getText().toString().trim().equals("")) {
            ToastUtil.showToast("请请输入客户名称");
            return false;
        }
        if (addressTv.getText().toString().trim().equals("")) {
            ToastUtil.showToast("请请输入详细地址");
            return false;
        }
        return true;
    }

    public void setEditTextVaule(String string, EditText textView) {
        if (string != null && !string.equals("")) {
            textView.setText(string);
            textView.setTextColor(Color.parseColor("#666666"));
        } else {
            textView.setText("");
        }
    }

    public void setTextViewVaule(String string, TextView textView) {
        if (string != null && !string.equals("")) {
            textView.setText(string);
            textView.setTextColor(Color.parseColor("#666666"));
        } else {
            textView.setText("");
        }
    }


    public void updateData(ClientVo customer) {

        String custtypeStr = ""; //客户类型
        String countryStr = "";//国家
        String provinceStr = "";//省份
        String cityStr = "";//城市
        String webStr = "";//税种

        if (customer != null) {
            if (custType == null)
                custtypeStr = customer.getData().getCusttype();
            else
                custtypeStr = custType.getCodeid();
            if (region == null)
                countryStr = customer.getData().getCountry();
            else
                countryStr = region.getCategoryno();
            if (cateList == null)
                provinceStr = customer.getData().getProvince();
            else
                provinceStr = cateList.getCategoryno();
            if (city == null)
                cityStr = customer.getData().getCity();
            else
                cityStr = city.getCategoryno();
            if (web == null)
                webStr = customer.getData().getWeb();
            else
                webStr = web.getCodeid();
        }
        String json = "";
        if(countryTv.getText().equals("中国")){
            String json_China = new Gson().toJson(new AddMyClientReq(
                    customer.getData().getCustid(),
                    clientNameTv.getText().toString().trim(),
                    addressTv.getText().toString().trim(),
                    mobileTv.getText().toString().trim(),
                    custtypeStr,
                    zipCodeTv.getText().toString().trim(),
                    webStr,
                    Config.USERID,
                    Config.USERID,
                    abbreviationTv.getText().toString().trim(),
                    faxTv.getText().toString().trim(),
                    countryStr,
                    provinceStr,
                    cityStr,
                    invoiceTv.getText().toString().trim(),
                    beizhuEt.getText().toString().trim()));
            json = json_China;
        }else {
            String json_Overseas = new Gson().toJson(new AddMyClientReq(
                    customer.getData().getCustid(),
                    clientNameTv.getText().toString().trim(),
                    addressTv.getText().toString().trim(),
                    mobileTv.getText().toString().trim(),
                    custtypeStr,
                    zipCodeTv.getText().toString().trim(),
                    webStr,
                    Config.USERID,
                    Config.USERID,
                    abbreviationTv.getText().toString().trim(),
                    faxTv.getText().toString().trim(),
                    countryStr,
                    null,
                    null,
                    invoiceTv.getText().toString().trim(),
                    beizhuEt.getText().toString().trim()));
            json = json_Overseas;
        }

        OkHttpUtils
                .postString()
                .url(Config.modifyCust)
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
                                //mLoading.dismiss();
                                sendMsg(SAVEDATA_HIDE);
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                Log.d("testlog","response is: " + response);
                                sendMsg(SAVEDATA_HIDE);
                                try {
                                    JSONObject json = new JSONObject(response);
                                    if (json.getBoolean("success")) {
                                        ToastUtil.showToast("保存成功");
                                        finish();
                                    } else {
                                        ToastUtil.showToast("保存失败");
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                //mLoading.dismiss();
                            }
                        }
                );
    }

    //查客户详细信息
    public void inquireData(Long custid) {
        OkHttpUtils
                .post()
                .url(Config.getCurrInfo)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .addParams("custId", custid + "")
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                try {
                                    customer = GjsonUtil.parseJsonWithGson(response, ClientVo.class);
                                    initViewData();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                );
    }

    public void initViewData() {
        setTextViewVaule(CustSelectUtils.getCustTypeName(custSelectVo, customer.getData().getCusttype()), customerCategoryTv);
        customerCategoryValue = customerCategoryTv.getText().toString().trim();

        setTextViewVaule(customer.getData().getCustname(), clientNameTv);
        clientNameValue = clientNameTv.getText().toString().trim();

        setTextViewVaule(customer.getData().getShortname(), abbreviationTv);
        abbreviationValue = abbreviationTv.getText().toString().trim();

        setTextViewVaule(customer.getData().getCusttel(), mobileTv);
        mobileValue = mobileTv.getText().toString().trim();

        setTextViewVaule(customer.getData().getFax(), faxTv);
        faxValue = faxTv.getText().toString().trim();

        String countryNameStr = CustSelectUtils.getCountryName(custSelectVo, customer.getData()
                .getCountry());
        setTextViewVaule(countryNameStr, countryTv);
        countryValue = countryTv.getText().toString().trim();

        if(countryNameStr.equals("中国")){
            provinceTv.setVisibility(View.VISIBLE);
            cityTv.setVisibility(View.VISIBLE);
            setTextViewVaule(CustSelectUtils.getProvinceName(custSelectVo, customer.getData().getCountry(),
                    customer.getData().getProvince()),
                    provinceTv);
            setTextViewVaule(CustSelectUtils.getCityName(custSelectVo, customer.getData().getCountry(),
                    customer.getData().getProvince(), customer.getData().getCity()), cityTv);
        }else{
            provinceTv.setVisibility(View.GONE);
            cityTv.setVisibility(View.GONE);
        }
        provinceValue = provinceTv.getText().toString().trim();
        cityValue = cityTv.getText().toString().trim();

        setTextViewVaule(customer.getData().getCustaddress(), addressTv);
        addressValue = addressTv.getText().toString().trim();

        setTextViewVaule(customer.getData().getZipcode(), zipCodeTv);
        zipCodeValue = zipCodeTv.getText().toString().trim();

        setTextViewVaule(CustSelectUtils.getWebName(custSelectVo, customer.getData().getWeb()), taxesTv);
        taxesValue = taxesTv.getText().toString().trim();

        setTextViewVaule(customer.getData().getMakeup(), invoiceTv);
        invoiceValue = invoiceTv.getText().toString().trim();

        //备注
        setEditTextVaule(customer.getData().getSummary(), beizhuEt);
        beizhuValue = beizhuEt.getText().toString().trim();

        mLoading.dismiss();
    }

    // 查新增客户的缺省值 //查完后查客户的信息
    public void getData() {
        OkHttpUtils
                .post()
                .url(Config.getCustSelect)
                .addParams("userId", Config.USERID + "")
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                if(mLoading.isShowing()) mLoading.dismiss();
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                if(mLoading.isShowing()) mLoading.dismiss();
                                try {
                                    custSelectVo = GjsonUtil.parseJsonWithGson(response, CustSelectVo.class);
                                    inquireData(custid);
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
