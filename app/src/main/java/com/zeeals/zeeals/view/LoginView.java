package com.zeeals.zeeals.view;

import android.content.Intent;

import com.zeeals.zeeals.model.UserModel;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  06/04/17.
 */


public interface LoginView {
    String getUsername();

    void showUsernameError(int resId);

    String getPassword();

    void showPasswordError(int resId);

    void startMainAtivity(UserModel user);


    void showToastLoginSuccess();

    void showToastLoginFailure();

    void setProgressDialogVisible();

    void setProgressDialogInVisible();
}
