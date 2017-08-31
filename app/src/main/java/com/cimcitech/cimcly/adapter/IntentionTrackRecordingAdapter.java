package com.cimcitech.cimcly.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.opport_unit.IntentionTrackRecordingVo;
import com.cimcitech.cimcly.utils.DateTool;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by cimcitech on 2017/8/10.
 */

public class IntentionTrackRecordingAdapter extends BaseAdapter {

    private List<IntentionTrackRecordingVo.DataBean> data;

    private LayoutInflater inflater;

    public IntentionTrackRecordingAdapter(Context context, List<IntentionTrackRecordingVo.DataBean> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    public List<IntentionTrackRecordingVo.DataBean> getAll() {
        return data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        IntentionTrackRecordingVo.DataBean item = data.get(i);
        if (viewHolder == null) {
            view = inflater.inflate(R.layout.intention_track_recording_list_item_view, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.productidTv.setText("产品型号：" + item.getProductid());
        viewHolder.productcountTv.setText("数量：" + item.getProductcount());
        viewHolder.plansigndateTv.setText("需求交付日：" + DateTool.getDateStr(item.getPlansigndate()));
        viewHolder.planmoneyTv.setText("金额：" + item.getPlanmoney());
        return view;
    }

    class ViewHolder {
        @Bind(R.id.productid_tv)
        TextView productidTv;
        @Bind(R.id.productcount_tv)
        TextView productcountTv;
        @Bind(R.id.plansigndate_tv)
        TextView plansigndateTv;
        @Bind(R.id.planmoney_tv)
        TextView planmoneyTv;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
