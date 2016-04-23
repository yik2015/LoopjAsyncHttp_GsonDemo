package com.hema.www.loopjasynchttpdemo;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by Administrator on 2016/4/22.
 */
public class TwitterRestClient {

    private static final String BASE_URL = "http://120.24.75.234:7080/API/1.0/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler handler) {
        client.get(getAbsoluteUrl(url), params, handler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler handler) {
        client.post(getAbsoluteUrl(url), params, handler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }
}
