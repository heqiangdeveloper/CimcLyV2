package com.cimcitech.cimcly.activity.home.quoted_price;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.adapter.PopupWindowAdapter;
import com.cimcitech.cimcly.bean.opport_unit.OpportUnitInfoVo;
import com.cimcitech.cimcly.bean.quoted_price.GetChassisVo;
import com.cimcitech.cimcly.bean.quoted_price.QuotedPriceDetailReq;
import com.cimcitech.cimcly.bean.quoted_price.QuotedPriceDetailVo;
import com.cimcitech.cimcly.utils.Config;
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

public class QuotedPriceAddActivity extends BaseActivity {
    @Bind(R.id.cust_name_tv)
    TextView custNameTv;
    @Bind(R.id.quote_stand_price_tv)
    TextView quoteStandPriceTv;
    @Bind(R.id.protocol_price_tv)
    EditText protocolPriceTv;
    @Bind(R.id.chassis_model_tv)
    EditText chassisModelTv;
    @Bind(R.id.quote_car_type_tv)
    TextView quoteCarTypeTv;
    @Bind(R.id.quote_price_tv)
    TextView quotePriceTv;
    @Bind(R.id.isbring_chassis_tv)
    TextView isbringChassisTv;
    @Bind(R.id.deposit_tv)
    TextView depositTv;
    @Bind(R.id.textView1)
    TextView textView1;
    @Bind(R.id.textView2)
    TextView textView2;
    @Bind(R.id.textView3)
    TextView textView3;
    @Bind(R.id.textView4)
    TextView textView4;
    @Bind(R.id.imageView1)
    ImageView imageView1;
    @Bind(R.id.imageView2)
    ImageView imageView2;
    @Bind(R.id.imageView3)
    ImageView imageView3;
    @Bind(R.id.imageView4)
    ImageView imageView4;
    @Bind(R.id.listContent1)
    ListView listContent1;
    @Bind(R.id.listContent2)
    ListView listContent2;
    @Bind(R.id.listContent3)
    ListView listContent3;
    @Bind(R.id.listContent4)
    ListView listContent4;
    @Bind(R.id.save_bt)
    Button saveBt;
    @Bind(R.id.more_tv)
    TextView more_Tv;
    @Bind(R.id.title_ll)
    LinearLayout title_Ll;
    @Bind(R.id.titleName_tv)
    TextView titleName_Tv;
    @Bind(R.id.back_iv)
    ImageView back_Iv;

    private OpportUnitInfoVo infoVo; //意向详情传过来的

    private PopupWindow pop;
    private String isbringchassis;
    private QuotedPriceDetailVo quotedPriceDetailVo;
    private GetChassisVo getChassisVo;

    //用来提交请求过去的List
    List<QuotedPriceDetailReq.QuoteDetailListBean> quoteDetailListBeen = new ArrayList<>();

    // adapter
    private OptionalConfigurationAdapter optionalAdapter;
    private ChassisCharacteristicsAdapter chassisAdapter;
    private PatternRequirementsAdapter patternAdapter;
    private SpecialRequirementsAdapter specialAdapter;

    //底盘特性 list
    private List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean>
            chassisModels = new ArrayList<>();

    //图案要求 list
    private List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean>
            patternModels = new ArrayList<>();

    //选装配置 list
    private List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean>
            optionalModels = new ArrayList<>();

