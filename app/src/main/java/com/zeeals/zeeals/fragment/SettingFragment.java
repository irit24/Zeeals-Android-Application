package com.zeeals.zeeals.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.zeeals.zeeals.MainActivity;
import com.zeeals.zeeals.R;
import com.zeeals.zeeals.activity.Login;
import com.zeeals.zeeals.utils.Constant;
import com.zeeals.zeeals.utils.SessionManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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

    private SharedPreferences pref;
    Button btnexit;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_setting, null);
        ButterKnife.bind(rootView);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        btnexit = (Button) rootView.findViewById(R.id.btn_exit);

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isUserLogedOut();

            }
        });

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


    private void isUserLogedOut() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
        alertDialogBuilder.setMessage("Are you sure you want to logout?");
        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
logout();

                        //Starting login activity
 }
                });

        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

        //Showing the alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

    private void logout() {

        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(Constant.IS_LOGGED_IN,false);
        editor.putString(Constant.Username,"");
        editor.putString(Constant.Password,"");
        editor.apply();
//        goToLogin();
//        SessionManager.getInstance(getContext()).logout();
        startActivity(new Intent(getActivity(), Login.class));
    }


}



