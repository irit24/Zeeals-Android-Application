package com.zeeals.zeeals.notification;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.zeeals.zeeals.R;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  25/04/17.
 */

public class NotificationDialog extends DialogFragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //set dialog title
        getDialog().setTitle("dialog box");
        //Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.notification_dialog, container, false);
        //create a reference to the Button
        Button bt=(Button)view.findViewById(R.id.btok);
        //add click listener to the button
        bt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                dismiss(); //close the dialog
            }
        });
        return view;
    }


    public void show() {

    }
}
