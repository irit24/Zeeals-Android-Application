package com.zeeals.zeeals.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.zeeals.zeeals.MainActivity;
import com.zeeals.zeeals.R;
import com.zeeals.zeeals.fragment.OrderFragment;
import com.zeeals.zeeals.fragment.SettingFragment;
import com.zeeals.zeeals.fragment.TabFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  10/05/17.
 */

public class DetailOrder extends AppCompatActivity  {

    BottomNavigationView bottomNavigationView ;
    Fragment fragment;
    private int mSelectedItem = 0;
    private static final String SELECTED_ITEM = "arg_selected_item";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        ButterKnife.bind(this);
        setContentView(R.layout.activity_detail_order);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getFragmentManager().popBackStack();
        getSupportFragmentManager().popBackStack();

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        if(getPreferences(0).getBoolean(Constant.IS_LOGGED_IN,true)){
//
//            finish();
//            startActivity(new Intent(this, Login.class));
//        }




//        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                return true;
//            }
//        });




        Bundle extra = getIntent().getExtras();
        String member_fullname = extra.getString("member_fullname");
        TextView txtitem = (TextView) findViewById(R.id.nama_order);
        txtitem.setText(member_fullname);
        // for Title

        Bundle extraimage = getIntent().getExtras();
        String order_id = extraimage.getString("order_id");
        TextView order = (TextView) findViewById(R.id.order_id);
        order.setText(order_id);

        // For thumbnail

        Bundle extradate = getIntent().getExtras();
        String date = extradate.getString("order_datetime");
        TextView txtdate = (TextView) findViewById(R.id.date_order);
        txtdate.setText(date);
        // for Date

        Bundle extratags = getIntent().getExtras();
        Integer tags = extratags.getInt("order_status");
        TextView txttags = (TextView) findViewById(R.id.status_order);

        if (tags == 1) {
            txttags.setText(R.string.status_order_1);
//            txttags.setTextColor(Color.RED);
        } else if (tags == 2) {

            txttags.setText(R.string.status_order_2);
//            txttags.setTextColor(Color.GREEN);
        } else if (tags == 3) {

            txttags.setText(R.string.status_order_3);
//            txttags.setTextColor(Color.YELLOW);
        } else if (tags == 4) {
            txttags.setText(R.string.status_order_4);
//            txttags.setTextColor(Color.MAGENTA);

        } else {
            txttags.setText(R.string.status_order_5);
//            txttags.setTextColor(Color.LTGRAY);
        }
    }
}