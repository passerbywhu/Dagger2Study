package com.passerbywhu;

import android.app.Application;

/**
 * Created by passe on 2016/6/7.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable ex) {
                ex.printStackTrace();
            }
        });
    }
}
