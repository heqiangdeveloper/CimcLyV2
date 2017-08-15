package com.cimcitech.cimcly.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Toast;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.AreaVo;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;

public class WelcomeActivity extends AppCompatActivity {

    @Bind(R.id.welcome)
    View welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        AlphaAnimation animation = new AlphaAnimation(0.5f, 1.0f);
        animation.setDuration(2000);
        welcome.setAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(WelcomeActivity.this, LoginActivity.class));
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
