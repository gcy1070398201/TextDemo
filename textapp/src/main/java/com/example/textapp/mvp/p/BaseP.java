package com.example.textapp.mvp.p;

import com.example.textapp.mvp.v.V;

/**
 * Created by CTXD-24 on 2016/9/18.
 */

public class BaseP extends BaseViewP<V.MainInfo> {

    public BaseP(V.MainInfo mT) {
        super(mT);
    }
    @Override
    public void onStart() {
        super.onStart();
        mT.showDialog();
    }
    @Override
    public void onCompleted() {
        super.onCompleted();
        mT.dissDialog();
    }
    @Override
    public void onNext(Object o) {
        super.onNext(o);
        mT.successful(o);
    }
    @Override
    public void onError(Throwable e) {
        super.onError(e);
        mT.onError(e.toString());
        mT.dissDialog();
    }
    /**
     * 关闭网络连接
     */
    public void close(){
        if (this.isUnsubscribed()){
            this.unsubscribe();
        }
    }
}
