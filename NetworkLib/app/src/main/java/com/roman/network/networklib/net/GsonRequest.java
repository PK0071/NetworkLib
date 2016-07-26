package com.roman.network.networklib.net;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Created by roman
 * Describe 自定义request,配合Gson
 * On 2016/7/25.
 */
public class GsonRequest<T> extends Request<T>  {

    private Gson mGson;
    private Response.Listener mListener;
    private Class<T> mClass;
    private Map<String, String> mParam;//post参数

    /**
     * get方式，获取json对象
     * @param method
     * @param url
     * @param clazz
     * @param listener
     * @param errorListener
     */
    public GsonRequest(int method, String url, Class<T> clazz, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        mGson = new Gson();
        mClass = clazz;
        mListener = listener;
    }

    /**
     * post带param，获取json对象
     * @param method
     * @param url
     * @param clazz
     * @param listener
     * @param errorListener
     */
    public GsonRequest(int method, Map<String, String> param, String url, Class<T> clazz, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        mGson = new Gson();
        mClass = clazz;
        mListener = listener;
        mParam = param;
    }

    /**
     * 使用gson解析
     * @param response
     * @return
     */
    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        String jsonString;
        try {
            jsonString  = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            return Response.success(mGson.fromJson(jsonString, mClass), HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return Response.error(new ParseError(e));
        }
    }

    /**
     * 回调
     * @param response
     */
    @Override
    protected void deliverResponse(T response) {
        mListener.onResponse(response);
    }

    /**
     * post的时候使用获取参数
     * @return
     * @throws AuthFailureError
     */
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return mParam;
    }
}
