////package com.zeeals.zeeals.presenter;
////
////import android.content.Intent;
////import android.view.View;
////import android.widget.EditText;
////import android.widget.Toast;
////
////import com.zeeals.zeeals.MainActivity;
////import com.zeeals.zeeals.R;
////import com.zeeals.zeeals.activity.LoginActivity;
////import com.zeeals.zeeals.api.ApiClient;
////import com.zeeals.zeeals.api.ApiInterface;
////import com.zeeals.zeeals.api.LoginResponse;
////import com.zeeals.zeeals.view.LoginView;
////
////import okhttp3.OkHttpClient;
////import okhttp3.logging.HttpLoggingInterceptor;
////import retrofit2.Call;
////import retrofit2.Callback;
////import retrofit2.Response;
////
/////**
//// * @author Ilyasa Ridho
//// * @version 1.0
//// * @Created on  06/04/17.
//// */
//public class LoginPresenter {
//    private LoginView view;
//
//    public LoginPresenter(LoginView view){
//        this.view = view;
//    }
//
//    public void onLoginClicked() {
//
//
//        view.setProgressDialogVisible();
//
//        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
//        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//
//        OkHttpClient.Builder client = new OkHttpClient.Builder();
//
//        client.addInterceptor(loggingInterceptor);
//        ApiInterface apiService =
//                ApiClient.getClient().create(ApiInterface.class);
//
//        Call<LoginResponse> call = apiService.postLogin(username, password);
//        call.enqueue(new Callback<LoginResponse>() {
//            @Override
//            public void onResponse(Call<LoginResponse>call, Response<LoginResponse> response) {
////                    view.startMainAtivity(response.body().getStatus());r
//                response.body().getStatus();
//view.startMainAtivity(username,password);
//
//                view.setProgressDialogInVisible();
//            }
//
//            @Override
//            public void onFailure(Call<LoginResponse> call, Throwable t) {
//                view.showToastLoginFailure();
//                view.setProgressDialogInVisible();
//            }
//        });
//
//    }
//}
//
