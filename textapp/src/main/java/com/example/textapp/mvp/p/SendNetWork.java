package com.example.textapp.mvp.p;

import rx.Observable;

/**
 * Created by CTXD-24 on 2016/9/19.
 */

public interface SendNetWork<T> {

    void sendNetWork(Observable o,T t);
}
