package com.roman.network.networklib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.android.volley.VolleyError;
import com.roman.network.networklib.bean.Modle;
import com.roman.network.networklib.bean.Xiaohua;
import com.roman.network.networklib.config.Constant;
import com.roman.network.networklib.net.VolleyManager;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:    roman
 * Describe:  VolleyManager使用
 * Date:      2016/7/21
 */
public class MainActivity extends AppCompatActivity {

    private VolleyManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = VolleyManager.getInstance();
        volleyUse();
        volleyGsonRequest();
        volleyPostRequest();

    }

    /**
     * VolleyManager 简单get json使用
     */
    public void volleyUse() {
        manager.requestJson(Constant.GET_URL);
    }

    /**
     * 自定义Request使用，get方式
     */
    public void volleyGsonRequest() {
        manager.gsonGetRequest(
                com.android.volley.Request.Method.GET,
                Constant.GET_URL,
                Modle.class,
                new com.android.volley.Response.Listener() {
                    @Override
                    public void onResponse(Object response) {
                        Log.d("volleyGsonRequest", response.toString());
                    }
                },
                new com.android.volley.Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
    }

    /**
     * 自定义Request使用，post方式
     */
    public void volleyPostRequest() {
        Map<String, String> param = new HashMap<>();
        param.put("showapi_appid", "22083");
        param.put("showapi_sign", "8c60155115794258a665ed402855fa01");
        manager.gsonPostRequest(
                com.android.volley.Request.Method.POST,
                param,
                Constant.POST_URL,
                Xiaohua.class,
                new com.android.volley.Response.Listener<Xiaohua>() {
                    @Override
                    public void onResponse(Xiaohua response) {
                        Log.d("volleyPostRequest", response.toString());
                    }
                },
                new com.android.volley.Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
    }
}
