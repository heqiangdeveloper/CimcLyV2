package com.cimcitech.cimcly.activity.home.contact_person;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.cimcitech.cimcly.ApkApplication;
import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.home.customer_visit.CustomerVisitDetailActivity;
import com.cimcitech.cimcly.adapter.contact_person.ContactPersonAdapter;
import com.cimcitech.cimcly.bean.ListPagers;
import com.cimcitech.cimcly.bean.Result;
import com.cimcitech.cimcly.bean.contact.Contact;
import com.cimcitech.cimcly.bean.contact.ContactReq;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.ContactPinyinComparator;
import com.cimcitech.cimcly.utils.PinyinUtils;
import com.cimcitech.cimcly.utils.ToastUtil;
import com.cimcitech.cimcly.widget.BaseActivity;
import com.cimcitech.cimcly.widget.ClearEditText;
import com.cimcitech.cimcly.widget.SideBar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.MediaType;

public class ContactPersonActivity extends BaseActivity {
    @Bind(R.id.my_tv)
    TextView myTv;
    @Bind(R.id.xs_tv)
    TextView xsTv;
    @Bind(R.id.my_view)
    View myView;
    @Bind(R.id.xs_view)
    View xsView;
    @Bind(R.id.search_et)
    EditText searchEt;
    @Bind(R.id.search_bt)
    Button searchBt;
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;
    @Bind(R.id.title_ll)
    LinearLayout title_Ll;
    @Bind(R.id.more_tv)
    TextView more_Tv;
    @Bind(R.id.titleName_tv)
    TextView titleName_Tv;
    @Bind(R.id.status_ll)
    LinearLayout status_Ll;
    @Bind(R.id.who_spinner)
    Spinner whoSpinner;
    @Bind(R.id.who_ll)
    LinearLayout who_Ll;
    @Bind(R.id.sideBar)
    SideBar sideBar;
    @Bind(R.id.dialog)
    TextView dialog;
    @Bind(R.id.filter_edit)
    ClearEditText clearEditText;
    @Bind(R.id.item_my_rl)
    RelativeLayout item_my_Rl;
    @Bind(R.id.item_others_rl)
    RelativeLayout item_others_Rl;
    @Bind(R.id.item_my_tv)
    TextView item_my_Tv;
    @Bind(R.id.item_others_tv)
    TextView item_others_Tv;
    @Bind(R.id.item_my_checked_tv)
    TextView item_my_checked_Tv;
    @Bind(R.id.item_others_checked_tv)
    TextView item_others_checked_Tv;
    @Bind(R.id.popup_menu_layout)
    LinearLayout popup_menu_Layout;

    private int pageNum = 1;
    private Result<ListPagers<Contact>> status;
    private List<Contact> data = new ArrayList<Contact>();
    private ContactPersonAdapter adapter;
    private Handler uiHandler = null;
    private Handler handler = new Handler();
    private final int INIT_DATA = 1003;
    private boolean isLoading;
    private Long custid;
    private boolean myData = true;
    private ContactPinyinComparator contactPinyinComparator;
    private LinearLayoutManager manager;
    private final int GET_DATE_SUCCESS = 1;
    private final int GET_DATE_FAIL = 2;

    private final int NUMBERS = 10000;
    private String phoneNum = "";

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(mLoading.isShowing()) mLoading.dismiss();
            switch (msg.what){
                case GET_DATE_SUCCESS:
                    initViewData();
                    break;
                case GET_DATE_FAIL:
                    Toast.makeText(ContactPersonActivity.this,"数据加载失败",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_person2);
        ButterKnife.bind(this);
        initTitle();
        initPopupMenu();
        myData = true;
        custid = this.getIntent().getLongExtra("custid", 0);
        //初始化比较器
        contactPinyinComparator = new ContactPinyinComparator();
        adapter = new ContactPersonAdapter(ContactPersonActivity.this, data);
        mLoading.show();
        getData();
    }

