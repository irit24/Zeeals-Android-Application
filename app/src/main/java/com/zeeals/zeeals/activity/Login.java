package com.zeeals.zeeals.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zeeals.zeeals.MainActivity;
import com.zeeals.zeeals.R;
import com.zeeals.zeeals.api.ApiClient;
import com.zeeals.zeeals.api.ApiInterface;
import com.zeeals.zeeals.api.LoginResponse;
import com.zeeals.zeeals.model.UserModel;
import com.zeeals.zeeals.utils.Constant;
import com.zeeals.zeeals.utils.PrefManager;
import com.zeeals.zeeals.utils.SessionManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  11/04/17.
 */
public class Login extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;


    @BindView(R.id.et_name)
    public EditText etuser;
    @BindView(R.id.et_pass)
    public EditText etpass;
    @BindView(R.id.btn_login)
    Button btnlogin;

     SharedPreferences pref;
    private boolean loggedIn = false;

    ProgressDialog pDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        ButterKnife.bind(this);


        pref = getApplicationContext().getSharedPreferences(TAG, 0);

        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);

    }

    @OnClick(R.id.btn_login)
    public void submit() {

        String username = etuser.getText().toString().trim();
        String password = etpass.getText().toString().trim();
        if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)) {
            LoginProcces(username, password);

        } else {
            Toast.makeText(getApplicationContext(), "Masukan Data", Toast.LENGTH_SHORT).show();

        }

    }


    private void LoginProcces(final String username, final String password) {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder();

        client.addInterceptor(loggingInterceptor);
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        UserModel user = new UserModel(username, password);
        user.setUsername(username);
        user.setPassword(password);

        Call<LoginResponse> response = apiService.operation(user);

        response.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, retrofit2.Response<LoginResponse> response) {

                LoginResponse resp = response.body();
//                Toast.makeText(getApplicationContext(), resp.getMessage(), getMessageToast.LENGTH_SHORTTH_LONG).show();

                Toast.makeText(getApplicationContext(), response.body().getMessage(), Toast.LENGTH_LONG).show();

                if (resp.getMessage() == Constant.SUCCESS) {


                    SharedPreferences.Editor editor = pref.edit();
                    editor.putBoolean(Constant.IS_LOGGED_IN,true);
                    editor.putString(Constant.Password,password);
                    editor.putString(Constant.Username,username);
                    editor.commit();
                    editor.apply();

//                    if there is no error
//                    starting profile activity
                    gotoHome();
                }
            }


            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

//                progress.setVisibility(View.INVISIBLE);
                Log.d(Constant.TAG, "failed");
                Toast.makeText(getApplicationContext(), "Gagal", Toast.LENGTH_SHORT).show();
//                Snackbar.make(getView(), t.getLocalizedMessage(), Snackbar.LENGTH_LONG).show();

            }
        });
    }

    private void gotoHome() {
        Intent a = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(a);
    }


}
