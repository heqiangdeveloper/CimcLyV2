package com.cimcitech.cimcly.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.client.Customer;
import com.cimcitech.cimcly.bean.payment.PaymentCustomer;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/1.
 */

public class PaymentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    private List<PaymentCustomer> data;
    private LayoutInflater inflater;
    private static final int TYPE_END = 2;
    private boolean isNotMoreData = false;

    public PaymentAdapter(Context context, List<PaymentCustomer> data) {
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
            View view = inflater.inflate(R.layout.payment_item_view, parent, false);
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
            final PaymentCustomer item = data.get(position);
            ((ItemViewHolder) holder).client_name_Tv.setText(item.getCustName() != null ? "客户名称：" + item
                    .getCustName() : "客户名称：");
            ((ItemViewHolder) holder).total_price_Tv.setText(item.getTotalPrice() != null ? "总价："
                    + item.getTotalPrice() : "总价：");
            ((ItemViewHolder) holder).residual_Tv.setText(item.getResidual() != null ? "欠款总数：" +
                    item
                    .getResidual() : "欠款总数：");

            ((ItemViewHolder) holder).depositAmount_Tv.setText(item.getDepositAmount() != null ? "银行入账定金：" +
                    item
                    .getDepositAmount() : "银行入账定金：");
            ((ItemViewHolder) holder).residualAmount_Tv.setText(item.getResidualAmount() != null ? "银行入账尾款："
                    + item.getResidualAmount() : "银行入账尾款：");
            ((ItemViewHolder) holder).strikeMoney_Tv.setText(item.getStrikeMoney() != null ? "采购抵充：" + item
                    .getStrikeMoney() : "采购抵充：");
            ((ItemViewHolder) holder).paymentarrears_Tv.setText(item.getPaymentarrears() != null ? "三方协议抵充：" +
                    item
                    .getPaymentarrears() : "三方协议抵充：");
            ((ItemViewHolder) holder).handoffMoney_Tv.setText(item.getHandoffMoney() != null ? "手工充账："
                    + item.getHandoffMoney() : "手工充账：");
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
        TextView client_name_Tv, total_price_Tv, residual_Tv;
        TextView depositAmount_Tv,residualAmount_Tv,strikeMoney_Tv,paymentarrears_Tv,
                handoffMoney_Tv;

        public ItemViewHolder(View view) {
            super(view);
            client_name_Tv = view.findViewById(R.id.client_name_tv);
            total_price_Tv = view.findViewById(R.id.total_price_tv);
            residual_Tv = view.findViewById(R.id.residual_tv);

            depositAmount_Tv = view.findViewById(R.id.depositAmount_tv);
            residualAmount_Tv = view.findViewById(R.id.residualAmount_tv);
            strikeMoney_Tv = view.findViewById(R.id.strikeMoney_tv);
            paymentarrears_Tv = view.findViewById(R.id.paymentarrears_tv);
            handoffMoney_Tv = view.findViewById(R.id.handoffMoney_tv);
        }
    }

    static class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }
}
