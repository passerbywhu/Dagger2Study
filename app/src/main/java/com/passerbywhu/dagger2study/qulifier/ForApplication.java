package com.passerbywhu.dagger2study.qulifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by passe on 2017/5/17.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ForApplication {
}
