package com.example.textapp.mvp.p;

import rx.Subscriber;

/**
 * Created by CTXD-24 on 2016/9/18.
 */

public class BaseViewP<T> extends Subscriber {
    T mT;
    public BaseViewP(T mT) {
        super();
        this.mT=mT;
    }

    @Override
    public void onStart() {
        super.onStart();
    }
    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onNext(Object o) {

    }
}
