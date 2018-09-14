package com.cimcitech.cimcly.adapter.contact_person;

/**
 * Created by cimcitech on 2017/8/2.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.bean.contact.Contact;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/1.
 */

public class ContactPersonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    private List<Contact> data;
    private LayoutInflater inflater;
    private static final int TYPE_END = 2;
    private boolean isNotMoreData = false;

    public ContactPersonAdapter(Context context, List<Contact> data) {
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

        void onTelClick(View view, int position);
    }

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            View view = inflater.inflate(R.layout.contact_item_view2, parent, false);
            return new ItemViewHolder(view);
        } else if (viewType == TYPE_FOOTER) {
//            View view = inflater.inflate(R.layout.recycler_foot_view, parent, false);
//            return new FootViewHolder(view);
            View view = inflater.inflate(R.layout.recycler_end_view, parent, false);
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
                //点击电话拨号
                ((ItemViewHolder) holder).tel_Tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int position = holder.getLayoutPosition();
                        onItemClickListener.onTelClick(((ItemViewHolder) holder).tel_Tv, position);
                    }
                });
            }
            final Contact item = data.get(position);

            String  name = item.getPersonname();
            String nameIconStr;
            if(null == name || name.trim().equals("")){
                nameIconStr = "#";
            }else{
                nameIconStr = getNameStr(name);
            }
            ((ItemViewHolder) holder).icon_Tv.setText(nameIconStr);
            ((ItemViewHolder) holder).contactName_Tv.setText(item.getPersonname() != null && !item.getPersonname().equals("") ?
                    "" + item.getPersonname() : "");
            ((ItemViewHolder) holder).custName_Tv.setText(item.getCustname() != null && !item.getCustname().equals("") ?
                    "" + item.getCustname() : "");
//            ((ItemViewHolder) holder).tel_Tv.setText(item.getConttel() != null && !item.getConttel()
//                    .equals("") ? "" + item.getConttel() : "");
            String mobile = item.getContmobile();
            String tel = item.getConttel();
            String phone = "";
            if(tel != null && !tel.equals("")){
                phone = tel;
            }else if(mobile != null && !mobile.equals("")){
                phone = mobile;
            }
            ((ItemViewHolder) holder).tel_Tv.setText(phone);

            int section = getSectionForPosition(position);
            //如果当前位置等于该分类首字母的Char的位置 ，则认为是第一次出现
            if (position == getPositionForSection(section)) {
                ((ItemViewHolder) holder).tag_Tv.setVisibility(View.VISIBLE);
                ((ItemViewHolder) holder).tag_Tv.setText(data.get(position).getLetters());
            } else {
                ((ItemViewHolder) holder).tag_Tv.setVisibility(View.GONE);
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
//        TextView name_tv, client_tv, mobile_tv, phone_tv;
//
//        public ItemViewHolder(View view) {
//            super(view);
//            name_tv = view.findViewById(R.id.name_tv);
//            client_tv = view.findViewById(R.id.client_tv);
//            mobile_tv = view.findViewById(R.id.mobile_tv);
//            phone_tv = view.findViewById(R.id.phone_tv);
//        }

        TextView contactName_Tv,custName_Tv,isState_Tv,tel_Tv,tag_Tv,icon_Tv;

        public ItemViewHolder(View view) {
            super(view);
            contactName_Tv = view.findViewById(R.id.contactName_tv);
            custName_Tv = view.findViewById(R.id.custName_tv);
            isState_Tv = view.findViewById(R.id.isState_tv);
            tel_Tv = view.findViewById(R.id.tel_tv);
            tag_Tv = view.findViewById(R.id.tag_tv);
            icon_Tv = view.findViewById(R.id.icon_tv);
        }
    }

    static class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }

    public String getNameStr(String str){
        String s = "";
        if(str.length() <= 2){
            s = str;
        }else{
            //若姓名超过2位，则取最后面的2位
            s = str.substring(str.length() - 1 - 1,str.length());
        }
        return s;
    }

    /**
     * 根据ListView的当前位置获取分类的首字母的char ascii值
     */
    public int getSectionForPosition(int position) {
        return data.get(position).getLetters().charAt(0);
    }

    /**
     * 根据分类的首字母的Char ascii值获取其第一次出现该首字母的位置
     */
    public int getPositionForSection(int section) {
        for (int i = 0; i < getItemCount() -1; i++) {
            String sortStr = data.get(i).getLetters();
            char firstChar = sortStr.toUpperCase().charAt(0);
            if (firstChar == section) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 提供给Activity刷新数据
     * @param list
     */
    public void updateList(List<Contact> list){
        this.data = list;
        notifyDataSetChanged();
    }
}
