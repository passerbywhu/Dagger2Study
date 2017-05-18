package com.passerbywhu.dagger2study.componentdependency;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by passe on 2017/5/17.
 */

public class SubComponent {
    @Component(modules = {ModuleA.class, ModuleB.class})
    public interface SComponentA {
        SComponentB componentB();
    }

    @Subcomponent(modules = ModuleB.class)
    public interface SComponentB {
        SomeClassB1 someClassB1();
    }
}
