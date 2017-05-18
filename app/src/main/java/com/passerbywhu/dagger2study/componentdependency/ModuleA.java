package com.passerbywhu.dagger2study.componentdependency;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleA {
    @Provides
    public SomeClassA1 provideSomeClassA1() {
        return new SomeClassA1();
    }
}