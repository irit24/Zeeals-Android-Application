package com.zeeals.zeeals.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zeeals.zeeals.R;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  27/03/17.
 */

public class TabFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_setting, null);


        return  rootView;
    }
}