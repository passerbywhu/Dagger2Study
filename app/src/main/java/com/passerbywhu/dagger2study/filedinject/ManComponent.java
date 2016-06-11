package com.passerbywhu.dagger2study.filedinject;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by passe on 2016/6/7.
 */
@Singleton
@Component(modules = {AxeModule.class})
public interface ManComponent {
    Man aManWithAxe();
}
