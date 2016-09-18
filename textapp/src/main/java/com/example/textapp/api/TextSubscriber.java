package com.example.textapp.api;

import rx.Subscriber;

/**
 * Created by CTXD-24 on 2016/9/2.
 */

public class TextSubscriber <T> extends Subscriber<T> {



    @Override
    public void onStart() {
        super.onStart();
        //开始
    }
    @Override
    public void onCompleted() {
        //结束
    }
    @Override
    public void onError(Throwable e) {
        //错误
    }

    @Override
    public void onNext(T t) {
        //返回结果
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
