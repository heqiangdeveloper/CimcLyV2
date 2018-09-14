package com.cimcitech.cimcly.activity.main;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.LoginVo;
import com.cimcitech.cimcly.utils.Base64Utils;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.cimcitech.cimcly.widget.BaseActivity;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

public class LoginActivity extends BaseActivity {
    @Bind(R.id.login_name_tv)
    EditText loginNameTv;
    @Bind(R.id.password_tv)
    EditText passwordTv;
    @Bind(R.id.login_bt)
    Button loginBt;

    private LoginVo loginVo;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        sp = this.getSharedPreferences(Config.KEY_LOGIN_AUTO, MODE_PRIVATE);//如果存在则打开它，否则创建新的Preferences

        loginNameTv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(loginNameTv.getText().toString().trim().length() != 0 &&
                        passwordTv.getText().toString().trim().length() != 0){
                    loginBtnOn();
                }else{
                    loginBtnOff();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        passwordTv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(loginNameTv.getText().toString().trim().length() != 0 &&
                        passwordTv.getText().toString().trim().length() != 0){
                    loginBtnOn();
                }else{
                    loginBtnOff();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        String loginname = sp.getString("login_name","");
        String username = sp.getString("user_name","");
        String password = sp.getString("password","");
        String token = sp.getString("token","");
        String appAuth = sp.getString("appAuth","");
        int userId = sp.getInt("userId",0);
        //如果是已登录过的，直接跳过登录界面
        if(loginname.length() != 0 && password.length() != 0 && token.length() != 0 && appAuth.length() != 0 && userId!= 0){
            saveConfigs(loginname,username,token,appAuth,userId);
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }else{
            if (loginname != "") {
                loginNameTv.setText(loginname);
            }else{
                loginNameTv.setText("");
            }
            passwordTv.setText("");
            if(loginNameTv.getText().toString().trim().length() != 0){
                loginNameTv.setSelection(loginNameTv.getText().toString().trim().length());
            }
        }
    }

    /**
     * 常用账号（正式环境） admin   zh0205#ly
     */

    public void loginBtnOn(){
        loginBt.setBackgroundResource(R.drawable.shape_login_button_on);
        loginBt.setClickable(true);
        loginBt.setTextColor(Color.WHITE);
    }

    public void loginBtnOff(){
        loginBt.setBackgroundResource(R.drawable.shape_login_button_off);
        loginBt.setClickable(false);
        loginBt.setTextColor(getResources().getColor(R.color.colorPrimary));
    }

    @OnClick({R.id.clear_name_iv, R.id.clear_password_iv,R.id.login_bt})
    public void onclick(View v) {
        switch (v.getId()) {
            case R.id.clear_name_iv:
                loginNameTv.setText("");
                break;
            case R.id.clear_password_iv:
                passwordTv.setText("");
                break;
            case R.id.login_bt:
                if (!checkInput()) return;
                mLoginDialog.show();
                getData();
                break;
        }
    }

    public void getData() {
        OkHttpUtils
                .post()
                .url(Config.USER_LOGIN_URL)
                .addParams("userName", loginNameTv.getText().toString().trim())
                .addParams("passwd", passwordTv.getText().toString().trim())
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                mLoginDialog.dismiss();
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                //ToastUtil.showToast(response);
                                try {
                                    loginVo = GjsonUtil.parseJsonWithGson(response, LoginVo.class);
                                    Log.d("heqlogin",response);
                                    if (loginVo != null) {
                                        if (loginVo.isSuccess()) {
                                            String loginname = loginNameTv.getText().toString().trim();
                                            String username = loginVo.getData().getUserName();
                                            String token = loginVo.getData().getToken();
                                            String appAuth = loginVo.getData().getAppAuth();
                                            int userId = loginVo.getData().getUserId();
                                            String password = passwordTv.getText().toString().trim();
                                            saveUserInfo(loginname,username,password,token,appAuth,userId);
                                            saveConfigs(loginname,username,token,appAuth,userId);
                                            Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                            startActivity(intent);
                                            finish();
                                        }else{
                                            ToastUtil.showToast("账号或密码错误，请检查！");
                                        }
                                    } else {
                                        ToastUtil.showToast("登录失败");
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                mLoginDialog.dismiss();
                            }
                        }
                );
    }

    /***
     * 保存账户与密码
     */
    private void saveUserInfo(String loginname,String username,String password,String token,
                              String appAuth,int userId) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("login_name", loginname);
        editor.putString("user_name", username);
        editor.putString("password",Base64Utils.encodeString(password));
        editor.putInt("userId",userId);
        editor.putString("token", token);
        editor.putString("appAuth", appAuth);
        editor.commit();
    }

    //保存全局变量
    private void saveConfigs(String loginname,String username,String token,String appAuth,int userId){
        Config.LOGINNAME = loginname;
        Config.USERNAME = username;
        Config.TOKEN = token;
        Config.APPAUTH = appAuth;
        Config.USERID = userId;
    }

    public boolean checkInput() {
        String username = loginNameTv.getText().toString().trim();
        String password = passwordTv.getText().toString().trim();
        if (password.equals("")) {
            Toast.makeText(LoginActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (username.equals("")) {
            Toast.makeText(LoginActivity.this, "请输入用户名", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
