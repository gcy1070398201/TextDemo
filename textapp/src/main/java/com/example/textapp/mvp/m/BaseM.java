package com.example.textapp.mvp.m;

import com.example.textapp.api.BaseApi;

import rx.Observable;
import rx.Subscriber;

/**
 * Created M 层 实现类
 */
public class BaseM  implements BaseMIm.TextMIm {

    @Override
    public void sendNet(Observable o, Subscriber<?> sb) {

        BaseApi.getInstence().toSubscribe(o,sb);
    }
}
