package com.cimcitech.cimcly.adapter.quoted_price;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.quoted_price.QuotedPriceVo;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/7.
 */

public class QuotedPriceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    List<QuotedPriceVo.DataBean.PageInfoBean.ListBean> data;
    private LayoutInflater inflater;
    private static final int TYPE_END = 2;
    private boolean isNotMoreData = false;

    public QuotedPriceAdapter(Context context, List<QuotedPriceVo.DataBean.PageInfoBean.ListBean> data) {
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
            View view = inflater.inflate(R.layout.quoted_price_list_item_view, parent, false);
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
            final QuotedPriceVo.DataBean.PageInfoBean.ListBean item = data.get(position);
            ((ItemViewHolder) holder).time_tv.setText("报价时间：" + item.getCreatedate());
            ((ItemViewHolder) holder).order_number_tv.setText(item.getQuoteid()+"");
            ((ItemViewHolder) holder).status_tv.setText(item.getQuoteStatusValue());
            ((ItemViewHolder) holder).order_money_tv.setText(item.getQuoteCarType() + "");
            ((ItemViewHolder) holder).count_Tv.setText(item.getProductCount() + "");
            ((ItemViewHolder) holder).client_name_tv.setText(item.getCustName() != null ? "客户：" + item.getCustName() : "客户：");
            ((ItemViewHolder) holder).creator_name_Tv.setText(item.getCreatorName() != null ? "业务员：" +
                    item.getCreatorName() : "业务员：");
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
        TextView client_name_tv, time_tv, status_tv, order_number_tv, order_money_tv,count_Tv,
                creator_name_Tv;

        public ItemViewHolder(View view) {
            super(view);
            client_name_tv = view.findViewById(R.id.client_name_tv);
            time_tv = view.findViewById(R.id.time_tv);
            status_tv = view.findViewById(R.id.status_tv);
            order_number_tv = view.findViewById(R.id.order_number_tv);
            order_money_tv = view.findViewById(R.id.order_money_tv);
            count_Tv = view.findViewById(R.id.count_tv);
            creator_name_Tv = view.findViewById(R.id.creator_name_tv);
        }
    }

    static class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }
}
