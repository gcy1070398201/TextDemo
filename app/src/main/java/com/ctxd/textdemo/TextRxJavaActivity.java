package com.ctxd.textdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by CTXD-24 on 2016/5/27.
 */
public class TextRxJavaActivity extends AppCompatActivity {
    @InjectView(R.id.t1)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        /*Observable.just("guchenyang")
                .map(String::length)
                .subscribe(i->textView.setText(i+""));*/
        /**
         * 事件触发着
         */
        Observable<String> myObservable = Observable.create(new Observable.OnSubscribe<String>(){
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("测试甲乙");
                subscriber.onCompleted();
            }
        });
        myObservable.subscribe(mStringSubscriber);//需要两者关联
//        Observable.just("测试甲乙")
//                .map(new Func1<String, String>() {
//                    @Override
//                    public String call(String s) {
//                        return"测试甲乙"+"-gcy";
//                    }
//                })
//                .subscribeOn(Schedulers.io())// 指定 subscribe() 发生在 IO 线程
//                .observeOn(AndroidSchedulers.mainThread())// 指定 Subscriber 的回调发生在主线程
//                .subscribe(new Action1<String>() {
//            @Override
//            public void call(String s) {
//                textView.setText(s);
//            }
//        });
    }
    /**
     * 事件处理
     */
    Subscriber<String> mStringSubscriber=new Subscriber<String>() {
        @Override
        public void onCompleted() {
            //事件结束后
            Log.e("ssssss","gggggggggggggg");
        }
        @Override
        public void onError(Throwable e) {
            Log.e("ssssss","e");
        }
        @Override
        public void onNext(String s) {
            Log.e("ssssss",s);
            //获取时间信息
            textView.setText(s);
        }
    };
}