    public void initTitle(){
        more_Tv.setVisibility(View.VISIBLE);
        whoSpinner.setVisibility(View.GONE);
        titleName_Tv.setText("联系人信息");
        title_Ll.setVisibility(View.GONE);
        who_Ll.setVisibility(View.GONE);
        status_Ll.setVisibility(View.GONE);
        clearEditText.setVisibility(View.VISIBLE);
        clearEditText.setHint("按联系人姓名搜索");
    }

    public void setItemChechedLableVisible(){
        if(myData){
            item_my_checked_Tv.setVisibility(View.VISIBLE);
            item_others_checked_Tv.setVisibility(View.GONE);
            item_my_Tv.setTextColor(getResources().getColor(R.color.colorPrimary));
            item_others_Tv.setTextColor(getResources().getColor(R.color.black));
        }else {
            item_my_checked_Tv.setVisibility(View.GONE);
            item_others_checked_Tv.setVisibility(View.VISIBLE);
            item_my_Tv.setTextColor(getResources().getColor(R.color.black));
            item_others_Tv.setTextColor(getResources().getColor(R.color.colorPrimary));
        }
    }

    public void initPopupMenu(){
        popup_menu_Layout.setVisibility(View.GONE);
        item_my_Rl.setVisibility(View.VISIBLE);
        item_others_Rl.setVisibility(View.VISIBLE);
    }

