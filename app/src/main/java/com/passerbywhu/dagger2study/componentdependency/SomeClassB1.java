package com.passerbywhu.dagger2study.componentdependency;

public class SomeClassB1 {
    private SomeClassA1 someClassA1;

    public SomeClassB1(SomeClassA1 someClassA1) {
        this.someClassA1 = someClassA1;
    }
}