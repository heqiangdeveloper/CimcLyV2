package com.cimcitech.cimcly.adapter.message;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.activity.message.MessageData;
import com.cimcitech.cimcly.receiver.MyReceiver;
import com.cimcitech.cimcly.utils.Config;
import com.cimcitech.cimcly.utils.MessageDataSortClass;
import com.cimcitech.cimcly.utils.MessageTime;
import com.cimcitech.cimcly.utils.Utils;
import com.cimcitech.cimcly.widget.LeftSlideView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by qianghe on 2018/8/8.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> implements LeftSlideView.IonSlidingButtonListener{
    private Context mContext;

    private List<MessageData> mDatas = new ArrayList<MessageData>();

    private IonSlidingViewClickListener mIDeleteBtnClickListener;

    private IonSlidingViewClickListener mISetBtnClickListener;

    private LeftSlideView mMenu = null;

    private SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private MessageTime msgTime;

    public static final String quotedPass = "DS3";//报价单
    public static final String contractPass = "FS05";//合同

    public Adapter(Context context, List<MessageData> data) {
        msgTime = new MessageTime();
        mContext = context;
    }

    /**
     * 注册接口的方法：点击事件。在Mactivity.java实现这些方法。
     */
    public interface IonSlidingViewClickListener {
        void onItemClick(View view, int position);//点击item正文

        void onDeleteBtnCilck(View view, int position);//点击“删除”

        void onSetBtnCilck(View view, int position);//点击“设置”
    }

    private Adapter.IonSlidingViewClickListener onIonSlidingViewClickListener;

    public void setOnItemClickListener(Adapter.IonSlidingViewClickListener onIonSlidingViewClickListener) {
        this.onIonSlidingViewClickListener = onIonSlidingViewClickListener;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup arg0, int arg1) {

        //获取自定义View的布局（加载item布局）
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_item, arg0, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        String dispalyTimeStr;
        Date date;
        MessageData item = null;
        item = mDatas.get(position);
        //String status = mContext.getResources().getString(R.string.message_contract_result);
        switch (Config.contractType){
            case 0://全部
                holder.setVisibility(true);
                break;
            case 1://通过
                if(item.getFlag().equals(MyReceiver.FLAG[0])){//报价单
                    if(item.getMessageContent().getQuoteStatus().equals(Adapter.quotedPass)){
                        holder.setVisibility(true);
                    }else{
                        holder.setVisibility(false);
                    }
                }else if(item.getFlag().equals(MyReceiver.FLAG[1])){//合同
                    if(item.getMessageContent().getfState().equals(Adapter.contractPass)){
                        holder.setVisibility(true);
                    }else{
                        holder.setVisibility(false);
                    }
                }
                break;
            case 2://未通过
                if(item.getFlag().equals(MyReceiver.FLAG[0])){//报价单
                    if(!item.getMessageContent().getQuoteStatus().equals(Adapter.quotedPass)){
                        holder.setVisibility(true);
                    }else{
                        holder.setVisibility(false);
                    }
                }else if(item.getFlag().equals(MyReceiver.FLAG[1])){//合同
                    if(!item.getMessageContent().getfState().equals(Adapter.contractPass)){
                        holder.setVisibility(true);
                    }else{
                        holder.setVisibility(false);
                    }
                }
                break;
        }
        holder.btn_Set.setText(item.getOpened() == 1 ?
                mContext.getResources().getString(R.string.message_dialog_not_opend) :
                mContext.getResources().getString(R.string.message_dialog_is_opend));

//        holder.icon_Tv.setText(item.getMessageContent().getfStatus());
//        holder.icon_Tv.setBackgroundResource(item.getMessageContent()
//                .getfStatus().trim().equals(mContext.getResources().getString(R.string
//                        .message_contract_result)) ?
//                R.mipmap.green_circle: R.mipmap.red_circle);

        if(item.getFlag().equals(MyReceiver.FLAG[0])){//报价单
            holder.icon_Iv.setImageResource(R.mipmap.quoted_jpush_icon);
        }else if(item.getFlag().equals(MyReceiver.FLAG[1])){//合同
            holder.icon_Iv.setImageResource(R.mipmap.contract_jpush_icon);
        }

        holder.msg_title_Tv.setText(item.getMessageContent().getTitle() ==
                null ? "标题":item.getMessageContent().getTitle());
        holder.msg_content_desc_Tv.setText(item.getMessageContent()
                .getMsg()== null ? "测试消息..":item.getMessageContent().getMsg());

        dispalyTimeStr = item.getTime();
        try {
            date = format2.parse(dispalyTimeStr);
            dispalyTimeStr = msgTime.getTimePoint(date.getTime());
        }catch (Exception e){
            e.printStackTrace();
        }
        holder.msg_time_Tv.setText(dispalyTimeStr);

        if(item.getOpened() == 0){//未读
            holder.msg_count_Bt.setVisibility(View.VISIBLE);
        }else{
            holder.msg_count_Bt.setVisibility(View.INVISIBLE);
        }

        //设置内容布局的宽为屏幕宽度
        holder.layout_content.getLayoutParams().width = Utils.getScreenWidth(mContext);

        if (holder instanceof Adapter.MyViewHolder) {
            if (onIonSlidingViewClickListener != null) {
                //item正文点击事件
                holder.content_Rl.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //判断是否有删除菜单打开
                        if (menuIsOpen()) {
                            closeMenu();//关闭菜单
                        } else {
                            int n = holder.getLayoutPosition();
                            onIonSlidingViewClickListener.onItemClick(v, n);
                        }
                    }
                });


                //左滑设置点击事件
                holder.btn_Set.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int n = holder.getLayoutPosition();
                        onIonSlidingViewClickListener.onSetBtnCilck(view, n);
                    }
                });


                //左滑删除点击事件
                holder.btn_Delete.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int n = holder.getLayoutPosition();
                        onIonSlidingViewClickListener.onDeleteBtnCilck(view, n);
                    }
                });
            }
        }
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView btn_Set;
        public TextView btn_Delete;
        public ViewGroup layout_content;
        TextView msg_title_Tv,msg_time_Tv,msg_content_desc_Tv;
        Button msg_count_Bt;
        ImageView icon_Iv;
        RelativeLayout content_Rl;

        public MyViewHolder(View itemView) {
            super(itemView);

            btn_Set = (TextView) itemView.findViewById(R.id.tv_set);
            btn_Delete = (TextView) itemView.findViewById(R.id.tv_delete);
            layout_content = (ViewGroup) itemView.findViewById(R.id.layout_content);

            msg_title_Tv = itemView.findViewById(R.id.msg_title_tv);
            msg_time_Tv = itemView.findViewById(R.id.msg_time_tv);
            msg_content_desc_Tv = itemView.findViewById(R.id.msg_content_desc_tv);
            msg_count_Bt = itemView.findViewById(R.id.msg_count_bt);
            icon_Iv = itemView.findViewById(R.id.icon_iv);
            content_Rl = itemView.findViewById(R.id.content_rl);

            ((LeftSlideView) itemView).setSlidingButtonListener(Adapter.this);
        }

        //自定义方法：实现RecyclerView 的item隐藏效果
        public void setVisibility(boolean isVisible){
            RecyclerView.LayoutParams param = (RecyclerView.LayoutParams)itemView.getLayoutParams();
            if (isVisible){
                param.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                param.width = LinearLayout.LayoutParams.MATCH_PARENT;
                itemView.setVisibility(View.VISIBLE);
            }else{
                itemView.setVisibility(View.GONE);
                param.height = 0;
                param.width = 0;
            }
            itemView.setLayoutParams(param);
        }
    }


    /**
     * 删除item
     * @param position
     */
    public void removeData(int position) {
        mDatas.remove(position);
        notifyItemRemoved(position);
    }


    /**
     * 删除菜单打开信息接收
     */
    @Override
    public void onMenuIsOpen(View view) {
        mMenu = (LeftSlideView) view;
    }


    /**
     * 滑动或者点击了Item监听
     *
     * @param leftSlideView
     */
    @Override
    public void onDownOrMove(LeftSlideView leftSlideView) {
        if (menuIsOpen()) {
            if (mMenu != leftSlideView) {
                closeMenu();
            }
        }
    }

    /**
     * 关闭菜单
     */
    public void closeMenu() {
        mMenu.closeMenu();
        mMenu = null;

    }

    /**
     * 判断菜单是否打开
     *
     * @return
     */
    public Boolean menuIsOpen() {
        if (mMenu != null) {
            return true;
        }
        return false;
    }

    /**
     * 提供给Activity刷新数据
     * @param list
     */
    public void updateList(List<MessageData> list){
        this.mDatas = list;
        sort();
        notifyDataSetChanged();
    }

    //对消息按时间先后排序
    public void sort(){
        MessageDataSortClass msgDataSortClass = new MessageDataSortClass();
        Collections.sort(mDatas, msgDataSortClass);
    }
}
