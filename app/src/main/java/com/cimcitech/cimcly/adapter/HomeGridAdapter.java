package com.cimcitech.cimcly.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cimcitech.cimcly.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cimcitech on 2017/7/25.
 */

public class HomeGridAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private String AppAuthStr;
    private List<Integer> ImageLists = new ArrayList<Integer>();

    private List<String> TextLists = new ArrayList<String>(){{
    }};

    private final String ad = "A";//管理员
    private final String mw = "G";//门卫
    private final String ck = "M";//仓管
    private final String sc = "N";//生产人员
    private final String ld = "Y";//领导
    private final String sa = "S";//业务员

    public List<String> getAll() {
        return TextLists;
    }

    public HomeGridAdapter(Context context,String AppAuthStr) {
        inflater = LayoutInflater.from(context);
        this.AppAuthStr = AppAuthStr;
        initAppAuth();
    }

    /*
    * 1.模块授权：在gc_user的app_auth列中授权
    *   G-门卫（车辆出厂、扫描出厂）
    *   M-仓库管理员（车辆入库、扫码入库、生产进度）
    *   N-生产人员（生产进度，检验）
    *   Y-领导（客户拜访、意向跟踪、报价单、订单合同、工作汇报、我的客户、联系人、问题反馈、回款跟踪、生产进度、报表）
    *   S-业务员（客户拜访、意向跟踪、报价单、订单合同、工作汇报、我的客户、联系人、问题反馈、回款跟踪、生产进度、发车申请)；另外不授权，缺省为业务员
    *   A-管理员（所有权限）
     */
    public void initAppAuth(){
        if(AppAuthStr != null && AppAuthStr.length() == 1){
                switch (AppAuthStr) {
                    case ck://仓库
                        addCKData();
                        break;
                    case mw://门卫
                        addMWData();
                        break;
                    case ld://领导
                        addLDData();
                        break;
                    case sa://业务员
                        addSAData();
                        break;
                    case ad://管理员
                        addADData();
                        break;
                    case sc://生产人员
                        addSCData();
                        break;
                }
        }else{
            addSAData();
        }
    }


    public void addADData(){
        ImageLists.add(R.mipmap.v2__apps_ic__legwork);
        TextLists.add("客户拜访");
        ImageLists.add(R.mipmap.v2__apps_ic__plan_work);
        TextLists.add("意向跟踪");
        ImageLists.add(R.mipmap.v2__apps_ic__expense);
        TextLists.add("报价单");
        ImageLists.add(R.mipmap.v3__apps_ic__monthly_analysis);
        TextLists.add("订单合同");
        ImageLists.add(R.mipmap.v2__apps_ic__workreport);
        TextLists.add("工作汇报");
        ImageLists.add(R.mipmap.v2__apps_ic__customer);
        TextLists.add("我的客户");
        ImageLists.add(R.mipmap.v3_crm_refund_analysis_customer);
        TextLists.add("联系人");
        ImageLists.add(R.mipmap.v2__apps_ic__task);
        TextLists.add("问题反馈");
        ImageLists.add(R.mipmap.v2__apps_ic__salesopp);
        TextLists.add("回款跟踪");
        ImageLists.add(R.mipmap.v3__mine_setting_company);
        TextLists.add("生产进度");
        ImageLists.add(R.mipmap.v4_app_ic_car_in);
        TextLists.add("车辆入库");
        ImageLists.add(R.mipmap.v4_app_ic_departrequest);
        TextLists.add("发车申请");
        ImageLists.add(R.mipmap.v4_app_ic_car_out);
        TextLists.add("车辆出厂");
        ImageLists.add(R.mipmap.v4_app_ic_qrcode_in);
        TextLists.add("扫码入库");
        ImageLists.add(R.mipmap.v4_app_ic_qrcode_out);
        TextLists.add("扫码出厂");
        ImageLists.add(R.mipmap.v2__apps_ic__crm_order);
        TextLists.add("报表");
        ImageLists.add(R.mipmap.v3__apps_test);
        TextLists.add("检验");
    }

    public void addMWData(){
        ImageLists.add(R.mipmap.v4_app_ic_car_out);
        TextLists.add("车辆出厂");
        ImageLists.add(R.mipmap.v4_app_ic_qrcode_out);
        TextLists.add("扫码出厂");
    }

    public void addCKData(){
        //生产报完工由生产人员完成。--2018.03.05
        //ImageLists.add(R.mipmap.v3__mine_setting_company);
        //TextLists.add("生产进度");
        ImageLists.add(R.mipmap.v4_app_ic_car_in);
        TextLists.add("车辆入库");
        ImageLists.add(R.mipmap.v4_app_ic_qrcode_in);
        TextLists.add("扫码入库");
    }

    public void addSCData(){
        ImageLists.add(R.mipmap.v3__mine_setting_company);
        TextLists.add("生产进度");
        ImageLists.add(R.mipmap.v3__apps_test);
        TextLists.add("检验");
    }

    public void addLDData(){
        ImageLists.add(R.mipmap.v2__apps_ic__legwork);
        TextLists.add("客户拜访");
        ImageLists.add(R.mipmap.v2__apps_ic__plan_work);
        TextLists.add("意向跟踪");
        ImageLists.add(R.mipmap.v2__apps_ic__expense);
        TextLists.add("报价单");
        ImageLists.add(R.mipmap.v3__apps_ic__monthly_analysis);
        TextLists.add("订单合同");
        ImageLists.add(R.mipmap.v2__apps_ic__workreport);
        TextLists.add("工作汇报");
        ImageLists.add(R.mipmap.v2__apps_ic__customer);
        TextLists.add("我的客户");
        ImageLists.add(R.mipmap.v3_crm_refund_analysis_customer);
        TextLists.add("联系人");
        ImageLists.add(R.mipmap.v2__apps_ic__task);
        TextLists.add("问题反馈");
        ImageLists.add(R.mipmap.v2__apps_ic__salesopp);
        TextLists.add("回款跟踪");
        ImageLists.add(R.mipmap.v3__mine_setting_company);
        TextLists.add("生产进度");
        ImageLists.add(R.mipmap.v2__apps_ic__crm_order);
        TextLists.add("报表");
    }

    public void addSAData(){
        ImageLists.add(R.mipmap.v2__apps_ic__legwork);
        TextLists.add("客户拜访");
        ImageLists.add(R.mipmap.v2__apps_ic__plan_work);
        TextLists.add("意向跟踪");
        ImageLists.add(R.mipmap.v2__apps_ic__expense);
        TextLists.add("报价单");
        ImageLists.add(R.mipmap.v3__apps_ic__monthly_analysis);
        TextLists.add("订单合同");
        ImageLists.add(R.mipmap.v2__apps_ic__workreport);
        TextLists.add("工作汇报");
        ImageLists.add(R.mipmap.v2__apps_ic__customer);
        TextLists.add("我的客户");
        ImageLists.add(R.mipmap.v3_crm_refund_analysis_customer);
        TextLists.add("联系人");
        ImageLists.add(R.mipmap.v2__apps_ic__task);
        TextLists.add("问题反馈");
        ImageLists.add(R.mipmap.v2__apps_ic__salesopp);
        TextLists.add("回款跟踪");
        ImageLists.add(R.mipmap.v3__mine_setting_company);
        TextLists.add("生产进度");
        ImageLists.add(R.mipmap.v4_app_ic_departrequest);
        TextLists.add("发车申请");
    }

    @Override
    public int getCount() {
        return ImageLists.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImgTextWrapper wrapper;
        if (convertView == null) {
            wrapper = new ImgTextWrapper();
            convertView = inflater.inflate(R.layout.home_grid_item, null);
            wrapper.imageButton = (ImageView) convertView.findViewById(R.id.logoButton);
            wrapper.textView = (TextView) convertView.findViewById(R.id.tv_logo);
            convertView.setTag(wrapper);
            convertView.setPadding(5, 10, 5, 10);
        } else {
            wrapper = (ImgTextWrapper) convertView.getTag();
        }
        wrapper.imageButton.setBackgroundResource(ImageLists.get(position));
        wrapper.textView.setText(TextLists.get(position));
        return convertView;
    }

    class ImgTextWrapper {
        ImageView imageButton;
        TextView textView;
    }
}