    public void setSpinnerListener(){
        whoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String whos = (String) whoSpinner.getAdapter().getItem(position);
                myData = whos.equals("我的") ? true:false;
                updateData();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    //刷新数据
    private void updateData() {
        //清除数据
        adapter.notifyDataSetChanged();
        this.data.clear();
        pageNum = 1;
        mLoading.show();
        if (myData)
            getData(); //获取数据
        else
            getSubordinateData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (Config.isAddPerson) {
            Config.isAddPerson = false;
            updateData();
        }
    }

    public void initViewData() {
        sideBar.setTextView(dialog);

        //根据输入框输入值的改变来过滤搜索
        clearEditText.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //当输入框里面的值为空，更新为原来的列表，否则为过滤数据列表
                filterData(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        // 根据a-z进行排序源数据
        Collections.sort(data, contactPinyinComparator);
        //RecyclerView社置manager
        manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);

        adapter = new ContactPersonAdapter(ContactPersonActivity.this, data);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
        //给List添加点击事件
        adapter.setOnItemClickListener(new ContactPersonAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(ContactPersonActivity.this, ContactPersonDetailActivity.class);
                Contact contact = (Contact) adapter.getAll().get(position);
                intent.putExtra("contPersonId", contact.getContpersonid());
                startActivity(intent);
            }

            @Override
            public void onItemLongClickListener(View view, int position) {
            }

            @Override
            public void onTelClick(View view, int position) {
                Contact contact = (Contact) adapter.getAll().get(position);
                String mobile = contact.getContmobile();
                String tel = contact.getConttel();
                String phone = "";
                if(tel != null && !tel.equals("")){
                    phone = tel;
                }else if(mobile != null && !mobile.equals("")){
                    phone = mobile;
                }

                if(null != phone && phone.length() != 0) {
                    final String number = phone;
                    phoneNum = phone;
                    String content = "呼叫 " + phone;
                    new AlertDialog.Builder(ContactPersonActivity.this)
                            .setMessage(content)
                            .setCancelable(false)
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                    requestDialPermission(number);
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
        });

        //设置右侧SideBar触摸监听
        sideBar.setOnTouchingLetterChangedListener(new SideBar.OnTouchingLetterChangedListener() {

            @Override
            public void onTouchingLetterChanged(String s) {
                //该字母首次出现的位置
                int position = adapter.getPositionForSection(s.charAt(0));
                if (position != -1) {
                    manager.scrollToPositionWithOffset(position, 0);
                }

            }
        });
    }

    public void requestDialPermission(String number){
        List<String> permissionList = new ArrayList<>();
        if(ContextCompat.checkSelfPermission(ContactPersonActivity.this, Manifest.permission
                .CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            permissionList.add(Manifest.permission.CALL_PHONE);
        }
        if(!permissionList.isEmpty()){
            String [] permissions = permissionList.toArray(new String[permissionList.size()]);
            ActivityCompat.requestPermissions(ContactPersonActivity.this,permissions,1);
        }else {
            Dial(number);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case 1:
                if(grantResults.length > 0){
                    for(int result : grantResults){
                        if(result != PackageManager.PERMISSION_GRANTED){
                            Toast.makeText(ContactPersonActivity.this,"必须同意打电话权限",Toast.LENGTH_SHORT
                            ).show();
                            return;
                        }
                    }
                    Dial(phoneNum);
                }else {
                    Toast.makeText(ContactPersonActivity.this,"发送未知错误",Toast.LENGTH_SHORT
                    ).show();
                }
                break;
        }
    }

    //调用拨号界面
    public void Dial(String number){
        Intent intentPhone = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
        try{
            startActivity(intentPhone);
        }catch (Exception e){
            //do nothing
        }
    }

    /**
     * 根据输入框中的值来过滤数据并更新RecyclerView
     *
     * @param filterStr
     */
    private void filterData(String filterStr) {
        List<Contact> filterDateList = new ArrayList<>();

        if (TextUtils.isEmpty(filterStr)) {
            filterDateList = data;
        } else {
            filterDateList.clear();
            for (Contact contact : data) {
                String name = contact.getPersonname();
                if(null != name){
                    if (name.indexOf(filterStr.toString()) != -1 ||
                            PinyinUtils.getFirstSpell(name).startsWith(filterStr.toString())
                            //不区分大小写
                            || PinyinUtils.getFirstSpell(name).toLowerCase().startsWith(filterStr.toString())
                            || PinyinUtils.getFirstSpell(name).toUpperCase().startsWith(filterStr.toString())
                            ) {
                        filterDateList.add(contact);
                    }
                }
            }
        }

        // 根据a-z进行排序
        Collections.sort(filterDateList, contactPinyinComparator);
        adapter.updateList(filterDateList);
    }

    @OnClick({R.id.back_iv, R.id.my_tv, R.id.xs_tv, R.id.add_ib, R.id.search_bt,
            R.id.more_tv,R.id.item_my_rl,R.id.item_others_rl})
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.back_iv:
                finish();
                break;
            case R.id.my_tv:
                myData = true;
                myView.setVisibility(View.VISIBLE);
                xsView.setVisibility(View.INVISIBLE);
                updateData();
                break;
            case R.id.xs_tv:
                myData = false;
                myView.setVisibility(View.INVISIBLE);
                xsView.setVisibility(View.VISIBLE);
                updateData();
                break;
            case R.id.add_ib:
                Intent intent = new Intent(new Intent(ContactPersonActivity.this, ContactPersonAddActivity.class));
                if (custid > 0)
                    intent.putExtra("custid", custid);
                startActivity(intent);
                break;
            case R.id.search_bt:
                updateData();
                ApkApplication.imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
                break;
            case R.id.more_tv:
                popup_menu_Layout.setVisibility(View.VISIBLE);
                break;
            case R.id.item_my_rl:
                popup_menu_Layout.setVisibility(View.GONE);
                myData = true;
                updateData();
                break;
            case R.id.item_others_rl:
                popup_menu_Layout.setVisibility(View.GONE);
                myData = false;
                updateData();
                break;
        }
        setItemChechedLableVisible();
    }

