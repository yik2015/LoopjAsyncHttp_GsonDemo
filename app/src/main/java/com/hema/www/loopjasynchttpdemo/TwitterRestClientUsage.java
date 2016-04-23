package com.hema.www.loopjasynchttpdemo;

import android.util.Log;

import com.google.gson.Gson;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Administrator on 2016/4/22.
 */
public class TwitterRestClientUsage {


    private static final String TAG = "floor1";

    public void getPublicTimeline() throws Exception {
        TwitterRestClient.get("Json/Liuqi/Hema_NewHome", null, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {

                try {
                    JSONObject body = response.getJSONObject("Body");
                    JSONArray floor1 = body.getJSONArray("Floor1");
                    Log.i(TAG, "floor1 --> " + floor1.toString());

                    for (int i = 0; i < floor1.length(); i++) {
                        JSONObject o = (JSONObject) floor1.get(i);
//                        Log.i(TAG, o.toString());

                        Gson gson=new Gson();
                        Floor1Element element = gson.fromJson(o.toString(), Floor1Element.class);

                        Log.i(TAG, element.toString());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray timeline) {
            }
        });
    }
}
