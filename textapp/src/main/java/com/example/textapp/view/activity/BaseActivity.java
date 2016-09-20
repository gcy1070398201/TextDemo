package com.example.textapp.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by CTXD-24 on 2016/9/20.
 */

public abstract class BaseActivity extends AppCompatActivity {
    Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutView());
        mContext=this.getApplicationContext();
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
    public void setIntent(Class<?> cl){
        startActivity(new Intent(mContext,cl));
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
