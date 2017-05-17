package com.zeeals.zeeals.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zeeals.zeeals.model.Web;
import com.zeeals.zeeals.utils.Constant;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.zeeals.zeeals.utils.Constant.BaseURL;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  05/04/17.
 */

public class ApiClient {



//    public static  String Try = "http://192.168.1.6/zeeals/";
    private static Retrofit retrofit = null;



    public static Retrofit getClient() {
        if (retrofit==null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();




            OkHttpClient.Builder client = new OkHttpClient.Builder();
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            client.interceptors().add(loggingInterceptor);

            client.addInterceptor(loggingInterceptor);
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BaseURL)
                    .client(client.build())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}