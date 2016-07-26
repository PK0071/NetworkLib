package com.roman.network.networklib.net;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.LruCache;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.roman.network.networklib.bean.Modle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import okhttp3.OkHttpClient;

/**
 * Author:    roman
 * Describe:  Volley+Gson+OKHttp二次封装
 * Date:      2016/7/21
 */
//1.封装成单例 2.使用LruCache实现ImageLoader的内存缓存 3.自定义cb
public class VolleyManager {

    private static final int IMAGE_CACHE_SIZE = 8 * 1024 *1024;//8M缓存
    private static VolleyManager mInstance;
    private RequestQueue mRequestQueue;
    private ImageLoader mImageLoader;

    private VolleyManager(Context context) {
        //mRequestQueue = Volley.newRequestQueue(context);//单个消息队列
        mRequestQueue = Volley.newRequestQueue(context, new OkHttp3Stack(new OkHttpClient()));//使用OKHttp作为传输层

        final LruCache<String, Bitmap> lruCache = new LruCache<String, Bitmap>(IMAGE_CACHE_SIZE) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight();
            }
        };
        //自己用lruCache实现ImageLoader的图片缓存功能
        ImageLoader.ImageCache imageCache = new ImageLoader.ImageCache() {

            @Override
            public Bitmap getBitmap(String url) {
                return lruCache.get(url);
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {
                lruCache.put(url, bitmap);
            }
        };
    }

    public static void createInstance(Context context) {
        if (context != null) {
            if (mInstance == null) {
                mInstance = new VolleyManager(context);
            }
        } else {
            throw new IllegalArgumentException("context is null");
        }
    }

    public static synchronized VolleyManager getInstance() {
        return mInstance;
    }

    /**
     * 使用get简单请求json数据，打印
     * @param url
     */
    public void requestJson(String url) {
        final JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.GET,
                url,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("requestJson", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
        mRequestQueue.add(request);
    }

    /**
     * 自定义Request,get方式，获取json对象
     */
    public <T> void gsonGetRequest(int method, String url, Class clazz, Response.Listener listener, Response.ErrorListener errorListener) {
        GsonRequest<T> request = new GsonRequest<T>(
                method,
                url,
                clazz,
                listener,
                errorListener
        );
        mRequestQueue.add(request);
    }

    /**
     * 自定义Request,post带param，获取json对象
     */
    public <T> void gsonPostRequest(int method, Map<String, String> param, String url, Class clazz, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        GsonRequest<T> request = new GsonRequest<T>(
                method,
                param,
                url,
                clazz,
                listener,
                errorListener
        );
        mRequestQueue.add(request);
    }

}
