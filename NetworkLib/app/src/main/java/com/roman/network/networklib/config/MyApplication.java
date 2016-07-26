package com.roman.network.networklib.config;

import android.app.Application;

import com.roman.network.networklib.net.VolleyManager;

/**
 * Created by roman
 * Describe 初始化VolleyManager
 * On 2016/7/26.
 */
public class MyApplication extends Application {

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        VolleyManager.createInstance(getApplicationContext());
    }

    public static MyApplication getInstance() {
        return mInstance;
    }
}
