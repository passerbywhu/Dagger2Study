package com.passerbywhu.dagger2study.injecactivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by passe on 2017/5/17.
 */

@Module
public class InjectActivityModule {
    private InjectBean bean;
    public InjectActivityModule(InjectBean bean) {
        this.bean = bean;
    }
    @Provides @Singleton InjectBean getBean() {
        return bean;
    }
}
