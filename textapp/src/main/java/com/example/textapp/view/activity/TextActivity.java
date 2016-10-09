package com.example.textapp.view.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.textapp.MainActivity;
import com.example.textapp.R;

/**
 * Created by CTXD-24 on 2016/9/20.
 */

public class TextActivity extends BaseActivity implements View.OnClickListener {
    TextView mTextView;
    @Override
    protected int setLayoutView() {
        return R.layout.activity_main;
    }

    @Override
    protected void setLayoutViewId() {
        mTextView=getViewId(R.id.tv);
        mTextView.setOnClickListener(this);
    }

    @Override
    protected void setViewData() {
        mTextView.setText("gcy");
    }

    @Override
    protected void seedNetWork() {

    }
    @Override
    public void onClick(View v) {
        setIntent(MainActivity.class);
        startActivity(new Intent(mContext,MainActivity.class));
    }
}
