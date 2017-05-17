package com.zeeals.zeeals.utils;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  11/04/17.
 */

public class Constant {

    public  static  String BaseURL = "http://zeeals.kongcreativestudio.com/";
    public static final String REGISTER_OPERATION = "register";
    public static final String LOGIN_OPERATION = "login";
    public static final String CHANGE_PASSWORD_OPERATION = "chgPass";

    public static final String SUCCESS = "success";
    public static final String FAILURE = "failure";
    public static final String IS_LOGGED_IN = "isLoggedIn";

    public static final String Username = "username";
    public static final String EMAIL = "email";
    public static final String Password = "password";

    public static final String TAG = "Zeeals";


    // global topic to receive app wide push notifications
    public static final String TOPIC_GLOBAL = "global";

    // broadcast receiver intent filters
    public static final String REGISTRATION_COMPLETE = "registrationComplete";
    public static final String PUSH_NOTIFICATION = "pushNotification";

    // id to handle the notification in the notification tray
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;


}
