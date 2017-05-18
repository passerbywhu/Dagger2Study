package com.passerbywhu.dagger2study.customscope;

import android.app.Activity;

import dagger.Component;

/**
 * Created by passe on 2017/5/17.
 */
@PerActivity
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();
}
