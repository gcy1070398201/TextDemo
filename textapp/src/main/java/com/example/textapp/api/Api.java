package com.example.textapp.api;

import com.example.textapp.bean.Good;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by CTXD-24 on 2016/9/2.
 */

public interface Api {
    @POST("product/homePageCategoryAndBanner.do")
    Observable<Good> getGoodInfo();
    @GET("/apistore/mobilenumber/mobilenumber")
    Call<Good> getPhoenInfo(@Header("apikey")String apikey, @Query("phone")String phone);
}
