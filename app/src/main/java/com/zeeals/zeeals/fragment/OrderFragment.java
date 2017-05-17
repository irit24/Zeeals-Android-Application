package com.zeeals.zeeals.fragment;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.zeeals.zeeals.R;
import com.zeeals.zeeals.activity.DetailOrder;
import com.zeeals.zeeals.adapter.AdapterOrder;
import com.zeeals.zeeals.api.ApiClient;
import com.zeeals.zeeals.api.ApiInterface;
import com.zeeals.zeeals.api.OrderResponse;
import com.zeeals.zeeals.model.Order.OrderModel;
import com.zeeals.zeeals.model.Order.OrderPost;
import com.zeeals.zeeals.utils.ConnectivityReceiver;
import com.zeeals.zeeals.utils.Constant;
import com.zeeals.zeeals.utils.RecyclerTouchListener;

import java.util.ArrayList;
import java.util.List;


import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  27/03/17.
 */

public class OrderFragment extends Fragment {
    private List<OrderModel> orderModelList = new ArrayList<>();
    @BindView(R.id.swipe_order)
    SwipeRefreshLayout swipeLayout;
    AdapterOrder adapter;
    @BindView(R.id.txt_empty)
    TextView textView;
    @BindView(R.id.rv_order)
    RecyclerView rv;
    boolean isConnected = ConnectivityReceiver.isConnected();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(
                R.layout.activity_order, container, false);
        ButterKnife.bind(this, view);
        setHasOptionsMenu(true);
        getFragmentManager().popBackStack();

        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(mLayoutManager);
        rv.setHasFixedSize(true);
        adapter = new AdapterOrder(orderModelList);
        rv.setAdapter(adapter);
        swipeLayout.setColorSchemeResources(
                android.R.color.holo_blue_bright,
                android.R.color.holo_orange_light,
                android.R.color.holo_green_light,
                android.R.color.holo_red_light
        );

        rv.addOnItemTouchListener(new RecyclerTouchListener(getContext(), rv, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                OrderModel Order = orderModelList.get(position);
                Intent i = new Intent(getContext(), DetailOrder.class);
                String name = Order.getMemberFullname();
                i.putExtra("member_fullname", name);
                String Id = Order.getOrderId();
                i.putExtra("order_id", Id);
                Integer orderStatus = Order.getOrderStatus();
                i.putExtra("order_status", orderStatus);

                String time = Order.getOrderDatetime();
                i.putExtra("order_datetime", time);

                startActivity(i);
                getFragmentManager().popBackStack();




            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        loadJson();
        return view;
    }



    private void loadJson() {


        swipeLayout.setRefreshing(true);

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder();

        client.addInterceptor(loggingInterceptor);
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        OrderPost order = new OrderPost();
        order.setKey(0);
        order.setLimit(24);
        order.setOffset(0);


        Call<OrderResponse> response = apiService.getOrder(order);
        response.enqueue(new Callback<OrderResponse>() {
            @Override
            public void onResponse(Call<OrderResponse> call, retrofit2.Response<OrderResponse> response) {



// Log.d("Retrofit ",response.body().toString());
                orderModelList = response.body().getResult();
//                orderModelList = response.body().getResult();
                adapter = new AdapterOrder(orderModelList);
                rv.setAdapter(adapter);
                adapter.notifyDataSetChanged();

                Log.d(Constant.SUCCESS, response.body().getMessage());
                swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        onRefreshPage();
                    }
                });

                checkData();
//                if (pg.isShowing()) pg.dismiss();


                swipeLayout.setRefreshing(false);
//                textView.setVisibility(View.INVISIBLE);

            }


            @Override
            public void onFailure(Call<OrderResponse> call, Throwable t) {
                Log.e("Error", t.getMessage());
                swipeLayout.setRefreshing(false);
                Snackbar.make(getView(), t.getMessage(), Snackbar.LENGTH_LONG).show();
                textView.setVisibility(View.VISIBLE);
//                rv.setVisibility(View.INVISIBLE);

//                Snackbar.make(getView(), t.getLocalizedMessage(), Snackbar.LENGTH_LONG).show();

            }
        });
    }

    private void checkData() {
        if (orderModelList.isEmpty()) {
            textView.setVisibility(View.VISIBLE);
            rv.setVisibility(View.GONE);
        } else {
            textView.setVisibility(View.GONE);
            rv.setVisibility(View.VISIBLE);
        }

    }

    private void onRefreshPage() {
        Toast.makeText(getActivity(), "On Refresh..", Toast.LENGTH_SHORT).show();
        swipeLayout.setRefreshing(false);

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);
        MenuItem search = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(search);
        search(searchView);
        return;


    }

    private void search(SearchView searchView) {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);


    }


}




