package com.cimcitech.cimcly.activity.home.contact_person;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.home.customer_visit.CustomerVisitAddActivity;
import com.cimcitech.cimcly.activity.home.customer_visit.CustomerVisitDetailActivity;
import com.cimcitech.cimcly.bean.contact.ContactInfoVo;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.DateTool;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

public class ContactPersonDetailActivity extends AppCompatActivity {
    @Bind(R.id.user_name_tv)
    TextView userNameTv;
    @Bind(R.id.mobile_tv)
    TextView mobileTv;
    @Bind(R.id.phone_tv)
    TextView phoneTv;
    @Bind(R.id.area_tv)
    TextView areaTv;
    @Bind(R.id.address_tv)
    TextView addressTv;
    @Bind(R.id.time_tv)
    TextView timeTv;
    @Bind(R.id.customer_no_tv)
    TextView customerNoTv;
    @Bind(R.id.customer_name_tv)
    TextView customerNameTv;
    @Bind(R.id.update_bt)
    Button updateBt;
    @Bind(R.id.title_ll)
    LinearLayout title_Ll;
    @Bind(R.id.more_tv)
    TextView more_Tv;
    @Bind(R.id.titleName_tv)
    TextView titleName_Tv;

    private long contPersonId;
    private ContactInfoVo contactInfoVo;
    private final int AREA_CITY_RESULT = 1001;
    private boolean isDialMobile = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_person_detail2);
        ButterKnife.bind(this);
        initTitle();
        contPersonId = this.getIntent().getLongExtra("contPersonId", 0);
        getData();
    }

    public void initTitle() {
        more_Tv.setVisibility(View.GONE);
        titleName_Tv.setText("联系人详情");
        title_Ll.setVisibility(View.GONE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == AREA_CITY_RESULT && resultCode == RESULT_OK) {
            contPersonId = Long.parseLong(data.getExtras().getString("contPersonId"));
            getData();
        }
    }

    @OnClick({R.id.back_iv, R.id.add_bt, R.id.update_bt,R.id.mobile_tv,R.id.phone_tv})
    public void onclick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.back_iv:
                finish();
                break;
            case R.id.update_bt://更新
                intent = new Intent(ContactPersonDetailActivity.this, ContactPersonUpdateActivity.class);
                intent.putExtra("contactInfoVo", contactInfoVo);
                startActivityForResult(intent, AREA_CITY_RESULT);
                break;
            case R.id.add_bt://新增
                intent = new Intent(ContactPersonDetailActivity.this, CustomerVisitAddActivity.class);
                intent.putExtra("contactInfoVo", contactInfoVo);
                startActivity(intent);
                break;
            case R.id.mobile_tv://电话
                isDialMobile = true;
                final String mobileNumber = mobileTv.getText().toString().trim();
                callDialog(mobileNumber);
                break;
            case R.id.phone_tv://手机
                isDialMobile = false;
                final String phoneNumber = phoneTv.getText().toString().trim();
                callDialog(phoneNumber);
                break;
        }
    }

    public void callDialog(final String number){
        if(number.length() != 0){
            String content = "呼叫 " + number;
            new AlertDialog.Builder(ContactPersonDetailActivity.this)
                    //.setTitle("提示")
                    .setMessage(content)
                    .setCancelable(false)
                    .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            requestDialPermission(number);
                        }
                    })
                    .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).create().show();
        }
    }

    public void requestDialPermission(String number){
        List<String> permissionList = new ArrayList<>();
        if(ContextCompat.checkSelfPermission(ContactPersonDetailActivity.this, Manifest.permission
                .CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            permissionList.add(Manifest.permission.CALL_PHONE);
        }
        if(!permissionList.isEmpty()){
            String [] permissions = permissionList.toArray(new String[permissionList.size()]);
            ActivityCompat.requestPermissions(ContactPersonDetailActivity.this,permissions,1);
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
                            Toast.makeText(ContactPersonDetailActivity.this,"必须同意打电话权限",Toast.LENGTH_SHORT
                            ).show();
                            return;
                        }
                    }
                    String number = "";
                    if(isDialMobile){
                        number = mobileTv.getText().toString().trim();
                    }else{
                        number = phoneTv.getText().toString().trim();
                    }
                    Dial(number);
                }else {
                    Toast.makeText(ContactPersonDetailActivity.this,"发送未知错误",Toast.LENGTH_SHORT
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

    public void getData() {
        OkHttpUtils
                .post()
                .url(Config.getContactInfo)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .addParams("contPersonId", contPersonId + "")
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                Log.d("timelog", "response is: " + response);
                                try {
                                    contactInfoVo = GjsonUtil.parseJsonWithGson(response, ContactInfoVo.class);
                                    if (contactInfoVo != null)
                                        if (contactInfoVo.isSuccess()) {
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
        String province = "";
        String city = "";
        userNameTv.setText(contactInfoVo.getData().getPersonname() != null ?
                contactInfoVo.getData().getPersonname() : "");
        phoneTv.setText(contactInfoVo.getData().getContmobile() != null ?
                contactInfoVo.getData().getContmobile() + "" : "");
        mobileTv.setText(contactInfoVo.getData().getConttel() != null ?
                contactInfoVo.getData().getConttel() + "" : "");
        if (contactInfoVo.getData().getFamilyarea() != null && !contactInfoVo.getData().getFamilyarea().equals(""))
            province = contactInfoVo.getData().getFamilyarea() + "";
        if (contactInfoVo.getData().getFamilycity() != null && !contactInfoVo.getData().getFamilycity().equals(""))
            city = contactInfoVo.getData().getFamilycity() + "";
        areaTv.setText(province + " " + city);
        addressTv.setText(contactInfoVo.getData().getFamilyaddress() != null ?
                contactInfoVo.getData().getFamilyaddress() + "" : "");
        if (contactInfoVo.getData().getCreatedate() > 0)
            timeTv.setText(DateTool.getDateStr(contactInfoVo.getData().getCreatedate()));
        if (contactInfoVo.getData().getCustomerNo() != null && !contactInfoVo.getData().getCustomerNo().equals(""))
            customerNoTv.setText(contactInfoVo.getData().getCustomerNo() + "");
        if (contactInfoVo.getData().getCustname() != null && !contactInfoVo.getData().getCustname().equals(""))
            customerNameTv.setText(contactInfoVo.getData().getCustname() + "");
    }
}