    //特殊要求 list
    private List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean>
            specialModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quoted_price_add2);
        ButterKnife.bind(this);
        initTitle();
        infoVo = (OpportUnitInfoVo) this.getIntent().getSerializableExtra("infoVo");
        mLoading.show();
        getIntentionTrackData();
    }

    public void initTitle(){
        more_Tv.setVisibility(View.GONE);
        title_Ll.setVisibility(View.GONE);
        titleName_Tv.setText("新增报价单");
    }

    @OnClick({R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4,
            R.id.back_iv, R.id.isbring_chassis_tv, R.id.save_bt})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.textView1:
                setImageViewShow(imageView1);
                setListViewShow(listContent1);
                break;
            case R.id.textView2:
                setImageViewShow(imageView2);
                setListViewShow(listContent2);
                break;
            case R.id.textView3:
                setImageViewShow(imageView3);
                setListViewShow(listContent3);
                break;
            case R.id.textView4:
                setImageViewShow(imageView4);
                setListViewShow(listContent4);
                break;
            case R.id.back_iv:
                finish();
                break;
            case R.id.isbring_chassis_tv:
                //才可以点击
                if (null != getChassisVo && getChassisVo.isSuccess()) {
                    List<String> list = new ArrayList<>();
                    for (int i = 0; i < getChassisVo.getData().size(); i++) {
                        list.add(getChassisVo.getData().get(i).getChassisDesc());
                    }
                    showContactUsPopWin(QuotedPriceAddActivity.this, "选择底盘来源", list);
                    pop.showAtLocation(view, Gravity.CENTER, 0, 0);
                }
                break;
            case R.id.save_bt:
                mLoading.show();
                quoteDetailListBeen.clear();

                for (int i = 0; i < patternAdapter.text.length; i++) {
                    if (patternAdapter.text[i] != null)
                        Log.e("i========>", i + "");
                    Log.e("i===value=====>", patternAdapter.text[i] + "");
                }

                /** chassisAdapter 底盘特性 **/
                for (int i = 0; i < chassisAdapter.getAll().size(); i++) {
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean
                            model = chassisAdapter.getAll().get(i);
                    //判断必输项
                    if (model.getIsrequired().equals("T"))
                        if (chassisAdapter.text[i] == null) {
                            ToastUtil.showToast("请输入底盘特性必输项");
                            if(mLoading.isShowing()) mLoading.dismiss();
                            return;
                        }
                    QuotedPriceDetailReq.QuoteDetailListBean bean = new QuotedPriceDetailReq.QuoteDetailListBean();
                    bean.setQuotekey(model.getFeaturevalues());
                    bean.setQuotevalue(chassisAdapter.text[i] != null ? chassisAdapter.text[i] : "");
                    quoteDetailListBeen.add(bean);
                }
                /** patternAdapter 图案要求 **/
                for (int i = 0; i < patternAdapter.getAll().size(); i++) {
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean
                            model = patternAdapter.getAll().get(i);
                    //判断必输项
                    if (model.getIsrequired().equals("T"))
                        if (patternAdapter.text[i] == null) {
                            ToastUtil.showToast("请输入图案要求必输项");
                            if(mLoading.isShowing()) mLoading.dismiss();
                            return;
                        }
                    QuotedPriceDetailReq.QuoteDetailListBean bean = new QuotedPriceDetailReq.QuoteDetailListBean();
                    bean.setQuotekey(model.getFeaturevalues());
                    bean.setQuotevalue(patternAdapter.text[i] != null ? patternAdapter.text[i] : "");
                    quoteDetailListBeen.add(bean);
                }
                /** optionalAdapter 选配装置 **/
                for (int i = 0; i < optionalAdapter.getAll().size(); i++) {
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean
                            model = optionalAdapter.getAll().get(i);
                    //判断必输项
                    if (model.getIsrequired().equals("T"))
                        if (optionalAdapter.text[i] == null) {
                            ToastUtil.showToast("请输入选配装置必输项");
                            if(mLoading.isShowing()) mLoading.dismiss();
                            return;
                        }
                    QuotedPriceDetailReq.QuoteDetailListBean bean = new QuotedPriceDetailReq.QuoteDetailListBean();
                    bean.setQuotekey(model.getFeaturevalues());
                    bean.setQuotevalue(optionalAdapter.text[i] != null ? optionalAdapter.text[i] : "");
                    quoteDetailListBeen.add(bean);
                }

                /** specialAdapter 特殊要求 **/
                for (int i = 0; i < specialAdapter.getAll().size(); i++) {
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean
                            model = specialAdapter.getAll().get(i);
                    //判断必输项
                    if (model.getIsrequired().equals("T"))
                        if (specialAdapter.text[i] == null) {
                            ToastUtil.showToast("请输入特殊要求必输项");
                            if(mLoading.isShowing()) mLoading.dismiss();
                            return;
                        }
                    QuotedPriceDetailReq.QuoteDetailListBean bean = new QuotedPriceDetailReq.QuoteDetailListBean();
                    bean.setQuotekey(model.getFeaturevalues());
                    bean.setQuotevalue(specialAdapter.text[i] != null ? specialAdapter.text[i] : "");
                    quoteDetailListBeen.add(bean);
                }
                if (chassisModelTv.getText().toString().trim().equals("")) {
                    ToastUtil.showToast("请输入底盘型号");
                    if(mLoading.isShowing()) mLoading.dismiss();
                    return;
                }
                if (protocolPriceTv.getText().toString().trim().equals("")) {
                    ToastUtil.showToast("请输入建议价格");
                    if(mLoading.isShowing()) mLoading.dismiss();
                    return;
                }
                if(mLoading.isShowing()) mLoading.dismiss();
                submitIntentionTrackData();
                break;
        }
    }

    public void setListViewShow(ListView listView) {
        listContent1.setVisibility(View.GONE);
        listContent2.setVisibility(View.GONE);
        listContent3.setVisibility(View.GONE);
        listContent4.setVisibility(View.GONE);
        listView.setVisibility(View.VISIBLE);
    }

    public void setImageViewShow(ImageView imageView) {
        imageView1.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.VISIBLE);
    }

    public void getIntentionTrackData() {
        int i = infoVo.getData().getCustid();
        int j = infoVo.getData().getOpportid();
        String s = infoVo.getData().getProductid();
        OkHttpUtils
                .post()
                .url(Config.getNewQuoteBase)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .addParams("custId", infoVo.getData().getCustid() + "")
                .addParams("opportId", infoVo.getData().getOpportid() + "")
                .addParams("productId", infoVo.getData().getProductid())
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
                                try {
                                    quotedPriceDetailVo = GjsonUtil.parseJsonWithGson(response, QuotedPriceDetailVo.class);
                                    if (quotedPriceDetailVo != null)
                                        if (quotedPriceDetailVo.isSuccess()) {
                                            custNameTv.setText(quotedPriceDetailVo.getData().getCustName() != null ?
                                                    quotedPriceDetailVo.getData().getCustName() : "");
                                            quoteCarTypeTv.setText(quotedPriceDetailVo.getData().getQuoteCarType() != null ?
                                                    quotedPriceDetailVo.getData().getQuoteCarType() : "");
                                            quoteStandPriceTv.setText(quotedPriceDetailVo.getData().getQuotestandprice() != null ?
                                                    quotedPriceDetailVo.getData().getQuotestandprice() : "");
                                            quotePriceTv.setText(quotedPriceDetailVo.getData().getQuoteprice() != null ?
                                                    quotedPriceDetailVo.getData().getQuoteprice() : "");
                                            protocolPriceTv.setText(quotedPriceDetailVo.getData().getProtocolprice() != null ?
                                                    quotedPriceDetailVo.getData().getProtocolprice() : "");
                                            chassisModelTv.setText(quotedPriceDetailVo.getData().getChassismodel() != null ?
                                                    quotedPriceDetailVo.getData().getChassismodel() + "" : "");
                                            if (quotedPriceDetailVo.getData().getIsbringchassis().equals("Y")) {
                                                isbringChassisTv.setText("客户自带");
                                                depositTv.setText("20000");
                                                isbringchassis = "Y";
                                            } else {
                                                isbringChassisTv.setText("公司采购");
                                                depositTv.setText("40000");
                                                isbringchassis = "N";
                                            }
                                            //底盘属性list
                                            if (quotedPriceDetailVo.getData().getViewLabelList().size() > 0)
                                                for (int i = 0; i < quotedPriceDetailVo.getData().getViewLabelList().size(); i++)
                                                    if (quotedPriceDetailVo.getData().getViewLabelList().get(i).getViewLabel().equals("QP09"))
                                                        chassisModels = quotedPriceDetailVo.getData().getViewLabelList().get(i)
                                                                .getModelFeatureDetailList();

                                            //图案要求list
                                            if (quotedPriceDetailVo.getData().getViewLabelList().size() > 0)
                                                for (int i = 0; i < quotedPriceDetailVo.getData().getViewLabelList().size(); i++)
                                                    if (quotedPriceDetailVo.getData().getViewLabelList().get(i).getViewLabel().equals("QP08"))
                                                        patternModels = quotedPriceDetailVo.getData().getViewLabelList().get(i)
                                                                .getModelFeatureDetailList();

                                            //选装配置list
                                            if (quotedPriceDetailVo.getData().getViewLabelList().size() > 0)
                                                for (int i = 0; i < quotedPriceDetailVo.getData().getViewLabelList().size(); i++)
                                                    if (quotedPriceDetailVo.getData().getViewLabelList().get(i).getViewLabel().equals("QP05"))
                                                        optionalModels = quotedPriceDetailVo.getData().getViewLabelList().get(i)
                                                                .getModelFeatureDetailList();

                                            //特殊要求list
                                            if (quotedPriceDetailVo.getData().getViewLabelList().size() > 0)
                                                for (int i = 0; i < quotedPriceDetailVo.getData().getViewLabelList().size(); i++)
                                                    if (quotedPriceDetailVo.getData().getViewLabelList().get(i).getViewLabel().equals("QP06"))
                                                        specialModels = quotedPriceDetailVo.getData().getViewLabelList().get(i)
                                                                .getModelFeatureDetailList();

                                            optionalAdapter = new OptionalConfigurationAdapter(QuotedPriceAddActivity.this,
                                                    optionalModels);
                                            chassisAdapter = new ChassisCharacteristicsAdapter(QuotedPriceAddActivity.this,
                                                    chassisModels);
                                            patternAdapter = new PatternRequirementsAdapter(QuotedPriceAddActivity.this,
                                                    patternModels);
                                            specialAdapter = new SpecialRequirementsAdapter(QuotedPriceAddActivity.this,
                                                    specialModels);

                                            listContent1.setAdapter(chassisAdapter);
                                            listContent2.setAdapter(patternAdapter);
                                            listContent3.setAdapter(optionalAdapter);
                                            listContent4.setAdapter(specialAdapter);

                                            listContent1.setVisibility(View.VISIBLE);
                                            //获取底盘来源筛选值
                                            getChassisData();
                                        } else {
                                            ToastUtil.showToast("不存在该车型的报价单模板");
                                            saveBt.setVisibility(View.GONE);
                                            back_Iv.callOnClick();
                                        }
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

    //底盘来源选择项
    public void getChassisData() {
        OkHttpUtils
                .post()
                .url(Config.getChassis)
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
                                //ToastUtil.showToast(response);
                                try {
                                    getChassisVo = GjsonUtil.parseJsonWithGson(response, GetChassisVo.class);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                );
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
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                GetChassisVo.DataBean dataBean = getChassisVo.getData().get(position);
                isbringChassisTv.setText(dataBean.getChassisDesc());
                depositTv.setText(dataBean.getDeposit() + "");
                isbringchassis = dataBean.getIsBringChassis();
                pop.dismiss();
            }
        });
    }

    public void submitIntentionTrackData() {

        //底盘型号
        String chassismodel = chassisModelTv.getText().toString().trim();
        //意向ID
        String quoteopport = quotedPriceDetailVo.getData().getQuoteopport();
        //标配价格
        double quotestandprice = Double.parseDouble(quoteStandPriceTv.getText().toString().trim());
        //销售员建议价格
        double protocolprice = !protocolPriceTv.getText().toString().trim().equals("") ?
                Double.parseDouble(protocolPriceTv.getText().toString().trim()) : 0;
        //客户选配价格
        double quoteprice = Double.parseDouble(quotePriceTv.getText().toString().trim());
        //
        String baseversion = quotedPriceDetailVo.getData().getBaseversion();
        //
        String version = quotedPriceDetailVo.getData().getVersion();
        //当前用户
        String creater = Config.USERID + "";
        //定金
        int deposit = Integer.parseInt(depositTv.getText().toString().trim());

        String json =
                new Gson().toJson(new QuotedPriceDetailReq(
                        chassismodel,
                        quoteopport,
                        quotestandprice,
                        protocolprice,
                        quoteprice,
                        baseversion,
                        version,
                        creater,
                        deposit,
                        isbringchassis,
                        quoteDetailListBeen
                ));

        OkHttpUtils
                .postString()
                .url(Config.addQuoteBase)
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
                                        ToastUtil.showToast("添加成功");
                                        finish();
                                    } else {
                                        ToastUtil.showToast("添加失败");
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                mLoading.dismiss();
                            }
                        }
                );
    }

    /**
     * OptionalConfigurationAdapter
     */
    public class OptionalConfigurationAdapter extends BaseAdapter {

        private List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean> data;
        private QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean model;
        private LayoutInflater inflater;
        private int index = -1;  //记录选中的位置
        private String text[]; //记录输入的值
        private Context context;
        private myWatcher mWatcher;
        private PopupWindow pop;

        public OptionalConfigurationAdapter(Context context, List<QuotedPriceDetailVo.DataBean.
                ViewLabelListBean.ModelFeatureDetailListBean> data) {
            this.context = context;
            inflater = LayoutInflater.from(context);
            this.data = data;
            text = new String[data.size()];
            initTextData(); //初始化text数据
        }

        private void initTextData() {
            for (int i = 0; i < data.size(); i++) {
                QuotedPriceDetailVo.DataBean.
                        ViewLabelListBean.ModelFeatureDetailListBean item = data.get(i);
                if (item.getIntype().equals("2")) {
                    if (item.getQuoteValue() != null) {
                        for (int j = 0; j < item.getPriceFeatureDetailList().size(); j++)
                            if (item.getQuoteValue().equals(item.getPriceFeatureDetailList().get(j).getEnumerationvalues()))
                            /**这里给默认的文本框value 因为给了默认的显示值**/
                                this.text[i] = item.getPriceFeatureDetailList().get(j).getEnumerationvalues();
                    } else
                        this.text[i] = "";
                } else
                    this.text[i] = "";

            }
        }

        public List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean> getAll() {
            return data;
        }

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(final int position, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder = null;
            QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean item = data.get(position);
            if (viewHolder == null) {
                view = inflater.inflate(R.layout.quoted_list_item_view, null);
                viewHolder = new ViewHolder(view);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }

            if (item.getIntype().equals("2")) {
                //如果是2则输入的隐藏    tv显示
                viewHolder.descriptionTvTv.setText(item.getDescription() + "：");
                viewHolder.inputTypeTv.setVisibility(View.VISIBLE);
                viewHolder.inputTypeEt.setVisibility(View.GONE);

                if (item.getQuoteValue() != null) {
                    for (int i = 0; i < item.getPriceFeatureDetailList().size(); i++) {
                        if (text[position] != null && this.text[position].equals(item.getPriceFeatureDetailList().get(i).getEnumerationvalues())) {
                            /**这里给默认的文本框value 因为给了默认的显示值**/
                            viewHolder.quoteValueTvTv.setText(item.getPriceFeatureDetailList().get(i).getEnumerationdesc());
                            this.text[position] = item.getPriceFeatureDetailList().get(i).getEnumerationvalues();
                        }
                    }
                } else {
                    viewHolder.quoteValueTvTv.setText("");
                    this.text[position] = "";
                }
                viewHolder.quoteValueTvTv.setOnClickListener(new onClick(position, viewHolder, text));
            } else {
                /**显示小红星 * 必输入项***/
                if (item.getIsrequired().equals("T"))
                    viewHolder.redTv.setVisibility(View.VISIBLE);
                else
                    viewHolder.redTv.setVisibility(View.GONE);
                /*****/
                //et 显示
                /**Quotestatus两个都不像的话不让输入**/
                viewHolder.descriptionEtTv.setText(item.getDescription() + "：");
                viewHolder.inputTypeEt.setVisibility(View.VISIBLE);
                viewHolder.inputTypeTv.setVisibility(View.GONE);
                viewHolder.quoteValueEtTv.setOnTouchListener(new View.OnTouchListener() {

                    @SuppressLint("ClickableViewAccessibility")
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        // TODO Auto-generated method stub
                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            index = position;
                        }
                        return false;
                    }
                });
                viewHolder.quoteValueEtTv.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    //设置焦点监听，当获取到焦点的时候才给它设置内容变化监听解决卡的问题

                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        EditText et = (EditText) v;
                        if (mWatcher == null) {
                            mWatcher = new myWatcher();
                        }
                        if (hasFocus) {
                            //设置edittext内容监听
                            et.addTextChangedListener(mWatcher);
                        } else {
                            et.removeTextChangedListener(mWatcher);
                        }

                    }
                });
                //防止点击以后弹出键盘，重新getview导致的焦点丢失
                viewHolder.quoteValueEtTv.clearFocus();
                if (index != -1 && index == position) {
                    // 如果当前的行下标和点击事件中保存的index一致，手动为EditText设置焦点。
                    viewHolder.quoteValueEtTv.requestFocus();
                }
                //这一定要放在clearFocus()之后，否则最后输入的内容在拉回来时会消失
                viewHolder.quoteValueEtTv.setText(text[position]);
                viewHolder.quoteValueEtTv.setSelection(viewHolder.quoteValueEtTv.getText().length());
            }
            return view;
        }

        class myWatcher implements TextWatcher {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                //为输入的位置内容设置数组管理器，防止item重用机制导致的上下内容一样的问题
                text[index] = editable.toString();
            }
        }

        public void showContactUsPopWin(Context context, String title, List<String> list, final ViewHolder viewHolder,
                                        final String text[], final int index) {
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
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean.
                            PriceFeatureDetailListBean item = model.getPriceFeatureDetailList().get(position);
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean.PriceFeatureDetailListBean
                            priceFeatureDetailListBean = new QuotedPriceDetailVo.DataBean.
                            ViewLabelListBean.ModelFeatureDetailListBean.PriceFeatureDetailListBean();
                    if (!viewHolder.quoteValueTvTv.getText().toString().trim().equals(""))
                        for (int i = 0; i < model.getPriceFeatureDetailList().size(); i++)
                            if (viewHolder.quoteValueTvTv.getText().toString().trim().equals(
                                    model.getPriceFeatureDetailList().get(i).getEnumerationdesc().toString().trim()))
                                priceFeatureDetailListBean = model.getPriceFeatureDetailList().get(i);
                    viewHolder.quoteValueTvTv.setText(item.getEnumerationdesc());
                    //现在选的价格
                    int price = item.getSpread() != null ? Integer.parseInt(item.getSpread()) : 0;
                    //原来的价格
                    int oldPrice = priceFeatureDetailListBean.getSpread() != null ? Integer.parseInt(priceFeatureDetailListBean.getSpread()) : 0;
                    //新的价格
                    double newPrice = !quotePriceTv.getText().toString().trim().equals("") ?
                            Double.parseDouble(quotePriceTv.getText().toString().trim()) + (price - oldPrice)
                            : price - oldPrice;
                    quotePriceTv.setText(newPrice + "");
                    /**** 点击选择的第二层values ****/
                    text[index] = item.getEnumerationvalues();
                    pop.dismiss();
                }
            });
        }

        class onClick implements View.OnClickListener {

            private int position;
            private ViewHolder viewHolder;
            private String text[];

            public onClick(int position, ViewHolder viewHolder, String text[]) {
                this.position = position;
                this.viewHolder = viewHolder;
                this.text = text;
            }

            @Override
            public void onClick(View view) {
                model = data.get(position);
                List<String> list = new ArrayList<>();
                for (int i = 0; i < model.getPriceFeatureDetailList().size(); i++)
                    list.add(model.getPriceFeatureDetailList().get(i).getEnumerationdesc());
                showContactUsPopWin(context, "选择" + model.getDescription(), list, viewHolder, text, position);
                pop.showAtLocation(view, Gravity.CENTER, 0, 0);
            }
        }

        class ViewHolder {
            @Bind(R.id.description_et_tv)
            TextView descriptionEtTv;
            @Bind(R.id.red_tv)
            TextView redTv;
            @Bind(R.id.quoteValue_et_tv)
            EditText quoteValueEtTv;
            @Bind(R.id.input_type_et)
            LinearLayout inputTypeEt;
            @Bind(R.id.description_tv_tv)
            TextView descriptionTvTv;
            @Bind(R.id.quoteValue_tv_tv)
            TextView quoteValueTvTv;
            @Bind(R.id.input_type_tv)
            LinearLayout inputTypeTv;

            ViewHolder(View view) {
                ButterKnife.bind(this, view);
            }
        }
    }

    /**
     * ChassisCharacteristicsAdapter
     */
    public class ChassisCharacteristicsAdapter extends BaseAdapter {

        private List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean> data;
        private QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean model;
        private LayoutInflater inflater;
        private int index = -1;  //记录选中的位置
        private String text[]; //记录输入的值
        private Context context;
        private myWatcher mWatcher;
        private PopupWindow pop;

        public ChassisCharacteristicsAdapter(Context context, List<QuotedPriceDetailVo.DataBean.
                ViewLabelListBean.ModelFeatureDetailListBean> data) {
            this.context = context;
            inflater = LayoutInflater.from(context);
            this.data = data;
            text = new String[data.size()];
        }

        public List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean> getAll() {
            return data;
        }

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(final int position, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder = null;
            QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean item = data.get(position);
            if (viewHolder == null) {
                view = inflater.inflate(R.layout.quoted_list_item_view, null);
                viewHolder = new ViewHolder(view);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }

            if (item.getIntype().equals("2")) {
                //如果是2则输入的隐藏    tv显示
                viewHolder.descriptionTvTv.setText(item.getDescription() + "：");
                viewHolder.inputTypeTv.setVisibility(View.VISIBLE);
                viewHolder.inputTypeEt.setVisibility(View.GONE);

                if (item.getQuoteValue() != null) {
                    for (int i = 0; i < item.getPriceFeatureDetailList().size(); i++) {
                        if (text[position] != null && text[position].equals(item
                                .getPriceFeatureDetailList().get(i).getEnumerationvalues())) {
                            /**这里给默认的文本框value 因为给了默认的显示值**/
                            viewHolder.quoteValueTvTv.setText(item.getPriceFeatureDetailList().get(i).getEnumerationdesc());
                            text[position] = item.getPriceFeatureDetailList().get(i).getEnumerationvalues();
                        }
                    }
                } else {
                    viewHolder.quoteValueTvTv.setText("");
                    text[position] = "";
                }
                viewHolder.quoteValueTvTv.setOnClickListener(new onClick(position, viewHolder, text));
            } else {
                /**显示小红星 * 必输入项***/
                if (item.getIsrequired().equals("T"))
                    viewHolder.redTv.setVisibility(View.VISIBLE);
                else
                    viewHolder.redTv.setVisibility(View.GONE);
                /*****/
                //et 显示
                /**Quotestatus两个都不像的话不让输入**/
                viewHolder.descriptionEtTv.setText(item.getDescription() + "：");
                viewHolder.inputTypeEt.setVisibility(View.VISIBLE);
                viewHolder.inputTypeTv.setVisibility(View.GONE);
                viewHolder.quoteValueEtTv.setOnTouchListener(new View.OnTouchListener() {

                    @SuppressLint("ClickableViewAccessibility")
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        // TODO Auto-generated method stub
                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            index = position;
                        }
                        return false;
                    }
                });
                viewHolder.quoteValueEtTv.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    //设置焦点监听，当获取到焦点的时候才给它设置内容变化监听解决卡的问题

                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        EditText et = (EditText) v;
                        if (mWatcher == null) {
                            mWatcher = new myWatcher();
                        }
                        if (hasFocus) {
                            //设置edittext内容监听
                            et.addTextChangedListener(mWatcher);
                        } else {
                            et.removeTextChangedListener(mWatcher);
                        }

                    }
                });
                //防止点击以后弹出键盘，重新getview导致的焦点丢失
                viewHolder.quoteValueEtTv.clearFocus();
                if (index != -1 && index == position) {
                    // 如果当前的行下标和点击事件中保存的index一致，手动为EditText设置焦点。
                    viewHolder.quoteValueEtTv.requestFocus();
                }
                //这一定要放在clearFocus()之后，否则最后输入的内容在拉回来时会消失
                viewHolder.quoteValueEtTv.setText(text[position]);
                viewHolder.quoteValueEtTv.setSelection(viewHolder.quoteValueEtTv.getText().length());
            }
            return view;
        }

        class myWatcher implements TextWatcher {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                //为输入的位置内容设置数组管理器，防止item重用机制导致的上下内容一样的问题
                text[index] = editable.toString();
            }
        }

        public void showContactUsPopWin(Context context, String title, List<String> list, final ViewHolder viewHolder,
                                        final String text[], final int index) {
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
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean.
                            PriceFeatureDetailListBean item = model.getPriceFeatureDetailList().get(position);
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean.PriceFeatureDetailListBean
                            priceFeatureDetailListBean = new QuotedPriceDetailVo.DataBean.
                            ViewLabelListBean.ModelFeatureDetailListBean.PriceFeatureDetailListBean();
                    if (!viewHolder.quoteValueTvTv.getText().toString().trim().equals(""))
                        for (int i = 0; i < model.getPriceFeatureDetailList().size(); i++)
                            if (viewHolder.quoteValueTvTv.getText().toString().trim().equals(
                                    model.getPriceFeatureDetailList().get(i).getEnumerationdesc().toString().trim()))
                                priceFeatureDetailListBean = model.getPriceFeatureDetailList().get(i);
                    viewHolder.quoteValueTvTv.setText(item.getEnumerationdesc());
                    //现在选的价格
                    int price = item.getSpread() != null ? Integer.parseInt(item.getSpread()) : 0;
                    //原来的价格
                    int oldPrice = priceFeatureDetailListBean.getSpread() != null ? Integer.parseInt(priceFeatureDetailListBean.getSpread()) : 0;
                    //新的价格
                    double newPrice = !quotePriceTv.getText().toString().trim().equals("") ?
                            Double.parseDouble(quotePriceTv.getText().toString().trim()) + (price - oldPrice)
                            : price - oldPrice;
                    quotePriceTv.setText(newPrice + "");
                    /**** 点击选择的第二层values ****/
                    text[index] = item.getEnumerationvalues();
                    pop.dismiss();
                }
            });
        }

        class onClick implements View.OnClickListener {

            private int position;
            private ViewHolder viewHolder;
            private String text[];

            public onClick(int position, ViewHolder viewHolder, String text[]) {
                this.position = position;
                this.viewHolder = viewHolder;
                this.text = text;
            }

            @Override
            public void onClick(View view) {
                model = data.get(position);
                List<String> list = new ArrayList<>();
                for (int i = 0; i < model.getPriceFeatureDetailList().size(); i++)
                    list.add(model.getPriceFeatureDetailList().get(i).getEnumerationdesc());
                showContactUsPopWin(context, "选择" + model.getDescription(), list, viewHolder, text, position);
                pop.showAtLocation(view, Gravity.CENTER, 0, 0);
            }
        }

        class ViewHolder {
            @Bind(R.id.description_et_tv)
            TextView descriptionEtTv;
            @Bind(R.id.red_tv)
            TextView redTv;
            @Bind(R.id.quoteValue_et_tv)
            EditText quoteValueEtTv;
            @Bind(R.id.input_type_et)
            LinearLayout inputTypeEt;
            @Bind(R.id.description_tv_tv)
            TextView descriptionTvTv;
            @Bind(R.id.quoteValue_tv_tv)
            TextView quoteValueTvTv;
            @Bind(R.id.input_type_tv)
            LinearLayout inputTypeTv;

            ViewHolder(View view) {
                ButterKnife.bind(this, view);
            }
        }
    }

    /**
     * PatternRequirementsAdapter
     */

    public class PatternRequirementsAdapter extends BaseAdapter {

        private List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean> data;
        private QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean model;
        private LayoutInflater inflater;
        private int index = -1;  //记录选中的位置
        private String text[]; //记录输入的值
        private Context context;
        private myWatcher mWatcher;
        private PopupWindow pop;

        public PatternRequirementsAdapter(Context context, List<QuotedPriceDetailVo.DataBean.
                ViewLabelListBean.ModelFeatureDetailListBean> data) {
            this.context = context;
            inflater = LayoutInflater.from(context);
            this.data = data;
            text = new String[data.size()];
        }

        public List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean> getAll() {
            return data;
        }

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(final int position, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder = null;
            QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean item = data.get(position);
            if (viewHolder == null) {
                view = inflater.inflate(R.layout.quoted_list_item_view, null);
                viewHolder = new ViewHolder(view);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }

            if (item.getIntype().equals("2")) {
                //如果是2则输入的隐藏    tv显示
                viewHolder.descriptionTvTv.setText(item.getDescription() + "：");
                viewHolder.inputTypeTv.setVisibility(View.VISIBLE);
                viewHolder.inputTypeEt.setVisibility(View.GONE);

                if (item.getQuoteValue() != null) {
                    for (int i = 0; i < item.getPriceFeatureDetailList().size(); i++) {
                        if (text[position] != null && this.text[position].equals(item
                                .getPriceFeatureDetailList().get(i).getEnumerationvalues())) {
                            /**这里给默认的文本框value 因为给了默认的显示值**/
                            viewHolder.quoteValueTvTv.setText(item.getPriceFeatureDetailList().get(i).getEnumerationdesc());
                            text[position] = item.getPriceFeatureDetailList().get(i).getEnumerationvalues();
                        }
                    }
                } else {
                    viewHolder.quoteValueTvTv.setText("");
                    text[position] = "";
                }
                viewHolder.quoteValueTvTv.setOnClickListener(new onClick(position, viewHolder, text));
            } else {
                /**显示小红星 * 必输入项***/
                if (item.getIsrequired().equals("T"))
                    viewHolder.redTv.setVisibility(View.VISIBLE);
                else
                    viewHolder.redTv.setVisibility(View.GONE);
                /*****/
                //et 显示
                viewHolder.descriptionEtTv.setText(item.getDescription() + "：");
                viewHolder.inputTypeEt.setVisibility(View.VISIBLE);
                viewHolder.inputTypeTv.setVisibility(View.GONE);
                viewHolder.quoteValueEtTv.setOnTouchListener(new View.OnTouchListener() {

                    @SuppressLint("ClickableViewAccessibility")
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        // TODO Auto-generated method stub
                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            index = position;
                        }
                        return false;
                    }
                });
                viewHolder.quoteValueEtTv.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    //设置焦点监听，当获取到焦点的时候才给它设置内容变化监听解决卡的问题

                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        EditText et = (EditText) v;
                        if (mWatcher == null) {
                            mWatcher = new myWatcher();
                        }
                        if (hasFocus) {
                            //设置edittext内容监听
                            et.addTextChangedListener(mWatcher);
                        } else {
                            et.removeTextChangedListener(mWatcher);
                        }

                    }
                });
                //防止点击以后弹出键盘，重新getview导致的焦点丢失
                viewHolder.quoteValueEtTv.clearFocus();
                if (index != -1 && index == position) {
                    // 如果当前的行下标和点击事件中保存的index一致，手动为EditText设置焦点。
                    viewHolder.quoteValueEtTv.requestFocus();
                }
                //这一定要放在clearFocus()之后，否则最后输入的内容在拉回来时会消失
                viewHolder.quoteValueEtTv.setText(text[position]);
                viewHolder.quoteValueEtTv.setSelection(viewHolder.quoteValueEtTv.getText().length());
            }
            return view;
        }

        class myWatcher implements TextWatcher {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                //为输入的位置内容设置数组管理器，防止item重用机制导致的上下内容一样的问题
                text[index] = editable.toString();
            }
        }

        public void showContactUsPopWin(Context context, String title, List<String> list, final ViewHolder viewHolder,
                                        final String text[], final int index) {
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
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean.
                            PriceFeatureDetailListBean item = model.getPriceFeatureDetailList().get(position);
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean.PriceFeatureDetailListBean
                            priceFeatureDetailListBean = new QuotedPriceDetailVo.DataBean.
                            ViewLabelListBean.ModelFeatureDetailListBean.PriceFeatureDetailListBean();
                    if (!viewHolder.quoteValueTvTv.getText().toString().trim().equals(""))
                        for (int i = 0; i < model.getPriceFeatureDetailList().size(); i++)
                            if (viewHolder.quoteValueTvTv.getText().toString().trim().equals(
                                    model.getPriceFeatureDetailList().get(i).getEnumerationdesc().toString().trim()))
                                priceFeatureDetailListBean = model.getPriceFeatureDetailList().get(i);
                    viewHolder.quoteValueTvTv.setText(item.getEnumerationdesc());
                    //现在选的价格
                    int price = item.getSpread() != null ? Integer.parseInt(item.getSpread()) : 0;
                    //原来的价格
                    int oldPrice = priceFeatureDetailListBean.getSpread() != null ? Integer.parseInt(priceFeatureDetailListBean.getSpread()) : 0;
                    //新的价格
                    double newPrice = !quotePriceTv.getText().toString().trim().equals("") ?
                            Double.parseDouble(quotePriceTv.getText().toString().trim()) + (price - oldPrice)
                            : price - oldPrice;
                    quotePriceTv.setText(newPrice + "");
                    /**** 点击选择的第二层values ****/
                    text[index] = item.getEnumerationvalues();
                    pop.dismiss();
                }
            });
        }

        class onClick implements View.OnClickListener {

            private int position;
            private ViewHolder viewHolder;
            private String text[];

            public onClick(int position, ViewHolder viewHolder, String text[]) {
                this.position = position;
                this.viewHolder = viewHolder;
                this.text = text;
            }

            @Override
            public void onClick(View view) {
                model = data.get(position);
                List<String> list = new ArrayList<>();
                for (int i = 0; i < model.getPriceFeatureDetailList().size(); i++)
                    list.add(model.getPriceFeatureDetailList().get(i).getEnumerationdesc());
                showContactUsPopWin(context, "选择" + model.getDescription(), list, viewHolder, text, position);
                pop.showAtLocation(view, Gravity.CENTER, 0, 0);
            }

        }

        class ViewHolder {
            @Bind(R.id.description_et_tv)
            TextView descriptionEtTv;
            @Bind(R.id.red_tv)
            TextView redTv;
            @Bind(R.id.quoteValue_et_tv)
            EditText quoteValueEtTv;
            @Bind(R.id.input_type_et)
            LinearLayout inputTypeEt;
            @Bind(R.id.description_tv_tv)
            TextView descriptionTvTv;
            @Bind(R.id.quoteValue_tv_tv)
            TextView quoteValueTvTv;
            @Bind(R.id.input_type_tv)
            LinearLayout inputTypeTv;

            ViewHolder(View view) {
                ButterKnife.bind(this, view);
            }
        }
    }

    /**
     * SpecialRequirementsAdapter
     */

    public class SpecialRequirementsAdapter extends BaseAdapter {

        private List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean> data;
        private QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean model;
        private LayoutInflater inflater;
        private int index = -1;  //记录选中的位置
        private String text[]; //记录输入的值
        private Context context;
        private myWatcher mWatcher;
        private PopupWindow pop;

        public SpecialRequirementsAdapter(Context context, List<QuotedPriceDetailVo.DataBean.
                ViewLabelListBean.ModelFeatureDetailListBean> data) {
            this.context = context;
            inflater = LayoutInflater.from(context);
            this.data = data;
            text = new String[data.size()];
        }

        public List<QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean> getAll() {
            return data;
        }

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(final int position, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder = null;
            QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean item = data.get(position);
            if (viewHolder == null) {
                view = inflater.inflate(R.layout.quoted_list_item_view, null);
                viewHolder = new ViewHolder(view);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }

            if (item.getIntype().equals("2")) {
                //如果是2则输入的隐藏    tv显示
                viewHolder.descriptionTvTv.setText(item.getDescription() + "：");
                viewHolder.inputTypeTv.setVisibility(View.VISIBLE);
                viewHolder.inputTypeEt.setVisibility(View.GONE);

                if (item.getQuoteValue() != null) {
                    for (int i = 0; i < item.getPriceFeatureDetailList().size(); i++) {
                        if (text[position] != null && this.text[position].equals(item.getPriceFeatureDetailList().get(i).getEnumerationvalues())) {
                            /**这里给默认的文本框value 因为给了默认的显示值**/
                            viewHolder.quoteValueTvTv.setText(item.getPriceFeatureDetailList().get(i).getEnumerationdesc());
                            text[position] = item.getPriceFeatureDetailList().get(i).getEnumerationvalues();
                        }
                    }
                } else {
                    viewHolder.quoteValueTvTv.setText("");
                    text[position] = "";
                }
                viewHolder.quoteValueTvTv.setOnClickListener(new onClick(position, viewHolder, text));
            } else {
                /**显示小红星 * 必输入项***/
                if (item.getIsrequired().equals("T"))
                    viewHolder.redTv.setVisibility(View.VISIBLE);
                else
                    viewHolder.redTv.setVisibility(View.GONE);
                /*****/
                //et 显示
                viewHolder.descriptionEtTv.setText(item.getDescription() + "：");
                viewHolder.inputTypeEt.setVisibility(View.VISIBLE);
                viewHolder.inputTypeTv.setVisibility(View.GONE);
                viewHolder.quoteValueEtTv.setOnTouchListener(new View.OnTouchListener() {

                    @SuppressLint("ClickableViewAccessibility")
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        // TODO Auto-generated method stub
                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            index = position;
                        }
                        return false;
                    }
                });
                viewHolder.quoteValueEtTv.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    //设置焦点监听，当获取到焦点的时候才给它设置内容变化监听解决卡的问题

                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        EditText et = (EditText) v;
                        if (mWatcher == null) {
                            mWatcher = new myWatcher();
                        }
                        if (hasFocus) {
                            //设置edittext内容监听
                            et.addTextChangedListener(mWatcher);
                        } else {
                            et.removeTextChangedListener(mWatcher);
                        }

                    }
                });
                //防止点击以后弹出键盘，重新getview导致的焦点丢失
                viewHolder.quoteValueEtTv.clearFocus();
                if (index != -1 && index == position) {
                    // 如果当前的行下标和点击事件中保存的index一致，手动为EditText设置焦点。
                    viewHolder.quoteValueEtTv.requestFocus();
                }
                //这一定要放在clearFocus()之后，否则最后输入的内容在拉回来时会消失
                viewHolder.quoteValueEtTv.setText(text[position]);
                viewHolder.quoteValueEtTv.setSelection(viewHolder.quoteValueEtTv.getText().length());
            }
            return view;
        }

        class myWatcher implements TextWatcher {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                //为输入的位置内容设置数组管理器，防止item重用机制导致的上下内容一样的问题
                text[index] = editable.toString();
            }
        }

        public void showContactUsPopWin(Context context, String title, List<String> list, final ViewHolder viewHolder,
                                        final String text[], final int index) {
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
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean.
                            PriceFeatureDetailListBean item = model.getPriceFeatureDetailList().get(position);
                    QuotedPriceDetailVo.DataBean.ViewLabelListBean.ModelFeatureDetailListBean.PriceFeatureDetailListBean
                            priceFeatureDetailListBean = new QuotedPriceDetailVo.DataBean.
                            ViewLabelListBean.ModelFeatureDetailListBean.PriceFeatureDetailListBean();
                    if (!viewHolder.quoteValueTvTv.getText().toString().trim().equals(""))
                        for (int i = 0; i < model.getPriceFeatureDetailList().size(); i++)
                            if (viewHolder.quoteValueTvTv.getText().toString().trim().equals(
                                    model.getPriceFeatureDetailList().get(i).getEnumerationdesc().toString().trim()))
                                priceFeatureDetailListBean = model.getPriceFeatureDetailList().get(i);
                    viewHolder.quoteValueTvTv.setText(item.getEnumerationdesc());
                    //现在选的价格
                    int price = item.getSpread() != null ? Integer.parseInt(item.getSpread()) : 0;
                    //原来的价格
                    int oldPrice = priceFeatureDetailListBean.getSpread() != null ? Integer.parseInt(priceFeatureDetailListBean.getSpread()) : 0;
                    //新的价格
                    double newPrice = !quotePriceTv.getText().toString().trim().equals("") ?
                            Double.parseDouble(quotePriceTv.getText().toString().trim()) + (price - oldPrice)
                            : price - oldPrice;
                    quotePriceTv.setText(newPrice + "");
                    /**** 点击选择的第二层values ****/
                    text[index] = item.getEnumerationvalues();
                    pop.dismiss();
                }
            });
        }

        class onClick implements View.OnClickListener {

            private int position;
            private ViewHolder viewHolder;
            private String text[];

            public onClick(int position, ViewHolder viewHolder, String text[]) {
                this.position = position;
                this.viewHolder = viewHolder;
                this.text = text;
            }

            @Override
            public void onClick(View view) {
                model = data.get(position);
                List<String> list = new ArrayList<>();
                for (int i = 0; i < model.getPriceFeatureDetailList().size(); i++)
                    list.add(model.getPriceFeatureDetailList().get(i).getEnumerationdesc());
                showContactUsPopWin(context, "选择" + model.getDescription(), list, viewHolder, text, position);
                pop.showAtLocation(view, Gravity.CENTER, 0, 0);
            }
        }

        class ViewHolder {
            @Bind(R.id.description_et_tv)
            TextView descriptionEtTv;
            @Bind(R.id.red_tv)
            TextView redTv;
            @Bind(R.id.quoteValue_et_tv)
            EditText quoteValueEtTv;
            @Bind(R.id.input_type_et)
            LinearLayout inputTypeEt;
            @Bind(R.id.description_tv_tv)
            TextView descriptionTvTv;
            @Bind(R.id.quoteValue_tv_tv)
            TextView quoteValueTvTv;
            @Bind(R.id.input_type_tv)
            LinearLayout inputTypeTv;

            ViewHolder(View view) {
                ButterKnife.bind(this, view);
            }
        }
    }
}
