package com.example.textapp.mvp.p;

import com.example.textapp.mvp.m.BaseM;
import com.example.textapp.mvp.m.BaseMIm;
import com.example.textapp.mvp.m.BaseMip;
import com.example.textapp.mvp.v.V;

import rx.Observable;

/**
 * Created by CTXD-24 on 2016/9/18.
 */

public class BaseP<T> extends BaseViewP<V.MainInfo> implements SendNetWork<T>,BaseMip<T>{
    BaseMIm.TextMIm<T> mTextMIm;
    public BaseP(V.MainInfo mT) {
        super(mT);
        mTextMIm=new BaseM();
    }
    /**
     * 关闭网络连接
     */
    public void closeNet() {
       mTextMIm.cancelNetWork();
    }
    /**
     * 网络请求
     * @param o 数据接口（订阅者）
     * @param
     */
    @Override
    public void sendNetWork(Observable o, T o2) {
        mTextMIm.sendNet(o,this,o2);
    }
    @Override
    public void setData(T t) {
        mT.successful(t);
    }

    @Override
    public void onError(String str) {
        mT.onError(str);
    }
}
