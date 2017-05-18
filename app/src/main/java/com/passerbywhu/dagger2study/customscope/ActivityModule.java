package com.passerbywhu.dagger2study.customscope;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by passe on 2017/5/17.
 */
@Module
public class ActivityModule {
    private final Activity activity;
    public ActivityModule(Activity activity) {
        this.activity = activity;
    }
    @Provides @PerActivity Activity activity() {
        return this.activity;
    }
}
