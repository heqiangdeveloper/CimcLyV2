package com.cimcitech.cimcly.activity.home.report;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cimcitech.cimcly.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReportMainActivity extends AppCompatActivity {

    @Bind(R.id.back_rl)
    RelativeLayout back_RL;
    @Bind(R.id.area_tv)
    TextView area_Tv;
    @Bind(R.id.product_tv)
    TextView product_Tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.back_rl,R.id.area_tv,R.id.product_tv})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.back_rl:
                finish();
                break;
            case R.id.area_tv:
                startActivity(new Intent(ReportMainActivity.this,AreaReportActivity.class));
            break;
            case R.id.product_tv:
                startActivity(new Intent(ReportMainActivity.this,ProductReportActivity.class));
            break;
        }
    }
}
