package com.example.textapp.mvp.m;

import rx.Observable;
import rx.Subscriber;

/**
 * Created 创建一个公共的 M业务 接口
 */

public interface BaseMIm {
    /**
     * 创建单个的M 子类接口 方便与扩展
     */
    interface TextMIm extends BaseMIm{
        /**
         * 网络请求方法
         * @param o
         * @param sb
         */
        void sendNet(Observable o, Subscriber<?> sb);
    }
}
