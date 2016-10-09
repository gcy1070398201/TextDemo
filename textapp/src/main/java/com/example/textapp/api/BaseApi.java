package com.example.textapp.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by CTXD-24 on 2016/9/2.
 */

public class BaseApi<T>{
    private static BaseApi mBaseApi;
    private Retrofit mRetrofit;
    private String BASE_URL="http://192.168.0.22:8085/extApp/";
    private BaseApi(){}
    public static BaseApi getInstence(){
        return mBaseApi=new BaseApi();
    }
    public Api getApi(){
        mRetrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return mRetrofit.create(Api.class);
    }
    public void toSubscribe(Observable o, BaseSubscriber<T> t){
        o.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(t);
    }
}
