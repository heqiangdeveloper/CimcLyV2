package com.cimcitech.cimcly.activity.home.customer_visit;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.mapapi.NetworkUtil;
import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.home.intention_track.IntentionTrackAddActivity;
import com.cimcitech.cimcly.bean.customer_visit.CustomerVisitInfoVo;
import com.cimcitech.cimcly.bean.customer_visit.UpdateCustomerVisitInfoReq;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.DateTool;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.cimcitech.cimcly.utils.MyNetworkUtils;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.cimcitech.cimcly.widget.BaseActivity;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.MediaType;

public class CustomerVisitDetailActivity extends BaseActivity {

    @Bind(R.id.back_iv)
    ImageView back_Iv;
    @Bind(R.id.popup_menu_layout)
    LinearLayout popup_menu_Layout;
    @Bind(R.id.item_add_tv)
    TextView item_add_Tv;
    @Bind(R.id.item_invalid_tv)
    TextView item_invalid_Tv;
    @Bind(R.id.item_delete_tv)
    TextView item_delete_Tv;
    @Bind(R.id.item_finish_tv)
    TextView item_finish_Tv;
    @Bind(R.id.item_save_tv)
    TextView item_save_Tv;

    @Bind(R.id.client_no_tv)
    TextView clientNoTv;
    @Bind(R.id.create_time_tv)
    TextView createTimeTv;
    @Bind(R.id.client_name_tv)
    TextView clientNameTv;
    @Bind(R.id.contact_person_tv)
    TextView contactPersonTv;
    @Bind(R.id.mobile_tv)
    TextView mobileTv;
    @Bind(R.id.visit_time_tv)
    TextView visitTimeTv;
    @Bind(R.id.visit_time_2_tv)
    TextView visitTime2Tv;
    @Bind(R.id.client_address_tv)
    TextView clientAddressTv;
    @Bind(R.id.check_in_tv)
    TextView checkInTv;
    @Bind(R.id.visit_summary_tv)
    EditText visitSummaryTv;
    @Bind(R.id.more_tv)
    TextView more_Tv;
    @Bind(R.id.title_ll)
    LinearLayout title_Ll;
    @Bind(R.id.titleName_tv)
    TextView titleName_Tv;
    @Bind(R.id.who_spinner)
    Spinner whoSpinner;

