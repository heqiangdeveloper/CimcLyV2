package com.cimcitech.cimcly.activity.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.AreaVo;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.cimcitech.cimcly.widget.DataGenerator;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;


public class MainActivity extends AppCompatActivity {
    private RadioGroup mRadioGroup;
    private Fragment[] mFragments;
    private RadioButton mRadioButtonHome;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragments = DataGenerator.getFragments();
        // 将activity设置为全屏显示
        initView();
        getAreaData();
    }

    private void initView() {
        mRadioGroup = (RadioGroup) findViewById(R.id.radio_group_button);
        mRadioButtonHome = (RadioButton) findViewById(R.id.radio_button_home);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            Fragment mFragment = null;

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.radio_button_home:
                        mFragment = mFragments[0];
                        break;
                    case R.id.radio_button_customer_visit:
                        mFragment = mFragments[1];
                        break;
                    case R.id.radio_button_intention_track:
                        mFragment = mFragments[2];
                        break;
                    case R.id.radio_button_user:
                        mFragment = mFragments[3];
                        break;
                }
                if (mFragments != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.home_container, mFragment).commit();
                }
            }
        });
        mRadioButtonHome.setChecked(true);
    }

    /**
     * 获取省市级联的省市信息
     */
    public void getAreaData() {
        OkHttpUtils
                .post()
                .url(Config.getProviceAndCity)
                .addHeader("checkTokenKey", Config.loginback.getToken())
                .addHeader("sessionKey", Config.loginback.getUserId() + "")
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                // ToastUtil.showToast(response);
                                try {
                                    Config.areaVo = GjsonUtil.parseJsonWithGson(response, AreaVo.class);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                );
    }
}
