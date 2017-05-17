package com.zeeals.zeeals.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.zeeals.zeeals.R;
import com.zeeals.zeeals.model.Order.OrderModel;

import java.util.List;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  11/04/17.
 */

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> implements Filterable {
    private List<OrderModel> orderModelList;
    private int rowLayout;
    private Context context;

    private LayoutInflater mInflater;

    @Override
    public Filter getFilter() {
        return null;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
//        LinearLayout homelayout;
        TextView orderdate;
        TextView order_list;
        TextView order_no;


        public ViewHolder(View v) {
            super(v);
//            homelayout = (LinearLayout) v.findViewById(R.id.home_layout);
            orderdate = (TextView) v.findViewById(R.id.date_order);
            order_list = (TextView) v.findViewById(R.id.list_order);
            order_no = (TextView) v.findViewById(R.id.no_order);
        }
    }

    public OrderAdapter(List<OrderModel> orderModelList) {
        this.orderModelList = orderModelList;
//        this.rowLayout = rowLayout;
//        this.context = context;
 }

    @Override
    public OrderAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_item, parent, false);


        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(OrderAdapter.ViewHolder holder, final int position) {
        holder.order_no.setText(orderModelList.get(position).getOrderId());
        holder.orderdate.setText(orderModelList.get(position).getOrderDatetime());

        holder.order_list.setText(orderModelList.get(position).getMemberFullname());
    }

    @Override
    public int getItemCount() {
//        int a ;
//
//        if(orderModelList != null && !orderModelList.isEmpty()) {
//
//            a = orderModelList.size();
//        }
//        else {
//
//            a = 0;
//
//        }
//
//        return a;

        return orderModelList.size();
    }
}