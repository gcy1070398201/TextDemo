package com.example.textapp.mvp.m;

import rx.Observable;

/**
 * Created 创建一个公共的 M业务 接口
 */

public interface BaseMIm {


    void cancelNetWork();
    /**
     * 创建单个的M 子类接口 方便与扩展
     */
    interface TextMIm<T> extends BaseMIm{
        /**
         * 网络请求方法
         * @param o
         * @param
         */
        void sendNet(Observable o,BaseMip baseMip,T t);

    }
}
