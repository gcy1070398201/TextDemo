package com.example.textapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.textapp.api.BaseApi;
import com.example.textapp.bean.Good;
import com.example.textapp.mvp.p.BaseP;
import com.example.textapp.mvp.v.V;

public class MainActivity extends AppCompatActivity implements V.MainInfo<Good>{

    TextView mTextView;
    BaseP mBaseP;
    private String TAG=MainActivity.class.getName();
    private Context mContext;
    private BaseApi mBaseApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        mBaseApi=BaseApi.getInstence();
        mTextView= (TextView) findViewById(R.id.tv);
        initAnmin();
    }

    private void initAnmin() {
        mBaseP=new BaseP(this);
        mBaseP.sendNetWork(mBaseApi.getApi().getGoodInfo(),Good.class);

    }
    @Override
    protected void onDestroy() {
        mBaseP.closeNet();
        super.onDestroy();
    }
    @Override
    public void showDialog() {

    }
    @Override
    public void onError(String str) {
        Log.e(TAG,str);
    }
    @Override
    public void successful(Good good) {
        Log.e(TAG,good.toString());
    }
    @Override
    public void dissDialog() {

    }
}
