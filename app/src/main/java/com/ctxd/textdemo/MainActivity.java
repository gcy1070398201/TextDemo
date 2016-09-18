package com.ctxd.textdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ctxd.textdemo.api.ApiUtile;
import com.ctxd.textdemo.com.ctxd.textdemo.servise.HelpServise;
import com.ctxd.textdemo.entiy.Good;
import com.ctxd.textdemo.entiy.PhoenEntiy;

import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;


public class MainActivity extends AppCompatActivity {

    private String url = "http://apis.baidu.com";
    private String API_KEY = "6a4ce7025988a245135caf8d9b412ba9";
    private ApiUtile mApiUtile;
    @InjectView(R.id.t1)
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        mApiUtile=ApiUtile.getInsten();
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText("GCY");
                getBanner();
                Log.e("sss", "GCY ");
            }
        });
      /*  int max=ratingBar.getMax();
        System.out.println("max="+max+",currentRating"+ratingBar.getRating());
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            }
        });*/
    }


    private void seedNetWork() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        HelpServise mHelpServise = retrofit.create(HelpServise.class);
        Call<PhoenEntiy> mCall = mHelpServise.getPhoenInfo(API_KEY, "13501267714");
        mCall.enqueue(new Callback<PhoenEntiy>() {
            @Override
            public void onResponse(Response<PhoenEntiy> response) {

                if (response.isSuccess()){
                    PhoenEntiy phoenEntiy=response.body();
                    Toast.makeText(MainActivity.this,phoenEntiy.getRetData().getPhone(),Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
    private void getBanner(){
        Call<Good>banner=mApiUtile.getHelpServise().getBanner();
        banner.enqueue(new Callback<Good>() {
            @Override
            public void onResponse(Response<Good> response) {
                if (response.isSuccess()){
                    Toast.makeText(MainActivity.this,response.body().getData().getBanners().toString(),Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onFailure(Throwable t) {
                System.out.print("xxxx   /n"+t.getMessage());
            }
        });
    }
    @Override
    public void onStart() {
        super.onStart();
    }
    @Override
    public void onStop() {
        super.onStop();
    }
}
