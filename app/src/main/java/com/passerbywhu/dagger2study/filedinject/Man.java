package com.passerbywhu.dagger2study.filedinject;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by passe on 2016/6/7.
 */
@Singleton
public class Man {
    @Inject
    public Axe axe;

    @Inject
    public Man() {
    }

    public String chop() {
        return axe.chop();
    }
}
