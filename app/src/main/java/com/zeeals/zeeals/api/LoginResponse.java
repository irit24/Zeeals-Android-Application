package com.zeeals.zeeals.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.zeeals.zeeals.model.UserModel;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  06/04/17.
 */

public class LoginResponse {
    @SerializedName("elapsed_time")
    @Expose
    private String elapsedTime;
    @SerializedName("parameter")
    @Expose
    private String parameter;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    private UserModel user;

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}