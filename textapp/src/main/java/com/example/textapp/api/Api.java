package com.example.textapp.api;

import com.example.textapp.bean.Good;

import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by CTXD-24 on 2016/9/2.
 */

public interface Api {
    @POST("product/homePageCategoryAndBanner.do")
    Observable<Good> getGoodInfo();

}
