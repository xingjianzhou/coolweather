package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Zhou on 2017/12/21.
 * util包用于存放工具相关的代码
 */

public class HttpUtil {
    //发起HTTP请求，调用sendOKHttpRequest()方法，传入请求地址，并注册一个回调函数来处理服务器响应
    public  static  void sendOKHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client =new OkHttpClient();
        Request request =new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
