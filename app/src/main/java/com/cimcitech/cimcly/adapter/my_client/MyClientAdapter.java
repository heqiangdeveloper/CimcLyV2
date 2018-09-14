package com.cimcitech.cimcly.adapter.my_client;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.adapter.contact_person.ContactPersonAdapter;
import com.cimcitech.cimcly.bean.client.Client;
import com.cimcitech.cimcly.bean.contact.Contact;

import java.util.List;

/**
 * Created by cimcitech on 2017/8/1.
 */

public class MyClientAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_FOOTER = 1;
    private List<Client> data;
    private LayoutInflater inflater;
    private static final int TYPE_END = 2;
    private boolean isNotMoreData = false;

    public MyClientAdapter(Context context, List<Client> data) {
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
            View view = inflater.inflate(R.layout.my_client_item_view2, parent, false);
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
            }
            final Client item = data.get(position);
            String  name = item.getCustname();
            String nameIconStr;
            if(null == name || name.trim().equals("")){
                nameIconStr = "#";
            }else{
                nameIconStr = getNameStr(name);
            }
            ((ItemViewHolder) holder).icon_Tv.setText(nameIconStr);

            ((ItemViewHolder) holder).client_name_tv.setText(item.getCustname() != null ? "" + item.getCustname() : "");
            ((ItemViewHolder) holder).client_code_tv.setText(item.getCustomerno() != null ? "" + item.getCustomerno() : "");
            ((ItemViewHolder) holder).seller_tv.setText(item.getOwnername() != null ? "" + item.getOwnername() : "");

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
        TextView client_name_tv, client_code_tv, seller_tv,tag_Tv,icon_Tv;

        public ItemViewHolder(View view) {
            super(view);
            client_name_tv = view.findViewById(R.id.client_name_tv);
            client_code_tv = view.findViewById(R.id.client_code_tv);
            seller_tv = view.findViewById(R.id.seller_tv);
            tag_Tv = view.findViewById(R.id.tag_tv);
            icon_Tv = view.findViewById(R.id.icon_tv);
        }
    }

    static class FootViewHolder extends RecyclerView.ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }

    //取客户名称的前2位
    public String getNameStr(String str){
        String s = "";
        if(str.length() <= 2){
            s = str;
        }else{
            //若姓名超过2位，则取最后面的2位
            s = str.substring(0,2);
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
    public void updateList(List<Client> list){
        this.data = list;
        notifyDataSetChanged();
    }
}
