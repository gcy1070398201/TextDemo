package com.ctxd.textdemo.api;

import com.ctxd.textdemo.com.ctxd.textdemo.servise.HelpServise;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by CTXD-24 on 2016/5/25.
 */
public class ApiUtile {
    private String url = "http://192.168.0.22:8085/extApp/";
    private HelpServise mHelpServise;
    public  static ApiUtile getInsten(){
        return ApiUtileHolder.mApiUtile;
    }
    public HelpServise getHelpServise() {
        return mHelpServise;
    }
    private  static class ApiUtileHolder{
        private static  ApiUtile mApiUtile =new ApiUtile();
    }
    public ApiUtile() {
        OkHttpClient okHttpClient=new OkHttpClient();
        okHttpClient.setConnectTimeout(5,TimeUnit.SECONDS);
        Retrofit retrofit=new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
                .build();
        mHelpServise=retrofit.create(HelpServise.class);
    }
}
