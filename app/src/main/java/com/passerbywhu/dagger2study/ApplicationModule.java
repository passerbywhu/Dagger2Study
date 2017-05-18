package com.passerbywhu.dagger2study;

import android.app.Application;
import android.content.Context;

import com.passerbywhu.MyApplication;
import com.passerbywhu.dagger2study.qulifier.ForApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by passe on 2017/5/17.
 */

@Module
public class ApplicationModule {
    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides @Singleton
    Context provideApplicationContext() {
        return application;
    }
}
