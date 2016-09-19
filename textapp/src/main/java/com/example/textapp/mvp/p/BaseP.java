package com.example.textapp.mvp.p;

import com.example.textapp.mvp.m.BaseM;
import com.example.textapp.mvp.m.BaseMIm;
import com.example.textapp.mvp.v.V;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by CTXD-24 on 2016/9/18.
 */

public class BaseP extends BaseViewP<V.MainInfo> implements SendNetWork{
    BaseMIm.TextMIm mTextMIm;
    public BaseP(V.MainInfo mT) {
        super(mT);
        mTextMIm=new BaseM();
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

    /**
     * 网络请求
     * @param o 数据接口（订阅者）
     * @param sb 数据返回（被订阅者）
     */
    @Override
    public void sendNetWork(Observable o, Subscriber<?> sb) {
        mTextMIm.sendNet(o,sb);
    }
}
