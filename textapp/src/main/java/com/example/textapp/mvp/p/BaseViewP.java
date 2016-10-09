package com.example.textapp.mvp.p;

/**
 * Created by CTXD-24 on 2016/9/18.
 */

public abstract class BaseViewP<T>{
    T mT;
    public BaseViewP(T mT) {
        super();
        this.mT=mT;
    }

}
