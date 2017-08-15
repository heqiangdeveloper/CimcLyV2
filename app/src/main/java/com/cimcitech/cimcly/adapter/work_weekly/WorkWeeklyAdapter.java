package com.cimcitech.cimcly.adapter.work_weekly;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.work_weekly.WorkWeeklyVo;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.DateTool;

import java.util.List;

/**
 * Created by apple on 2017/8/14.
 */


public class WorkWeeklyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    private List<WorkWeeklyVo.DataBean.ListBean> data;
    private LayoutInflater inflater;
    private static final int TYPE_END = 2;
    private boolean isNotMoreData = false;

    public WorkWeeklyAdapter(Context context, List<WorkWeeklyVo.DataBean.ListBean> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    public void setNotMoreData(boolean b) {
        this.isNotMoreData = b;
    }

    public boolean isNotMoreData() {
        return isNotMoreData;
    }

    public List getAll() {
        return data;
    }


    public interface OnItemClickListener {
        void onItemClick(View view, int position);

        void onItemLongClickListener(View view, int position);
    }

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            View view = inflater.inflate(R.layout.work_weekly_list_item_view, parent, false);
            return new ItemViewHolder(view);
        } else if (viewType == TYPE_FOOTER) {
            View view = inflater.inflate(R.layout.recycler_foot_view, parent, false);
            return new FootViewHolder(view);
        } else if (viewType == TYPE_END) {
            View view = inflater.inflate(R.layout.recycler_end_view, parent, false);
            return new FootViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof ItemViewHolder) {
            if (onItemClickListener != null) {
                holder.itemView.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        int position = holder.getLayoutPosition();
                        onItemClickListener.onItemClick(holder.itemView, position);
                    }
                });
                holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {

                    @Override
                    public boolean onLongClick(View view) {
                        int position = holder.getLayoutPosition();
                        onItemClickListener.onItemClick(holder.itemView, position);
                        return false;
                    }
                });
            }
            final WorkWeeklyVo.DataBean.ListBean item = data.get(position);
            ((ItemViewHolder) holder).name_tv.setText(item.getUserName());
            ((ItemViewHolder) holder).time_tv.setText(DateTool.getDateStr(item.getCreatedate()));
            ((ItemViewHolder) holder).content_tv.setText(DateTool.getDateStr(
                    item.getCreatedate()).equals(DateTool.getDateStr(item.getBegintime())) ?
                    "汇报时间：" + DateTool.getDateStr(
                            item.getCreatedate()) :
                    "汇报时间：从" + DateTool.getDateStr(
                            item.getCreatedate()) + "至" +
                            DateTool.getDateStr(item.getBegintime()));
            ((ItemViewHolder) holder).location_tv.setText(item.getSignInAddress() != null ? item.getSignInAddress() : "");
            ((ItemViewHolder) holder).type_tv.setText(item.getReportTypeDesc() + "");
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position + 1 == getItemCount()) {
            if (isNotMoreData())
                return TYPE_END;
            else
                return TYPE_FOOTER;
        } else
            return TYPE_ITEM;
    }

    @Override
    public int getItemCount() {
        return data.size() == 0 ? 0 : data.size() + 1;
    }


    class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView name_tv, time_tv, content_tv, type_tv, location_tv;

        public ItemViewHolder(View view) {
            super(view);
            content_tv = view.findViewById(R.id.content_tv);
            name_tv = view.findViewById(R.id.name_tv);
            time_tv = view.findViewById(R.id.time_tv);
            type_tv = view.findViewById(R.id.type_tv);
            location_tv = view.findViewById(R.id.location_tv);
        }
    }

    class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }
}