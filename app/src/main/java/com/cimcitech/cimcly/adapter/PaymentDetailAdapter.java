package com.cimcitech.cimcly.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.payment.PaymentCustomer;
import com.cimcitech.cimcly.bean.payment.PaymentCustomerDetail;
import com.cimcitech.cimcly.utils.DateTool;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/1.
 */

public class PaymentDetailAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    private List<PaymentCustomerDetail.DetailData> data;
    private LayoutInflater inflater;
    private static final int TYPE_END = 2;
    private boolean isNotMoreData = false;

    public PaymentDetailAdapter(Context context, List<PaymentCustomerDetail.DetailData> data) {
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
            View view = inflater.inflate(R.layout.payment_detail_item_view, parent, false);
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
            final PaymentCustomerDetail.DetailData item = data.get(position);

            ((ItemViewHolder) holder).order_no_Tv.setText(item.getSorderid() > 0 ? "" +
                    item.getSorderid() : "");
            ((ItemViewHolder) holder).agree_no_Tv.setText(item.getContractno() != null ? ""
                    + item.getContractno() : "");
            ((ItemViewHolder) holder).cust_name_Tv.setText(item.getCustName() != null ? "" + item
                    .getCustName() : "");
            ((ItemViewHolder) holder).pay_bank_Tv.setText(item.getCollectBank() != null ? "" +
                    item.getCollectBank() : "");
            ((ItemViewHolder) holder).pay_type_Tv.setText(item.getRemitmethod() != null ? ""
                    + item.getRemitmethod() : "");

            ((ItemViewHolder) holder).pay_date_Tv.setText(item.getTransactionDate() > 0 ?
                    DateTool.getDateStr(item.getTransactionDate()) : "");
            ((ItemViewHolder) holder).pay_amount_Tv.setText(item.getTransactionAmount() != null ? "" +
                    item.getTransactionAmount() : "");
            ((ItemViewHolder) holder).check_date_Tv.setText(item.getCreatedate() > 0 ?
                    DateTool.getDateStr(item.getCreatedate()) : "");


            ((ItemViewHolder) holder).depositAmount_Tv.setText(item.getDepositamount() != null ? "银行入账定金：" +
                    item.getDepositamount() : "银行入账定金：");
            ((ItemViewHolder) holder).residualAmount_Tv.setText(item.getResidualamount() != null
                    ? "银行入账尾款："
                    + item.getResidualamount() : "银行入账尾款：");
            ((ItemViewHolder) holder).strikeMoney_Tv.setText(item.getStrikemoney() != null ?
                    "采购抵充：" + item
                    .getStrikemoney() : "采购抵充：");
            ((ItemViewHolder) holder).paymentarrears_Tv.setText(item.getPaymentarrears() != null ? "三方协议抵充：" +
                    item
                    .getPaymentarrears() : "三方协议抵充：");
            ((ItemViewHolder) holder).handoffMoney_Tv.setText(item.getHandoffmoney() != null ?
                    "手工充账："
                    + item.getHandoffmoney() : "手工充账：");
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
        TextView order_no_Tv,agree_no_Tv,cust_name_Tv,pay_bank_Tv,pay_type_Tv,money_type_Tv,
                pay_date_Tv,pay_amount_Tv,check_date_Tv;
        TextView depositAmount_Tv,residualAmount_Tv,strikeMoney_Tv,paymentarrears_Tv,
                handoffMoney_Tv;

        public ItemViewHolder(View view) {
            super(view);
            client_name_Tv = view.findViewById(R.id.client_name_tv);
            //total_price_Tv = view.findViewById(R.id.total_price_tv);
            //residual_Tv = view.findViewById(R.id.residual_tv);

            depositAmount_Tv = view.findViewById(R.id.depositAmount_tv);
            residualAmount_Tv = view.findViewById(R.id.residualAmount_tv);
            strikeMoney_Tv = view.findViewById(R.id.strikeMoney_tv);
            paymentarrears_Tv = view.findViewById(R.id.paymentarrears_tv);
            handoffMoney_Tv = view.findViewById(R.id.handoffMoney_tv);

            order_no_Tv = view.findViewById(R.id.order_no_tv);
            agree_no_Tv = view.findViewById(R.id.agree_no_tv);
            cust_name_Tv = view.findViewById(R.id.cust_name_tv);
            pay_bank_Tv = view.findViewById(R.id.pay_bank_tv);
            pay_type_Tv = view.findViewById(R.id.pay_type_tv);
            money_type_Tv = view.findViewById(R.id.money_type_tv);
            pay_date_Tv = view.findViewById(R.id.pay_date_tv);
            pay_amount_Tv = view.findViewById(R.id.pay_amount_tv);
            check_date_Tv = view.findViewById(R.id.check_date_tv);
        }
    }

    static class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }
}
