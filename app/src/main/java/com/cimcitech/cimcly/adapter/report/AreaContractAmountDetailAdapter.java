package com.cimcitech.cimcly.adapter.report;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.order_contract.OrderContractVo;
import com.cimcitech.cimcly.bean.report.ContractReportDetailVo;
import com.cimcitech.cimcly.utils.DateTool;

import java.util.List;

/**
 * Created by apple on 2017/8/11.
 */

public class AreaContractAmountDetailAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    private List<ContractReportDetailVo.DataBean.PageInfoBean> data;
    private LayoutInflater inflater;
    private static final int TYPE_END = 2;
    private boolean isNotMoreData = false;

    public AreaContractAmountDetailAdapter(Context context, List<ContractReportDetailVo.DataBean.PageInfoBean> data) {
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
            View view = inflater.inflate(R.layout.order_contract_list_item_view, parent, false);
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
            final ContractReportDetailVo.DataBean.PageInfoBean item = data.get(position);
            ((ItemViewHolder) holder).client_name_tv.setText("客户名称：" + item.getCustName());
            ((ItemViewHolder) holder).status_tv.setText("订单状态：" + item.getfStateName());
            ((ItemViewHolder) holder).order_number_tv.setText((item.getOrderno() == null) ?
                    "无":item.getOrderno());//销售订单号
            ((ItemViewHolder) holder).order_money_tv.setText(item.getTotalprice() + "");
            ((ItemViewHolder) holder).contract_number_tv.setText(item.getContractno() + "");//合同号
            ((ItemViewHolder) holder).intention_number_tv.setText("产品名称：" + item.getProductVarietyDesc());
            ((ItemViewHolder) holder).product_number_tv.setText("产品型号：" + item.getProdtypecode());
            ((ItemViewHolder) holder).order_date_tv.setText("订单日期：" + DateTool.getDateStr(item.getSigndate()));
            ((ItemViewHolder) holder).expected_delivery_tv.setText("预期交货：" + DateTool.getDateStr(item.getConfirmDate()));
            ((ItemViewHolder) holder).commit_tv.setText(item.getIscommit().equals("Y") ? "是否提交：已提交审批" : "是否提交：未提交审批");
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
        TextView status_tv, client_name_tv, order_number_tv, order_money_tv, intention_number_tv, order_date_tv,
                product_number_tv, expected_delivery_tv, commit_tv,contract_number_tv;

        public ItemViewHolder(View view) {
            super(view);
            client_name_tv = view.findViewById(R.id.client_name_tv);
            status_tv = view.findViewById(R.id.status_tv);
            order_number_tv = view.findViewById(R.id.order_number_tv);
            order_money_tv = view.findViewById(R.id.order_money_tv);
            intention_number_tv = view.findViewById(R.id.intention_number_tv);
            order_date_tv = view.findViewById(R.id.order_date_tv);
            product_number_tv = view.findViewById(R.id.product_number_tv);
            expected_delivery_tv = view.findViewById(R.id.expected_delivery_tv);
            commit_tv = view.findViewById(R.id.commit_tv);
            contract_number_tv = view.findViewById(R.id.contract_number_tv);
        }
    }

    static class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }
}
