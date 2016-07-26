# NetworkLib
#Volley+Gson+OKHttp封装网络库
由于隐私关系，Constant需要自己配接口地址

主要做的工作

1.将Volley做成单例，不用每次使用都创建新的RequestQueue

2.使用LruCache实现ImageLoader的内存缓存

3.自定义Request配合Gson，将json封装成对象

4.OkHttp3Stack实现HttpStack接口，使用OKHttpClient替换Volley sdk9以上的HurlStack，将OKHttp作为传输层

使用方式，类似于

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
                
在MainActivity有demo

后面再优化下
