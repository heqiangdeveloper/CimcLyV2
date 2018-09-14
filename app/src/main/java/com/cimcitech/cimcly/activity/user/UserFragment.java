package com.cimcitech.cimcly.activity.user;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.content.FileProvider;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.main.LoginActivity;
import com.cimcitech.cimcly.bean.ApkUpdateVo;
import com.cimcitech.cimcly.utils.ApkUpdateUtil;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.GjsonUtil;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by cimcitech on 2017/7/31.
 */

public class UserFragment extends Fragment {
    @Bind(R.id.back_iv)
    ImageView back_Iv;
    @Bind(R.id.about_tv)
    TextView aboutTv;
    @Bind(R.id.clear_cache_linear)
    LinearLayout clearCacheLinear;
    @Bind(R.id.check_version_tv)
    TextView checkVersionTv;
    @Bind(R.id.out_login)
    TextView outLogin;
    @Bind(R.id.user_name_tv)
    TextView userNameTv;
    @Bind(R.id.clear_cache_tv)
    TextView clearCacheTv;

    @Bind(R.id.more_tv)
    TextView more_Tv;
    @Bind(R.id.title_ll)
    LinearLayout title_Ll;
    @Bind(R.id.titleName_tv)
    TextView titleName_Tv;

    public File mFile = null;
    public ProgressDialog pd;
    public int MAXSIZE = 0;
    public int TOTALSIZE = 0;
    public final int UPDATE_APK = 1;
    public final int TIMEOUT = 2;
    public final int DOWNLOAD_ERROR = 3;
    public final int DOWNLOAD_SUCCESS = 4;
    public final int MAX_PRO_LENGTH = 5;
    public final int UPDATEPROGRESS = 6;
    private SharedPreferences sp;
    private ApkUpdateVo apkUpdateVo;

