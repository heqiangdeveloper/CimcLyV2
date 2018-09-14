package com.cimcitech.cimcly.adapter.customer_visit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.home.customer_visit.CustomerVisitActivity;
import com.cimcitech.cimcly.bean.CustomerVisit;
import com.cimcitech.cimcly.utils.DateTool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import static com.cimcitech.cimcly.utils.Config.context;

/**
 * Created by cimcitech on 2017/7/31.
 */

public class CustomerVisitAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    private List<CustomerVisit> data;
    private LayoutInflater inflater;
    private static final int TYPE_END = 2;
    private boolean isNotMoreData = false;
    private Context context;

    public CustomerVisitAdapter(Context context, List<CustomerVisit> data) {
        inflater = LayoutInflater.from(context);
        this.context = context;
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
            View view = inflater.inflate(R.layout.customer_visit_list_item, parent, false);
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
            final CustomerVisit item = data.get(position);
            String custName = item.getCustname() != null && !item.getCustname().equals("") ?
                    item.getCustname() : "";
            ((ItemViewHolder) holder).user_name_tv.setText(context.getResources().getString(R
                    .string.customer_visit_cust_label) + custName);
            String time = "";
            if(item.getCreatedate() > 0 ){
                SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");
                time = format.format(item.getCreatedate());
            }
            ((ItemViewHolder) holder).time_tv.setText(time);
            String content = item.getVisitsummary() != null && !item.getVisitsummary().equals("") ?
                    item.getVisitsummary() + "" : "";
            ((ItemViewHolder) holder).content_tv.setText(context.getResources().getString(R.string
                    .customer_visit_content_label) + content);

            if(!CustomerVisitActivity.myData){
                String salesman = item.getUserName() != null && !item
                        .getUserName().equals("") ? item.getUserName() + "" : "";
                ((ItemViewHolder) holder).title_tv.setText(salesman + context.getResources()
                        .getString(R.string.customer_visit_title_label));
            }else {
                ((ItemViewHolder) holder).title_tv.setText("我" + context.getResources()
                        .getString(R.string.customer_visit_title_label));
            }
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


    static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView user_name_tv, time_tv, content_tv,title_tv;
        public ItemViewHolder(View view) {
            super(view);
            user_name_tv = view.findViewById(R.id.user_name_tv);
            time_tv = view.findViewById(R.id.customer_visit_time);
            content_tv = view.findViewById(R.id.content_tv);
            title_tv = view.findViewById(R.id.customer_visit_title);
        }
    }

    static class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }
}
