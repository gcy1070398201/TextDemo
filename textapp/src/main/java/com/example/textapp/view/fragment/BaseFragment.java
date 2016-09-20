package com.example.textapp.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by CTXD-24 on 2016/9/20.
 */

public abstract class BaseFragment extends Fragment {
   Context mContext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(getActivity()).inflate(setLayoutView(),container,false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setLayoutViewId();
        setViewData();
        seedNetWork();
    }
    /**
     * 设置布局组件
     * @return
     */
    protected abstract int setLayoutView();
    /**
     * 初始化布局控件ID
     */
    protected abstract void setLayoutViewId();
    /**
     *初始化控件设置默认值
     */
    protected abstract void setViewData();
    /**
     *初次加载网络状况
     */
    protected abstract void seedNetWork();
    /**
     * 简单跳转
     * @param cl
     */
    public void setFragmentIntent(Class<?> cl){
        startActivity(new Intent(getActivity(),cl));
    }
}
