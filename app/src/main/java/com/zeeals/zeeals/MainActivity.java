package com.zeeals.zeeals;



import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.zeeals.zeeals.fragment.OrderFragment;
import com.zeeals.zeeals.fragment.SettingFragment;
import com.zeeals.zeeals.fragment.TabFragment;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  27/03/17.
 */


public class MainActivity extends AppCompatActivity {
    private static final String SELECTED_ITEM = "arg_selected_item";

    private BottomNavigationView mBottomNav;
    private int mSelectedItem = 0;
    Fragment frag;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mBottomNav = (BottomNavigationView) findViewById(R.id.navigation);
        mBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectFragment(item);
                return true;
            }
        });

        MenuItem selectedItem;
        if (savedInstanceState != null) {
            mSelectedItem = savedInstanceState.getInt(SELECTED_ITEM, 0);
            selectedItem = mBottomNav.getMenu().findItem(mSelectedItem);
        } else {
            selectedItem = mBottomNav.getMenu().getItem(0);
        }
        selectFragment(selectedItem);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(SELECTED_ITEM, mSelectedItem);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onBackPressed() {
        MenuItem homeItem = mBottomNav.getMenu().getItem(1);
        if (mSelectedItem != homeItem.getItemId()) {
            // select home item
            selectFragment(homeItem);
        } else {
            super.onBackPressed();
        }
    }

    private void selectFragment(MenuItem item) {
        // init corresponding fragment

        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.navigation_dashboard:
                fragment = new TabFragment();

                break;
            case R.id.navigation_order:
                fragment = new OrderFragment();
                break;
            case R.id.navigation_setting:
                fragment = new SettingFragment();

                break;

        }
        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, fragment);
            fragmentTransaction.commit();
            if (fragment.isAdded()) {
                // update selected item
                mSelectedItem = item.getItemId();

                // uncheck the other items.
                for (int i = 0; i < mBottomNav.getMenu().size(); i++) {
                    MenuItem menuItem = mBottomNav.getMenu().getItem(i);
                    menuItem.setChecked(menuItem.getItemId() == item.getItemId());
                }


            }


        }


        }
    }
