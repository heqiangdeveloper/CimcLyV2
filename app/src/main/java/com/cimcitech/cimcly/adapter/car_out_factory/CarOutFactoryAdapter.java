package com.cimcitech.cimcly.adapter.car_out_factory;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.car_in_storage.WaitInStorageInfo;
import com.cimcitech.cimcly.utils.DateTool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cimcitech on 2017/8/1.
 */

public class CarOutFactoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    private List<WaitInStorageInfo> data;
    private LayoutInflater inflater;
    private static final int TYPE_END = 2;
    private boolean isNotMoreData = false;
    private Map<Integer,Boolean> map = new HashMap<>();

    public CarOutFactoryAdapter(Context context, List<WaitInStorageInfo> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
        initMap();
    }

    private void initMap() {
        for (int i = 0; i < data.size(); i++) {
            map.put(i, false);
        }
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

    public Map<Integer,Boolean> getMap() {
        return map;
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
            View view = inflater.inflate(R.layout.car_out_factory_item_view, parent, false);
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
            final WaitInStorageInfo item = data.get(position);
            ((ItemViewHolder) holder).custName_Tv.setText(item.getCustName() != null ?
                    "客户：" + item.getCustName() : "客户：");
            ((ItemViewHolder) holder).contractno_Tv.setText(item.getContractNo() != null ? "合同号：" +
                    item.getContractNo() : "合同号：");
            ((ItemViewHolder) holder).vehicleno_Tv.setText(item.getVehicleno() != null ? "" +
                    item.getVehicleno() : "");//车工号
            ((ItemViewHolder) holder).userName_Tv.setText(item.getUserName() != null ? "业务员：" +
                    item.getUserName() : "业务员：");
            ((ItemViewHolder) holder).productmodel_Tv.setText(item.getProductmodel() != null ?
                    "产品型号：" + item.getProductmodel() : "产品型号：");
            ((ItemViewHolder) holder).orderno_Tv.setText(item.getSorderno() != null ?
                    "订单号：" + item.getSorderno() : "订单号：");
            ((ItemViewHolder) holder).finishdate_Tv.setText(item.getInstoragedate() != null ?
                    "完工日期：" + DateTool.getDateStr(item.getInstoragedate()) : "完工日期：");
            ((ItemViewHolder) holder).instoragedate_Tv.setText(item.getInwarehousedate() != null ?
                    "入库日期：" + DateTool.getDateStr(item.getInwarehousedate()) : "入库日期：");
            ((ItemViewHolder) holder).type_Tv.setText(item.getDepatureType() != null ?
                    "发车类型：" + item.getDepatureType() : "发车类型：");
            ((ItemViewHolder) holder).price_Tv.setText(item.getSaleUnitPrice() != 0 ?
                    "价格：" + item.getSaleUnitPrice() : "价格：");

            ((ItemViewHolder) holder).ckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    map.put(position, isChecked);
                }
            });

            if (map.get(position) == null) {
                map.put(position, false);
            }
            ((ItemViewHolder) holder).ckBox.setChecked(map.get(position));
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
        TextView contractno_Tv, vehicleno_Tv,custName_Tv,userName_Tv,productmodel_Tv,type_Tv,
                price_Tv,instoragedate_Tv,finishdate_Tv,orderno_Tv;
        CheckBox ckBox;

        public ItemViewHolder(View view) {
            super(view);
            custName_Tv = view.findViewById(R.id.custNameTv);
            contractno_Tv = view.findViewById(R.id.contractNoTv);
            vehicleno_Tv = view.findViewById(R.id.vehiclenoTv);
            userName_Tv = view.findViewById(R.id.userNameTv);
            productmodel_Tv = view.findViewById(R.id.productmodelTv);
            type_Tv = view.findViewById(R.id.typeTv);
            price_Tv = view.findViewById(R.id.priceTv);
            instoragedate_Tv = view.findViewById(R.id.instoragedateTv);
            finishdate_Tv = view.findViewById(R.id.finishdateTv);
            orderno_Tv = view.findViewById(R.id.ordernoTv);
            ckBox = view.findViewById(R.id.ck);
        }
    }

    static class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }
}