    private int cvid;
    private CustomerVisitInfoVo info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_visit_detail_new);
        ButterKnife.bind(this);
        initTitle();

        initPopupMenu();
        cvid = this.getIntent().getIntExtra("cvid", 0);
        getData();
    }

    public void initTitle(){
        more_Tv.setVisibility(View.VISIBLE);
        whoSpinner.setVisibility(View.GONE);
        title_Ll.setVisibility(View.GONE);
        titleName_Tv.setText("拜访详情");
    }

    public void initPopupMenu(){
        popup_menu_Layout.setVisibility(View.GONE);
        item_add_Tv.setVisibility(View.VISIBLE);
        item_save_Tv.setVisibility(View.VISIBLE);
        item_delete_Tv.setVisibility(View.GONE);
        item_invalid_Tv.setVisibility(View.GONE);
        item_finish_Tv.setVisibility(View.GONE);

        item_save_Tv.setText("保存拜访总结");
        item_add_Tv.setText("新建意向订单");
    }

    @OnClick({R.id.back_iv,R.id.more_tv, R.id.item_save_tv,R.id.item_add_tv,R.id.mobile_tv})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.item_add_tv:
                popup_menu_Layout.setVisibility(View.GONE);
                final Intent intent = new Intent(CustomerVisitDetailActivity.this, IntentionTrackAddActivity.class);
                intent.putExtra("CustomerVisitInfo", info);
                startActivity(intent);
                break;
            case R.id.item_save_tv:
                popup_menu_Layout.setVisibility(View.GONE);
                if(null != info && MyNetworkUtils.isNetworkConnected(CustomerVisitDetailActivity
                        .this)){
                    if (visitSummaryTv.getText().toString().trim().equals("")) {
                        ToastUtil.showToast("请输入拜访总结");
                    } else {
                        mCommittingDialog.show();
                        updateData();
                    }
                }else{
                    ToastUtil.showToast("网络连接已断开，请确认！");
                }
                break;
            case R.id.back_iv:
                finish();
                break;
            case R.id.more_tv:
                popup_menu_Layout.setVisibility(View.VISIBLE);
                break;
            case R.id.mobile_tv:
                final String mobileNumber = mobileTv.getText().toString().trim();
                if(mobileNumber.length() != 0){
                    String content = "呼叫 " + mobileNumber;
                    new AlertDialog.Builder(CustomerVisitDetailActivity.this)
                            //.setTitle("提示")
                            .setMessage(content)
                            .setCancelable(false)
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                    requestDialPermission(mobileNumber);
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            }).create().show();
                }
                break;
        }
    }

    public void requestDialPermission(String number){
        List<String> permissionList = new ArrayList<>();
        if(ContextCompat.checkSelfPermission(CustomerVisitDetailActivity.this, Manifest.permission
                .CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            permissionList.add(Manifest.permission.CALL_PHONE);
        }
        if(!permissionList.isEmpty()){
            String [] permissions = permissionList.toArray(new String[permissionList.size()]);
            ActivityCompat.requestPermissions(CustomerVisitDetailActivity.this,permissions,1);
        }else {
            Dial(number);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case 1:
                if(grantResults.length > 0){
                    for(int result : grantResults){
                        if(result != PackageManager.PERMISSION_GRANTED){
                            Toast.makeText(CustomerVisitDetailActivity.this,"必须同意打电话权限",Toast.LENGTH_SHORT
                            ).show();
                            return;
                        }
                    }
                    Dial(mobileTv.getText().toString().trim());
                }else {
                    Toast.makeText(CustomerVisitDetailActivity.this,"发送未知错误",Toast.LENGTH_SHORT
                    ).show();
                }
                break;
        }
    }

    public void Dial(String number){
        Intent intentPhone = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
        try{
            startActivity(intentPhone);
        }catch (Exception e){
            //do nothing
        }
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

    public void initViewData() {
        clientNoTv.setText(info.getData().getContpersonid() != null ? info.getData().getContpersonid() + "" : "");
        createTimeTv.setText(DateTool.getDateStr(info.getData().getCreatedate()));
        clientNameTv.setText(info.getData().getCustname());
        contactPersonTv.setText(info.getData().getContpersonname());
        mobileTv.setText(info.getData().getCustphone());
        visitTimeTv.setText(DateTool.transferDateStr(info.getData().getVisitbegintime()));
        visitTime2Tv.setText(DateTool.transferDateStr(info.getData().getVisitendtime()));
        clientAddressTv.setText(info.getData().getCustaddress());
        checkInTv.setText(info.getData().getSigninaddress());
        visitSummaryTv.setText(info.getData().getVisitsummary());
        visitSummaryTv.setSelection(visitSummaryTv.getText().length());
    }

    public void getData() {
        OkHttpUtils
                .post()
                .url(Config.getCustVisitInfo)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .addParams("cvId", cvid + "")
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
                                    info = GjsonUtil.parseJsonWithGson(response, CustomerVisitInfoVo.class);
                                    if(info!=null)
                                        if (info.isSuccess()) {
                                            initViewData();
                                        }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                );
    }

    public void updateData() {
        int cvid = info.getData().getCvid();
        int userid = info.getData().getUserid();
        Long custid = info.getData().getCustid();
        String customerno = info.getData().getCustomerno();
        String custname = info.getData().getCustname();
        String custaddress = info.getData().getCustaddress();
        int custmanagerid = info.getData().getCustmanagerid();
        String custmanagername = info.getData().getCustmanagername();
        Long contpersonid = info.getData().getContpersonid();
        String signinaddress = info.getData().getSigninaddress();
        double sigininlat = info.getData().getSigininlat();
        double sigininlon = info.getData().getSigininlon();
        String visitsummary = visitSummaryTv.getText().toString().trim();
        String custphone = info.getData().getCustphone();
        int modifiedby = info.getData().getModifiedby();
        int creator = info.getData().getCreator();
        String visitbegintime = info.getData().getVisitbegintime();
        String visitendtime = info.getData().getVisitendtime();

        String json = new Gson().toJson(new UpdateCustomerVisitInfoReq(cvid,
                userid, custid, customerno, custname,
                custaddress, custmanagerid, custmanagername, contpersonid, signinaddress, sigininlat
                , sigininlon, visitsummary, custphone, modifiedby, creator, visitbegintime, visitendtime));
        OkHttpUtils
                .postString()
                .url(Config.modifyCustVisit)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .content(json)
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                if(mCommittingDialog.isShowing()) mCommittingDialog.dismiss();
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                if(mCommittingDialog.isShowing()) mCommittingDialog.dismiss();
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
                            }
                        }
                );
    }
}
