package com.passerbywhu.dagger2study.componentdependency;

import dagger.Component;
//http://stackoverflow.com/questions/29587130/dagger-2-subcomponents-vs-component-dependencies
public class ComponentDependency {
    @Component(modules = ModuleA.class)
    public interface ComponentA {
        SomeClassA1 someClassA1();
    }

    @Component(modules = ModuleB.class, dependencies = ComponentA.class)
    public interface ComponentB {
        SomeClassB1 someClassB1();
    }

    public static void main(String[] args) {
//        ModuleA moduleA = new ModuleA();
//        ComponentA componentA = DaggerComponentDependency_ComponentA.builder()
//                .moduleA(moduleA)
//                .build();
//
//        ModuleB moduleB = new ModuleB();
//        ComponentB componentB = DaggerComponentDependency_ComponentB.builder()
//                .moduleB(moduleB)
//                .componentA(componentA)
//                .build();
    }
}