package com.cimcitech.cimcly.activity.home.qrcode_in_storage;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.customer_visit.CustomerVisitAddActivity;
import com.cimcitech.cimcly.activity.home.car_in_storage.CarInStorageActivity;
import com.cimcitech.cimcly.activity.home.report.AreaReportDetailActivity;
import com.cimcitech.cimcly.bean.ListReportPagers;
import com.cimcitech.cimcly.bean.Result;
import com.cimcitech.cimcly.bean.report.Cell;
import com.cimcitech.cimcly.bean.report.ReportData;
import com.cimcitech.cimcly.bean.report.ReportVo;
import com.cimcitech.cimcly.utils.Config;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.gson.Gson;
import com.xys.libzxing.zxing.activity.CaptureActivity;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

public class QRCodeInStorageActivity extends AppCompatActivity{

    @Bind(R.id.qrcode_tv)
    TextView qrcode_Tv;
    @Bind(R.id.result_tv)
    TextView result_Tv;
    @Bind(R.id.back_rl)
    RelativeLayout backRl;
    @Bind(R.id.in_storage_bt)
    Button in_storage_Btn;
    @Bind(R.id.warn_tv)
    TextView warn_Tv;

    private final int PERMISSION_CODE = 1;
    private final int CAMERA_CODE = 2;
    private final String StartStr = "http://service.lingyu.com?id=";
    private String vehicleno = "";
    private boolean isCommitSuccess = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode_in_storage);
        ButterKnife.bind(this);

        warn_Tv.setVisibility(View.GONE);
        result_Tv.setVisibility(View.GONE);
        in_storage_Btn.setVisibility(View.GONE);
    }

    @OnClick({R.id.qrcode_tv,R.id.back_rl,R.id.in_storage_bt})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.back_rl:
                finish();
                break;
            case R.id.qrcode_tv:
                //申请相机权限
                List<String> permissionList = new ArrayList<>();
                if(ContextCompat.checkSelfPermission(QRCodeInStorageActivity.this, Manifest.permission
                        .CAMERA) != PackageManager.PERMISSION_GRANTED){
                    permissionList.add(Manifest.permission.CAMERA);
                }
                if(!permissionList.isEmpty()){
                    String [] permissions = permissionList.toArray(new String[permissionList.size()]);
                    ActivityCompat.requestPermissions(QRCodeInStorageActivity.this,permissions,PERMISSION_CODE);
                }else {
                    getQRCode();
                }
                break;
            case R.id.in_storage_bt:
                if(vehicleno.length() != 0){
                    if(submitCarInStorageData(vehicleno)){
                        warn_Tv.setVisibility(View.GONE);
                        result_Tv.setVisibility(View.GONE);
                        in_storage_Btn.setVisibility(View.GONE);
                        Toast.makeText(QRCodeInStorageActivity.this,"入库成功",Toast.LENGTH_SHORT).show();
                        vehicleno = "";
                    }else {
                        warn_Tv.setVisibility(View.VISIBLE);
                        result_Tv.setVisibility(View.VISIBLE);
                        in_storage_Btn.setVisibility(View.VISIBLE);
                        Toast.makeText(QRCodeInStorageActivity.this,"入库失败，请稍后再试",Toast.LENGTH_SHORT).show();
                    }
                }
                break;
        }
    }

    public void getQRCode(){
        Intent i = new Intent(QRCodeInStorageActivity.this, CaptureActivity.class);
        startActivityForResult(i,CAMERA_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case PERMISSION_CODE:
                if(grantResults.length > 0){
                    for(int result : grantResults){
                        if(result != PackageManager.PERMISSION_GRANTED){
                            Toast.makeText(QRCodeInStorageActivity.this,"必须同意相机使用权限",Toast.LENGTH_SHORT).show();
                            //finish();
                            return;
                        }
                    }
                    getQRCode();
                }else {
                    Toast.makeText(QRCodeInStorageActivity.this,"未知错误",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_CODE && resultCode == RESULT_OK) {
            Bundle bundle = data.getExtras();
            String scanResult = bundle.getString("result");
            Log.d("hqtest","s is: " + scanResult);
            if(scanResult.length() > 29 && scanResult.substring(0,29).equals(StartStr)){
                vehicleno = scanResult.substring(29);
                warn_Tv.setVisibility(View.VISIBLE);
                result_Tv.setVisibility(View.VISIBLE);
                in_storage_Btn.setVisibility(View.VISIBLE);
                result_Tv.setText(vehicleno);
            }else {
                vehicleno = "";
                warn_Tv.setVisibility(View.GONE);
                result_Tv.setVisibility(View.GONE);
                in_storage_Btn.setVisibility(View.GONE);
                Toast.makeText(QRCodeInStorageActivity.this,"请确认是否是正确的二维码！",Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }

    public boolean submitCarInStorageData(String vehiclenos){
        /*String json = new Gson().toJson(new WaitInStorageDataBean(Config.loginback.getUserId(),
                vehiclenos));*/
        //Log.d("hetest","commit json is：" + json);

        OkHttpUtils
                .post()
                .url(Config.waitInStorageAction)
                .addParams("userId", Config.loginback.getUserId() + "")
                .addParams("vehicleNos", vehiclenos)
                .addHeader("checkTokenKey", Config.loginback.getToken())
                .addHeader("sessionKey", Config.loginback.getUserId() + "")
                //.content(json)
                //.mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                isCommitSuccess = false;
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                isCommitSuccess = true;
                            }
                        }
                );
        return isCommitSuccess;
    }
}