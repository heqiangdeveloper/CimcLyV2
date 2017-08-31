package com.cimcitech.cimcly.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cimcitech.cimcly.R;

/**
 * Created by cimcitech on 2017/7/25.
 */

public class LeaderHomeGridAdapter extends BaseAdapter {

    private LayoutInflater inflater;

    private Integer[] Images = {
            R.mipmap.v2__apps_ic__legwork,
            R.mipmap.v2__apps_ic__plan_work,
            R.mipmap.v2__apps_ic__expense,
            R.mipmap.v3__apps_ic__monthly_analysis,
            R.mipmap.v2__apps_ic__workreport,
            R.mipmap.v2__apps_ic__customer,
            R.mipmap.v3_crm_refund_analysis_customer,
            R.mipmap.v2__apps_ic__task,
            R.mipmap.v2__apps_ic__salesopp,
            R.mipmap.v3__mine_setting_company,
            R.mipmap.v2__apps_ic__crm_order
    };

    private String[] texts = {
            "客户拜访",
            "意向跟踪",
            "报价单",
            "订单合同",
            "工作汇报",
            "我的客户",
            "联系人",
            "问题反馈",
            "回款跟踪",
            "生产进度",
            "报表"
    };


    public String[] getAll() {
        return texts;
    }

    public LeaderHomeGridAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return Images.length;
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
        wrapper.imageButton.setBackgroundResource(Images[position]);
        wrapper.textView.setText(texts[position]);
        return convertView;
    }

    class ImgTextWrapper {
        ImageView imageButton;
        TextView textView;

    }
}
