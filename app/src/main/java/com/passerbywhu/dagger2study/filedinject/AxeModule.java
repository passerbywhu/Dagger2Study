package com.passerbywhu.dagger2study.filedinject;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by passe on 2016/6/7.
 */
@Module
public class AxeModule {
    @Provides
    @Singleton
    public Axe getAxe() {
        return new SimpleAxe();
    }

    public AxeModule() {}
}
