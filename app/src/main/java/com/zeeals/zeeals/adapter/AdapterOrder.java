package com.zeeals.zeeals.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.zeeals.zeeals.R;
import com.zeeals.zeeals.model.Order.OrderModel;
import com.zeeals.zeeals.utils.TextUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  27/04/17.
 */


public class AdapterOrder extends RecyclerView.Adapter<AdapterOrder.ViewHolder> implements Filterable {
    boolean data = false;

    private List<OrderModel> orderModels;
    private List<OrderModel> mFilteredList;

    public AdapterOrder(List<OrderModel> orderModelList) {
        orderModels = orderModelList;
        mFilteredList = orderModelList;
    }

    @Override
    public AdapterOrder.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.order_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterOrder.ViewHolder holder, int position) {
        holder.order_no.setText(mFilteredList.get(position).getOrderId());
//        holder.orderdate.setText(mFilteredList.get(position).getOrderDatetime());
        holder.orderdate.setText(TextUtils.getDisplayableTime(mFilteredList.get(position).getOrderDatetime()));


//        holder.orderstatus.setText(mFilteredList.get(position).getOrderStatus());

        Integer Status_Order =    mFilteredList.get(position).getOrderStatus();

        if (Status_Order == 1) {
            holder.orderstatus.setText(R.string.status_order_1);
            holder.orderstatus.setBackgroundResource(R.drawable.status_order_waiting_for_payment);
        } else if (Status_Order ==2) {
            holder.orderstatus.setText(R.string.status_order_2);
            holder.orderstatus.setBackgroundResource(R.drawable.status_order_waiting_verification);
        } else if (Status_Order ==3) {

            holder.orderstatus.setText(R.string.status_order_3);
            holder.orderstatus.setBackgroundResource(R.drawable.status_order_payment_verified);

        } else if (Status_Order ==4) {
            holder.orderstatus.setText(R.string.status_order_4);
            holder.orderstatus.setBackgroundResource(R.drawable.status_order_sent);


        }else {
            holder.orderstatus.setText(R.string.status_order_5);
            holder.orderstatus.setBackgroundColor(R.drawable.status_order_cancel);



        }

        holder.order_list.setText(mFilteredList.get(position).getMemberFullname());
    }

    @Override
    public int getItemCount() {
        return mFilteredList.size();
    }

    @Override
    public Filter getFilter() {

        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                String charString = charSequence.toString();

                if (charString.isEmpty()) {

                    mFilteredList = orderModels;
                } else {

                    ArrayList<OrderModel> filteredList = new ArrayList<>();

                    for (OrderModel orderModel : orderModels) {

                        if (orderModel.getPaymethodName().toLowerCase().contains(charString) || orderModel.getMemberFullname().toLowerCase().contains(charString) || orderModel.getOrderDatetime().toLowerCase().contains(charString) || orderModel.getOrderId().toLowerCase().contains(charString)) {

                            filteredList.add(orderModel);
                        }
                    }

                    mFilteredList = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = mFilteredList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mFilteredList = (ArrayList<OrderModel>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.status_order)
        TextView orderstatus;
        @BindView(R.id.date_order)
        TextView orderdate;
        @BindView(R.id.list_order)
        TextView order_list;
        @BindView(R.id.no_order)
        TextView order_no;


        //        private TextView orderdate,order_list,order_no, orderstatus;
        public ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);

        }
    }

}