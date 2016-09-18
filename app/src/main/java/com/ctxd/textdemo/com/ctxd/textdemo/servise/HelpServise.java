package com.ctxd.textdemo.com.ctxd.textdemo.servise;

import com.ctxd.textdemo.entiy.Good;
import com.ctxd.textdemo.entiy.PhoenEntiy;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Query;
/**
 * Created by CTXD-24 on 2016/5/24.
 */
public interface HelpServise {
    @GET("/apistore/mobilenumber/mobilenumber")
    Call<PhoenEntiy> getPhoenInfo(@Header("apikey")String apikey, @Query("phone")String phone);
    @GET("product/homePageCategoryAndBanner.do")
    Call<Good>getBanner();
}
