package com.cimcitech.cimcly.adapter.car_in_storage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.home.car_in_storage.CarInStorageActivity;
import com.cimcitech.cimcly.bean.car_in_storage.WaitInStorageInfo;
import com.cimcitech.cimcly.utils.DateTool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cimcitech on 2017/8/1.
 */

public class AlreadyInStorageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    private List<WaitInStorageInfo> data;
    private LayoutInflater inflater;
    private static final int TYPE_END = 2;
    private boolean isNotMoreData = false;
    private Map<Integer,Boolean> map = new HashMap<>();

    public AlreadyInStorageAdapter(Context context, List<WaitInStorageInfo> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
        initMap();
    }

    private void initMap() {
        for (int i = 0; i < data.size(); i++) {
            map.put(i, false);//将所有的checkbox重置为未选中状态
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
            View view = inflater.inflate(R.layout.car_in_storage_item_view, parent, false);
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
        //map.clear();
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
            ((ItemViewHolder) holder).vehicleno_Tv.setText(item.getVehicleno() != null ?
                    item.getVehicleno() : "");
            ((ItemViewHolder) holder).userName_Tv.setText(item.getUserName() != null ? "业务员：" +
                    item.getUserName() : "业务员：");
            ((ItemViewHolder) holder).productmodel_Tv.setText(item.getProductmodel() != null ?
                    "产品型号：" + item.getProductmodel() : "产品型号：");
            ((ItemViewHolder) holder).orderno_Tv.setText(item.getSorderno() != null ?
                    "订单号: " + item.getSorderno() : "订单号：");
            ((ItemViewHolder) holder).finish_Tv.setText(item.getInstoragedate() != null ?
                    "完工日期: " + DateTool.getDateStr(item.getInstoragedate()) : "完工日期: ");
            if(!CarInStorageActivity.isWaitInStorage ){
                ((ItemViewHolder) holder).instorage_Linear.setVisibility(View.VISIBLE);
                ((ItemViewHolder) holder).instoragedate_Tv.setText(item.getInwarehousedate() != null ?
                        "入库日期: " + DateTool.getDateStr(item.getInwarehousedate()) : "入库日期: ");
            }else {
                ((ItemViewHolder) holder).instorage_Linear.setVisibility(View.GONE);
            }

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
        LinearLayout instorage_Linear;
        TextView contractno_Tv, vehicleno_Tv,custName_Tv,userName_Tv,productmodel_Tv,orderno_Tv,
                finish_Tv,instoragedate_Tv;
        CheckBox ckBox;

        public ItemViewHolder(View view) {
            super(view);
            instorage_Linear = view.findViewById(R.id.instorage_linear);
            custName_Tv = view.findViewById(R.id.custNameTv);
            contractno_Tv = view.findViewById(R.id.contractNoTv);
            vehicleno_Tv = view.findViewById(R.id.vehiclenoTv);
            userName_Tv = view.findViewById(R.id.userNameTv);
            productmodel_Tv = view.findViewById(R.id.productmodelTv);
            orderno_Tv = view.findViewById(R.id.ordernoTv);
            finish_Tv = view.findViewById(R.id.finishdateTv);
            instoragedate_Tv = view.findViewById(R.id.instoragedateTv);
            ckBox = view.findViewById(R.id.ck);
        }
    }

    static class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }
}