    public DataCleanManager manager = null;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case UPDATE_APK:
                    break;
                case TIMEOUT:
                    Toast.makeText(getActivity(), "连接超时，请检查网络", Toast.LENGTH_SHORT)
                            .show();
                    break;
                case DOWNLOAD_ERROR:
                    break;
                case DOWNLOAD_SUCCESS:
                    installApk(mFile);
                    break;
                case MAX_PRO_LENGTH:
                    if (MAXSIZE != 0) {
                        pd.setMax(MAXSIZE);
                    }
                    break;
                case UPDATEPROGRESS:
                    pd.setProgress(TOTALSIZE);
                    break;
            }
        }
    };

    private void getUserInfo() {
        Log.d("configlog","Config.USERNAME is: " + Config.USERNAME);
        userNameTv.setText(Config.USERNAME);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_user2, container, false);
        ButterKnife.bind(this, view);
        initTitle();
        back_Iv.setVisibility(View.GONE);
        sp = getActivity().getSharedPreferences(Config.KEY_LOGIN_AUTO, MODE_PRIVATE);
        getUserInfo();
        getData();

        //add for cache
        manager = new DataCleanManager();
        File file = getActivity().getCacheDir() ;
        //这部分用作缓存的测试
        /*File file2=new File(file,"my.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file2.getPath());
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("this is a.txt");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        Log.d("hqlog",file.getPath());
        try{
            clearCacheTv.setText(manager.getTotalCacheSize(getActivity()));
        }catch(Exception e){
            clearCacheTv.setText("0.0KB");
            Log.d("hqlog","get total cache tell a exception:" + e);
        }
        return view;
    }

    public void initTitle(){
        more_Tv.setVisibility(View.GONE);
        title_Ll.setVisibility(View.GONE);
        titleName_Tv.setText("我的");
    }

    public boolean checkApkVersion() {
        if (apkUpdateVo != null)
            if (apkUpdateVo.isSuccess()) {
                int versionCode = Integer.parseInt(
                        ApkUpdateUtil.getVersionCode(getActivity()));
                int webVersionCode = apkUpdateVo.getData().getVersioncode();
                if (webVersionCode > versionCode) {
                    return true;
                } else
                    return false;
            }
        return false;
    }

    @OnClick({R.id.about_tv, R.id.check_version_tv, R.id.out_login,R.id.clear_cache_linear})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.clear_cache_linear:
                new AlertDialog.Builder(getActivity())
                        .setTitle("提示")
                        .setMessage("是否要清除缓存？")
                        .setCancelable(true)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                manager.clearAllCache(getActivity());
                                clearCacheTv.setText("0.0KB");
                                Toast.makeText(getActivity(),"缓存已清理完毕！",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).create().show();
                break;
            case R.id.about_tv:
                Log.d("configlog","Config.USERNAME is: " + Config.USERNAME);
                startActivity(new Intent(getActivity(), AboutActivity.class));
                break;
            case R.id.check_version_tv:
                if (!checkApkVersion()) {
                    Toast.makeText(getActivity(), "已经是最新版本！", Toast.LENGTH_SHORT).show();
                } else {
                    if (!isNetworkAvalible(getActivity())) {
                        Toast.makeText(getActivity(), "无法连接网络，请检查网络！", Toast.LENGTH_SHORT).show();
                    } else {
                        new AlertDialog.Builder(getActivity())
                                .setTitle("提示")
                                .setMessage("检测到新版本是否下载？")
                                .setCancelable(false)
                                .setPositiveButton("下载安装", new DialogInterface.OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        startToDownload();
                                    }
                                })
                                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        dialogInterface.dismiss();
                                    }
                                }).create().show();
                    }
                }
                break;
            case R.id.out_login:
                new AlertDialog.Builder(getActivity())
                        //.setTitle("提示")
                        .setMessage("您确定要退出登录吗？")
                        .setCancelable(false)
                        .setPositiveButton("确认", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                ModifyUserInfoPreference();//清除登录信息
                                startActivity(new Intent(getActivity(), LoginActivity.class));
                                getActivity().finish();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).create().show();
                break;
        }
    }

    public void startToDownload() {
        String filePath = Environment.getExternalStorageDirectory() + "/newversion.apk";
        Log.d("heqiang", filePath);
        pd = new ProgressDialog(getActivity());
        pd.setTitle("正在下载");
        pd.setIndeterminate(false);
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setCancelable(false);
        pd.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mFile = getFileFromServer(apkUpdateVo.getData().getApkurl(), getActivity());
                    Thread.sleep(1000);
                    pd.dismiss();
                    sendMsg(DOWNLOAD_SUCCESS);
                } catch (Exception e) {
                    sendMsg(DOWNLOAD_ERROR);
                }
            }
        }).start();
    }

    public File getFileFromServer(String path, Context context) throws Exception {
        //如果相等的话表示当前的sdcard挂载在手机上并且是可用的
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            //获取到文件的大小
            //pd.setMax(conn.getContentLength());
            MAXSIZE = conn.getContentLength();
            sendMsg(MAX_PRO_LENGTH);
            InputStream is = conn.getInputStream();
            File file = new File(Environment.getExternalStorageDirectory(), "newversion.apk");
            FileOutputStream fos = new FileOutputStream(file);
            BufferedInputStream bis = new BufferedInputStream(is);
            byte[] buffer = new byte[1024];
            int len;
            int total = 0;
            while ((len = bis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
                total += len;
                //获取当前下载量
                //pd.setProgress(total);
                TOTALSIZE = total;
                sendMsg(UPDATEPROGRESS);
            }
            fos.close();
            bis.close();
            is.close();
            return file;
        } else {
            return null;
        }
    }

    protected void installApk(File file) {
        Intent intent = new Intent();
        //执行动作
        intent.setAction(Intent.ACTION_VIEW);
        //执行的数据类型
        if (Build.VERSION.SDK_INT >= 24)//7.0
        {
            Uri apkUri =
                    FileProvider.getUriForFile(getActivity(), "com.cimcitech.cimcly" +
                            ".fileprovider", file);
            //添加这一句表示对目标应用临时授权该Uri所代表的文件
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            intent.setDataAndType(apkUri, "application/vnd.android.package-archive");
        } else {
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        }
        getActivity().startActivity(intent);
    }

    public boolean isNetworkAvalible(Context context) {
        ConnectivityManager manager = (ConnectivityManager) (context.getSystemService(Context
                .CONNECTIVITY_SERVICE));
        NetworkInfo[] infos = manager.getAllNetworkInfo();
        for (int i = 0; i < infos.length; i++) {
            if (infos[i].getState() == NetworkInfo.State.CONNECTED) {
                return true;
            }
        }
        return false;
    }

    public void sendMsg(int flag) {
        Message message = new Message();
        message.what = flag;
        handler.sendMessage(message);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    public void getData() {
        OkHttpUtils
                .post()
                .url(Config.updateApk)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
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
                                apkUpdateVo = GjsonUtil.parseJsonWithGson(response, ApkUpdateVo.class);
                            }
                        }
                );
    }

    public void ModifyUserInfoPreference(){
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("password", "");
        editor.putInt("userId", 0);
        editor.putString("token","");
        editor.putString("appAuth","");
        editor.commit();
    }
}
