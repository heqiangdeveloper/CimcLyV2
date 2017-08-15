package com.cimcitech.cimcly.activity.home.annount;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.announce.AnnounceDetailVo;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.DateTool;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.io.InputStream;
import java.net.URL;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

public class AnnounceDetailActivity extends AppCompatActivity {

    @Bind(R.id.back_rl)
    RelativeLayout backRl;
    @Bind(R.id.title_tv)
    TextView titleTv;
    @Bind(R.id.time_tv)
    TextView timeTv;
    @Bind(R.id.content_tv)
    TextView contentTv;

    private int annId;
    private AnnounceDetailVo detailVo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annount_detail);
        ButterKnife.bind(this);
        annId = this.getIntent().getIntExtra("annId", 0);
        getData();
    }

    @OnClick(R.id.back_rl)
    public void onclick() {
        finish();
    }

    public void getData() {
        OkHttpUtils
                .post()
                .url(Config.announceDetail)
                .addHeader("checkTokenKey", Config.loginback.getToken())
                .addHeader("sessionKey", Config.loginback.getUserId() + "")
                .addParams("annId", annId + "")
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                //ToastUtil.showToast(response);
                                detailVo = GjsonUtil.parseJsonWithGson(response, AnnounceDetailVo.class);
                                if (detailVo != null)
                                    if (detailVo.isSuccess()) {
                                        titleTv.setText(detailVo.getData().getAnntitle());
                                        timeTv.setText(DateTool.getDateStr(detailVo.getData().getCreatedate()));
                                        //contentTv.setText(Html.fromHtml(detailVo.getData().getAnncontent()));
                                        showHtmlToString(detailVo.getData().getAnncontent(), contentTv);
                                    }
                            }
                        }
                );
    }

    public void showHtmlToString(String html, TextView textView) {
        //解析html
        Html.ImageGetter imgGetter = new Html.ImageGetter() {
            public Drawable getDrawable(String source) {
                Log.i("RG", "source---?>>>" + source);
                Drawable drawable = null;
                URL url;
                try {
                    url = new URL(source);
                    Log.i("RG", "url---?>>>" + url);
                    // 获取网路图片
                    drawable = Drawable.createFromStream(url.openStream(), "");
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                Log.i("RG", "url---?>>>" + url);
                return drawable;
            }
        };
        textView.setText(Html.fromHtml(html, imgGetter, null));
    }


}
