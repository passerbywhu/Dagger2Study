package com.passerbywhu.dagger2study.daggergenerate;

/**
 * Created by passe on 2016/5/12.
 */
//@Module
public class TestModule {
//    @Singleton
//    @Provides
    public TestData provideTestData() {
        TestData data = new TestData();
        data.owner = "MainActivity";
        return data;
    }
}
