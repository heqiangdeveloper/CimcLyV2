package com.cimcitech.cimcly.activity.main;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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

public class EditValueActivity extends BaseActivity {
    @Bind(R.id.number_content_et)
    EditText number_content_Et;
    @Bind(R.id.string_content_et)
    EditText string_content_Et;
    @Bind(R.id.titleName_tv)
    TextView titleName_Tv;
    @Bind(R.id.save_tv)
    TextView save_Tv;

    public static String [] TYPE = {"num","str"};
    public String type = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_value);
        ButterKnife.bind(this);

        String title = getIntent().getStringExtra("title");
        String content = getIntent().getStringExtra("content");
        type = getIntent().getStringExtra("type");

        setTextWatcher(number_content_Et);
        setTextWatcher(string_content_Et);
        initView(title,content,type);
        //弹出软键盘
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
    }

    public void setTextWatcher(EditText et){
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textChangedAction();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void textChangedAction(){
        if(type.equals(EditValueActivity.TYPE[0])){
            if(number_content_Et.getText().toString().trim().length() != 0 ){
                save_Tv.setClickable(true);
                save_Tv.setTextColor(Color.WHITE);
            }else{
                save_Tv.setClickable(false);
                save_Tv.setTextColor(Color.GRAY);
            }
        }else{
            if(string_content_Et.getText().toString().trim().length() != 0){
                save_Tv.setClickable(true);
                save_Tv.setTextColor(Color.WHITE);
            }else{
                save_Tv.setClickable(false);
                save_Tv.setTextColor(Color.GRAY);
            }
        }
    }

    public void initView(String title, String content,String type){
        titleName_Tv.setText(title);
        if(type.equals(EditValueActivity.TYPE[0])){
            number_content_Et.setText(content);
            number_content_Et.setHint("请输入" + title);
            number_content_Et.setSelection(content.length());
            string_content_Et.setVisibility(View.GONE);
            number_content_Et.setFocusable(true);
        }else{
            string_content_Et.setText(content);
            string_content_Et.setHint("请输入" + title);
            string_content_Et.setSelection(content.length());
            number_content_Et.setVisibility(View.GONE);
            string_content_Et.setFocusable(true);
        }
    }

    @OnClick({R.id.save_tv,R.id.back_iv})
    public void onclick(View view) {
        switch (view.getId()){
            case R.id.save_tv:
                Intent i = new Intent();
                if(type.equals(EditValueActivity.TYPE[0])){
                    i.putExtra("result",number_content_Et.getText().toString().trim());
                }else {
                    i.putExtra("result",string_content_Et.getText().toString().trim());
                }
                setResult(RESULT_OK,i);
                finish();
                break;
            case R.id.back_iv:
                finish();
                break;
        }
    }
}
