package com.example.lio_zhuo.coolweather.util;

/**
 * Created by Lio_Zhuo on 2016/5/24 0024.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
