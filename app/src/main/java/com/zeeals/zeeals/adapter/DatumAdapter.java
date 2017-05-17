package com.zeeals.zeeals.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zeeals.zeeals.R;
import com.zeeals.zeeals.model.Datum;

import java.util.List;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  18/04/17.
 */

public class DatumAdapter extends RecyclerView.Adapter<DatumAdapter.ViewHolder> {
    private List<Datum> orderModelList;
    private int rowLayout;
    private Context context;

    private LayoutInflater mInflater;



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

    public DatumAdapter(List<Datum> orderModelList) {
        this.orderModelList = orderModelList;
//        this.rowLayout = rowLayout;
//        this.context = context;
    }

    @Override
    public DatumAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_item, parent, false);


        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(DatumAdapter.ViewHolder holder, final int position) {
        holder.order_no.setText(orderModelList.get(position).getEmployeeAddress());
        holder.orderdate.setText(orderModelList.get(position).getEmployeeName());
        holder.order_list.setText(orderModelList.get(position).getEmployeePhone());
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