package com.example.lio_zhuo.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.lio_zhuo.coolweather.service.AutoUpdateService;

/**
 * Created by Lio_Zhuo on 2016/5/24 0024.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}