package com.hema.www.loopjasynchttpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        AsyncHttpClient client = new AsyncHttpClient();
//
//        client.get("https://www.google.com", new AsyncHttpResponseHandler() {
//            @Override
//            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
//
//            }
//
//            @Override
//            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
//
//            }
//        });
        try {
            new TwitterRestClientUsage().getPublicTimeline();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
