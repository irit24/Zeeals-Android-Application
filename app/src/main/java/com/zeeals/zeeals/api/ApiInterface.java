package com.zeeals.zeeals.api;

import com.zeeals.zeeals.model.Order.OrderPost;
import com.zeeals.zeeals.model.UserModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  06/04/17.
 */

public interface ApiInterface {


@FormUrlEncoded
    @POST("api/user/login")
    Call<LoginResponse> postLogin(@Field("username") String username,
                              @Field("password") String password);



    @POST("api/user/login")
    Call<LoginResponse> operation(@Body UserModel loginrequest);

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
@POST("api/order")
    Call<OrderResponse> getOrder(@Body OrderPost orderrequest);
//    Call<OrderResponse> getOrder(@Query("limit") Integer limit,
//                                 @Query("offset") Integer offset,
//                                 @Query("key") Integer key);
//Call<OrderResponse> getOrder(@Url String url);

    @POST("api/order/grafik")
    Call<GrafikOrderResponse> getGrafik();




}


