package com.example.textapp.mvp.p;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by CTXD-24 on 2016/9/19.
 */

public interface SendNetWork {

    void sendNetWork(Observable o, Subscriber<?> sb);
}
