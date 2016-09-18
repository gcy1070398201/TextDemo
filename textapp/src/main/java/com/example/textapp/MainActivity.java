package com.example.textapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.textapp.api.BaseApi;
import com.example.textapp.api.TextSubscriber;
import com.example.textapp.bean.Good;
import com.example.textapp.mvp.p.BaseP;
import com.example.textapp.mvp.v.V;

import rx.Subscriber;

public class MainActivity extends AppCompatActivity implements V.MainInfo {

    TextView mTextView;
    BaseP mBaseP=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView= (TextView) findViewById(R.id.tv);
        mBaseP=new BaseP(this);
        initAnmin();
    }

    private void initAnmin() {
        BaseApi.getInstence().toSubscribe(BaseApi.getInstence().getApi().getGoodInfo(),mBaseP);
    }
    @Override
    protected void onDestroy() {
        mBaseP.close();
        super.onDestroy();
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void onError(String str) {

    }

    @Override
    public void successful(Object o) {

    }

    @Override
    public void dissDialog() {

    }
}
