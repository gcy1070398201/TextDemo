package com.example.textapp.mvp.v;

/**
 * Created by CTXD-24 on 2016/9/18.
 */

public interface V<T> {
    void showDialog();
    void onError(String str);
    void successful(T t);
    void dissDialog();
    interface MainInfo extends V{

    }
}
