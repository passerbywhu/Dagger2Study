package com.passerbywhu.dagger2study.daggergenerate;

/**
 * Created by passe on 2016/5/12.
 */
//@Singleton
//@Component(modules = {TestModule.class})
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);
}
