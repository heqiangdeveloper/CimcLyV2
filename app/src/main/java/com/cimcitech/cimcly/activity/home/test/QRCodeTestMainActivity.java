package com.cimcitech.cimcly.activity.home.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cimcitech.cimcly.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QRCodeTestMainActivity extends AppCompatActivity{
    @Bind(R.id.qrcode_tv)
    TextView qrcode_Tv;
    @Bind(R.id.write_tv)
    TextView write_Tv;

    @Bind(R.id.more_tv)
    TextView more_Tv;
    @Bind(R.id.title_ll)
    LinearLayout title_Ll;
    @Bind(R.id.titleName_tv)
    TextView titleName_Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main2);
        ButterKnife.bind(this);
        initTitle();
    }

    public void initTitle(){
        more_Tv.setVisibility(View.GONE);
        title_Ll.setVisibility(View.GONE);
        titleName_Tv.setText("检验");
    }

    @OnClick({R.id.qrcode_tv,R.id.back_iv,R.id.write_tv})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.back_iv:
                finish();
                break;
            case R.id.qrcode_tv://扫码获取车工号
                Intent i1 = new Intent(QRCodeTestMainActivity.this,QRCodeTestActivity.class);
                startActivity(i1);
                break;
            case R.id.write_tv://手工填写车工号
                Intent i2 = new Intent(QRCodeTestMainActivity.this,WriteTestActivity.class);
                startActivity(i2);
                break;
        }
    }
}
