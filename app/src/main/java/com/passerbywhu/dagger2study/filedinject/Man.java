package com.passerbywhu.dagger2study.filedinject;

import javax.inject.Inject;

/**
 * Created by passe on 2016/6/7.
 */
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
