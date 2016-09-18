package com.example.textapp;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by CTXD-24 on 2016/9/18.
 */

public class DialogUtile {
    private static DialogUtile mDialogUtile;
    private ProgressDialog mProgressDialog;
     private Context mContext;
    public DialogUtile(Context mContext){
        this.mContext=mContext.getApplicationContext();
    }
    public static DialogUtile getInstance(Context mContext){
        return mDialogUtile=new DialogUtile(mContext);
    }

    public void showDialog(){
        mProgressDialog=new ProgressDialog(mContext);
        mProgressDialog.setTitle("等待");
        mProgressDialog.setMessage("正在加载....");
        mProgressDialog.show();
    }
    public void dissDialog(){
        if (mProgressDialog!=null){
            mProgressDialog.cancel();
        }
    }


}
