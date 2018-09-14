package com.cimcitech.cimcly.activity.message;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.widget.BaseActivity;
import com.cimcitech.cimcly.widget.ClearEditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qianghe on 2018/8/6.
 */

public class MessageDetailActivity extends BaseActivity {
    @Bind(R.id.title_ll)
    LinearLayout title_Ll;
    @Bind(R.id.filter_edit)
    ClearEditText filter_Et;
    @Bind(R.id.titleName_tv)
    TextView titleName_Tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_detail);
        ButterKnife.bind(this);
        initTitle();
    }

    public void initTitle(){
        titleName_Tv.setText("消息详情");
        title_Ll.setVisibility(View.GONE);
        filter_Et.setVisibility(View.GONE);
    }

    @OnClick({R.id.back_iv})
    public void onclick(View view) {
        switch (view.getId()){
            case R.id.back_iv:
                finish();
                break;
        }
    }
}
