package com.passerbywhu.dagger2study.injecactivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by passe on 2017/5/17.
 */

@Singleton
@Component(modules = {InjectActivityModule.class})
public interface InjectActivityComponent {
    void inject(InjectActivity activity);
}
