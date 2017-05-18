package com.passerbywhu.dagger2study.componentdependency;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleB {
    @Provides
    public SomeClassB1 provideSomeClassB1(SomeClassA1 someClassA1) {
        return new SomeClassB1(someClassA1);
    }
}