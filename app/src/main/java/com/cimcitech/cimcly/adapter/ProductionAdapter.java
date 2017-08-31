package com.cimcitech.cimcly.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.home.production.ProductionActivity;
import com.cimcitech.cimcly.bean.payment.PaymentCustomer;
import com.cimcitech.cimcly.bean.production.ProductionInfo;
import com.cimcitech.cimcly.utils.DateTool;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/1.
 */

public class ProductionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    private List<ProductionInfo> data;
    private LayoutInflater inflater;
    private static final int TYPE_END = 2;
    private boolean isNotMoreData = false;

    public ProductionAdapter(Context context, List<ProductionInfo> data) {
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
            View view = inflater.inflate(R.layout.production_item_view, parent, false);
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
            final ProductionInfo item = data.get(position);
            ((ItemViewHolder) holder).order_name_Tv.setText(item.getSorderno() != null ? "订单号：" +
                    item
                    .getSorderno() : "订单号：");
            ((ItemViewHolder) holder).product_model_Tv.setText(item.getProductmodel() != null ?
                    "产品型号："
                    + item.getProductmodel() : "产品型号：");
            ((ItemViewHolder) holder).is_finish_Tv.setText(item.isfinish() != false ? "是否下线：" +
                    "是" : "是否下线：" + "否");
            ((ItemViewHolder) holder).confirmdate_Tv.setText(item.getConfirmdate() > 0 ? "预计交付日：" +
                    DateTool.getDateStr(item.getConfirmdate()) : "预计交付日：");
            ((ItemViewHolder) holder).vehicleno_Tv.setText(item.getVehicleno() != null ? "车工号：" +
                    item.getVehicleno() : "车工号：");
            if(!ProductionActivity.myData){
                ((ItemViewHolder) holder).salesman_Tv.setVisibility(View.VISIBLE);
                ((ItemViewHolder) holder).salesman_Tv.setText(item.getUserName() != null ?
                        "业务员："
                                + item.getUserName() : "业务员：");
            }else{
                ((ItemViewHolder) holder).salesman_Tv.setVisibility(View.GONE);
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
        TextView order_name_Tv, salesman_Tv, product_model_Tv, is_finish_Tv,confirmdate_Tv,
        vehicleno_Tv;

        public ItemViewHolder(View view) {
            super(view);
            order_name_Tv = view.findViewById(R.id.order_name_tv);
            product_model_Tv = view.findViewById(R.id.product_model_tv);
            is_finish_Tv = view.findViewById(R.id.is_finish_tv);
            confirmdate_Tv = view.findViewById(R.id.confirmdate_tv);
            vehicleno_Tv = view.findViewById(R.id.vehicleno_tv);
            salesman_Tv = view.findViewById(R.id.salesman_tv);
        }
    }

    static class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }
}
