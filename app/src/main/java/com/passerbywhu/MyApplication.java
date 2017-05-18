package com.passerbywhu;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.passerbywhu.dagger2study.ApplicationModule;
import com.passerbywhu.dagger2study.daggergenerate.ApplicationComponent;
import com.passerbywhu.dagger2study.filedinject.MainAxeActivity;
import com.passerbywhu.dagger2study.injecactivity.InjectActivity;
import com.passerbywhu.dagger2study.qulifier.ForApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by passe on 2016/6/7.
 */
public class MyApplication extends Application {
    @Singleton
    @Component(modules = {ApplicationModule.class})
    public interface AppComponent {
//        void inject(InjectActivity activity);
        Context context();
    }

    private AppComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable ex) {
                ex.printStackTrace();
            }
        });
//        mComponent = DaggerMyApplication_AppComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

//    public AppComponent component() {
//        return mComponent;
//    }
}
