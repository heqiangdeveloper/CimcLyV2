package com.cimcitech.cimcly.adapter.order_contract;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.cimcitech.cimcly.R;
import com.cimcitech.cimcly.adapter.PopupWindowAdapter;
import com.cimcitech.cimcly.bean.order_contract.OrderStandardDetailVo;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by apple on 2017/8/14.
 */

public class OrderContractDetailAdapter extends BaseAdapter {

    private List<OrderStandardDetailVo.DataBean.ModelFeatureDetailListBean> data;
    private OrderStandardDetailVo.DataBean model;
    private LayoutInflater inflater;
    private Context context;
    private PopupWindow pop;

    public OrderContractDetailAdapter(Context context, List<OrderStandardDetailVo.DataBean.ModelFeatureDetailListBean> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    public List<OrderStandardDetailVo.DataBean.ModelFeatureDetailListBean> getAll() {
        return data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        OrderStandardDetailVo.DataBean.ModelFeatureDetailListBean item = data.get(position);
        if (viewHolder == null) {
            view = inflater.inflate(R.layout.quoted_list_item_view, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.inputTypeEt.setVisibility(View.GONE);
        //有下拉值的
        if (item.getIntype().equals("2")) {
            viewHolder.descriptionTvTv.setText(item.getDescription() + "：");
            for (int i = 0; i < item.getPriceFeatureDetailList().size(); i++)
                if (item.getQuoteValue().equals(item.getPriceFeatureDetailList().get(i).getEnumerationvalues()))
                    viewHolder.quoteValueTvTv.setText(item.getPriceFeatureDetailList().get(i).getEnumerationdesc());
            //viewHolder.quoteValueTvTv.setOnClickListener(new onClick(position));
        } else { //没有下拉值的
            viewHolder.descriptionTvTv.setText(item.getDescription() + "：");
            viewHolder.quoteValueTvTv.setText(item.getQuoteValue());
        }
        return view;
    }


    public void showContactUsPopWin(Context context, String title, List<String> list) {
        LayoutInflater inflater = LayoutInflater.from(context);
        // 引入窗口配置文件
        View view = inflater.inflate(R.layout.dialog_add_client_view, null);
        view.getBackground().setAlpha(100);
        // 创建PopupWindow对象
        pop = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, false);
        View pop_reward_view = view.findViewById(R.id.pop_reward_view);
        TextView title_tv = view.findViewById(R.id.title_tv);
        title_tv.setText(title);
        final PopupWindowAdapter adapter = new PopupWindowAdapter(context, list);
        ListView listView = view.findViewById(R.id.listContent);
        listView.setAdapter(adapter);
        // 需要设置一下此参数，点击外边可消失
        pop.setBackgroundDrawable(new BitmapDrawable());
        // 设置点击窗口外边窗口消失
        pop.setOutsideTouchable(true);
        // 设置此参数获得焦点，否则无法点击
        pop.setFocusable(true);
        pop_reward_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pop.dismiss();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                pop.dismiss();
            }
        });
    }

    class onClick implements View.OnClickListener {

        private int position;

        public onClick(int position) {
            this.position = position;
        }

        @Override
        public void onClick(View view) {
            OrderStandardDetailVo.DataBean.ModelFeatureDetailListBean model = data.get(position);
            List<String> list = new ArrayList<>();
            for (int i = 0; i < model.getPriceFeatureDetailList().size(); i++)
                list.add(model.getPriceFeatureDetailList().get(i).getEnumerationdesc());
            showContactUsPopWin(context, "选择" + model.getDescription(), list);
            pop.showAtLocation(view, Gravity.CENTER, 0, 0);
        }
    }

    class ViewHolder {
        @Bind(R.id.description_et_tv)
        TextView descriptionEtTv;
        @Bind(R.id.red_tv)
        TextView redTv;
        @Bind(R.id.quoteValue_et_tv)
        EditText quoteValueEtTv;
        @Bind(R.id.input_type_et)
        LinearLayout inputTypeEt;
        @Bind(R.id.description_tv_tv)
        TextView descriptionTvTv;
        @Bind(R.id.quoteValue_tv_tv)
        TextView quoteValueTvTv;
        @Bind(R.id.input_type_tv)
        LinearLayout inputTypeTv;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