    public void getData() {
        String json = "";
        if (custid > 0) {
            json = new Gson().toJson(new ContactReq(pageNum, NUMBERS, "",
                    new ContactReq.ContactReqBean(Config.USERID + "", searchEt.getText().toString().trim(), custid)));
        } else {
            json = new Gson().toJson(new ContactReq(pageNum, NUMBERS, "",
                    new ContactReq.ContactReqBean(Config.USERID + "", searchEt.getText().toString().trim())));
        }

        OkHttpUtils
                .postString()
                .url(Config.contactList)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .content(json)
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                if(mLoading.isShowing()) mLoading.dismiss();
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                if(mLoading.isShowing()) mLoading.dismiss();
                                Type userlistType = new TypeToken<Result<ListPagers<Contact>>>() {
                                }.getType();
                                status = new Gson().fromJson(response, userlistType);
                                if (status != null) {
                                    if (status.isSuccess()) {
                                        data.clear();
                                        if (status.getData().getList() != null && status.getData().getList().size() > 0) {
                                            for (int i = 0; i < status.getData().getList().size(); i++) {
//                                                Contact mContact = status.getData().getList().get(i);//.getData().getList().get(i)
//                                                LettersContact mLettersContact = transferToLettersContact(mContact);
//                                                data.add(setLetters(mLettersContact));
                                                Contact mContact = status.getData().getList().get(i);
                                                setLetters(mContact);
                                                data.add(mContact);
                                            }
                                        }
                                        adapter.setNotMoreData(true);
                                        adapter.notifyDataSetChanged();
                                        adapter.notifyItemRemoved(adapter.getItemCount());
                                    }
                                } else {
                                    adapter.notifyDataSetChanged();
                                }
                                sendMsg(GET_DATE_SUCCESS);
                            }
                        }
                );
    }

    private void sendMsg(int flag){
        Message msg = new Message();
        msg.what = flag;
        mHandler.sendMessage(msg);
    }

    public Contact setLetters(Contact contact){
        String pinyin;

        //汉字转换成拼音
        if(null == contact.getPersonname() || contact.getPersonname().trim().equals("")){
            pinyin = "#";
        }else{
            pinyin = PinyinUtils.getPingYin(contact.getPersonname());
        }

        pinyin = pinyin.trim();
        String sortString = pinyin.substring(0, 1).toUpperCase();

        // 正则表达式，判断首字母是否是英文字母
        if (sortString.matches("[A-Z]")) {
            contact.setLetters(sortString.toUpperCase());
        } else {
            contact.setLetters("#");
        }

        return contact;
    }

    public void getSubordinateData() {
        String json = new Gson().toJson(new ContactReq(pageNum, NUMBERS, "",
                new ContactReq.ContactReqBean(Config.USERID + "", searchEt.getText().toString().trim())));
        OkHttpUtils
                .postString()
                .url(Config.subPageList)
                .addHeader("checkTokenKey", Config.TOKEN)
                .addHeader("sessionKey", Config.USERID + "")
                .content(json)
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(
                        new StringCallback() {
                            @Override
                            public void onError(Call call, Exception e, int id) {
                                if(mLoading.isShowing()) mLoading.dismiss();
                                ToastUtil.showNetError();
                            }

                            @Override
                            public void onResponse(String response, int id) {
                                if(mLoading.isShowing()) mLoading.dismiss();
                                Type userlistType = new TypeToken<Result<ListPagers<Contact>>>() {
                                }.getType();
                                status = new Gson().fromJson(response, userlistType);
                                if (status != null) {
                                    if (status.isSuccess()) {
                                        data.clear();
                                        if (status.getData().getList() != null && status.getData().getList().size() > 0) {
                                            for (int i = 0; i < status.getData().getList().size(); i++) {
//                                                Contact mContact = status.getData().getList().get(i);//.getData().getList().get(i)
//                                                LettersContact mLettersContact = transferToLettersContact(mContact);
//                                                data.add(setLetters(mLettersContact));
                                                Contact mContact = status.getData().getList().get(i);
                                                setLetters(mContact);
                                                data.add(mContact);
                                            }
                                        }
                                        adapter.setNotMoreData(true);
                                        adapter.notifyDataSetChanged();
                                        adapter.notifyItemRemoved(adapter.getItemCount());
                                    }
                                } else {
                                    adapter.notifyDataSetChanged();
                                }
                                sendMsg(GET_DATE_SUCCESS);
                            }
                        }
                );
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            int x = (int) ev.getX();
            int y = (int) ev.getY();

            if (null != popup_menu_Layout && popup_menu_Layout.getVisibility() == View.VISIBLE) {
                Rect hitRect = new Rect();
                popup_menu_Layout.getGlobalVisibleRect(hitRect);
                if (!hitRect.contains(x, y)) {
                    popup_menu_Layout.setVisibility(View.GONE);
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(ev);
    }
}
