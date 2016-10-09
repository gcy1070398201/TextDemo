package com.example.textapp.mvp.m;

import com.example.textapp.api.BaseApi;
import com.example.textapp.api.BaseSubscriber;

import rx.Observable;

/**
 * Created M 层 实现类
 */
public class BaseM<T>  implements BaseMIm.TextMIm<T> {
    BaseSubscriber mBaseSubscriber;
    @Override
    public void sendNet(Observable o, final BaseMip baseMip,T t) {
        BaseApi.getInstence().toSubscribe(o, mBaseSubscriber=new BaseSubscriber<T>() {
            @Override
            public void onError(Throwable e) {
                super.onError(e);
                baseMip.onError(e.toString());
            }
            @Override
            protected void successful(T t) {
                baseMip.setData(t);
            }
        });
    }

    @Override
    public void cancelNetWork() {
        if (mBaseSubscriber.isUnsubscribed()){
            mBaseSubscriber.unsubscribe();
        }
    }
}
