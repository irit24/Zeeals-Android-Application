package com.zeeals.zeeals.utils;

import java.util.HashMap;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

import com.zeeals.zeeals.model.UserModel;


public class SessionManager {

	private static SessionManager mInstance;
	private static Context mCtx;

	private static final String SHARED_PREF_NAME = "simplifiedcodingsharedprefretrofit";

	private static final String KEY_USER_NAME = "username";
	private  static final  String KEY_PASSWORD = "password";

	private SessionManager(Context context) {
		mCtx = context;
	}

	public static synchronized SessionManager getInstance(Context context) {
		if (mInstance == null) {
			mInstance = new SessionManager(context);
		}
		return mInstance;
	}

	public boolean userLogin(UserModel user) {
		SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString(KEY_USER_NAME, user.getUsername());
		editor.putString(KEY_PASSWORD, user.getPassword());
		editor.apply();
		return true;
	}

	public boolean isLoggedIn() {
		SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
		if (sharedPreferences.getString(KEY_USER_NAME, null) != null)
			return true;
		return false;
	}

	public UserModel getUser() {
		SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
		return new UserModel(
				sharedPreferences.getString(KEY_USER_NAME, null),
				sharedPreferences.getString(KEY_PASSWORD, null)
		);
	}

	public boolean logout() {
		SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.clear();
		editor.apply();
		return true;
	}
}