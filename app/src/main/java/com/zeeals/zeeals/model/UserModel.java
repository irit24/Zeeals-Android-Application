package com.zeeals.zeeals.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


/**
 * Created by Ilyasa Ridho on 20/01/2017.
 */

public class UserModel implements Parcelable   {

    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;

    public UserModel(String username , String password)
    {
this.username = username;
        this.password = password;
    }

    protected UserModel(Parcel in) {

        username = in.readString();
        password = in.readString();

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(username);
        dest.writeString(password);
 }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<UserModel> CREATOR = new Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel in) {
            return new UserModel(in);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Creator<UserModel> getCREATOR() {
        return CREATOR;
    }
}