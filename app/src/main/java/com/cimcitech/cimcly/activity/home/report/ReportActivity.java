package com.cimcitech.cimcly.activity.home.report;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cimcitech.cimcly.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReportActivity extends AppCompatActivity {

    @Bind(R.id.back_rl)
    RelativeLayout backRl;
    @Bind(R.id.my_tv)
    TextView myTv;
    @Bind(R.id.xs_tv)
    TextView xsTv;
    @Bind(R.id.my_view)
    View myView;
    @Bind(R.id.xs_view)
    View xsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.back_rl, R.id.my_tv, R.id.xs_tv})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.back_rl:
                finish();
                break;
            case R.id.my_tv:
                myView.setVisibility(View.VISIBLE);
                xsView.setVisibility(View.INVISIBLE);
                break;
            case R.id.xs_tv:
                myView.setVisibility(View.INVISIBLE);
                xsView.setVisibility(View.VISIBLE);
                break;

        }
    }
}
