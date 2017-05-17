package com.zeeals.zeeals;

import android.app.Application;

import com.zeeals.zeeals.utils.ConnectivityReceiver;


/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  07/04/17.
 */
public class MyApplication extends Application {

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}