package com.zeeals.zeeals.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.zeeals.zeeals.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  27/03/17.
 */

public class SettingFragment extends Fragment {
    Switch switchnotification;
    String switchOn = "ON";
    String switchOff = "OFF";
    TextView textorder,privasi,about;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_setting, null);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        switchnotification = (Switch) rootView.findViewById(R.id.notif_switch);
        switchnotification.setChecked(true);
        switchnotification.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
//                    textnotification.setText(switchOn);
                } else {
//                    textView.setText(switchOff);
                }
            }
        });

        if (switchnotification.isChecked()) {
//            textView.setText(switchOn);
        } else {
//            textView.setText(switchOff);

        }
            return rootView;
        }

}