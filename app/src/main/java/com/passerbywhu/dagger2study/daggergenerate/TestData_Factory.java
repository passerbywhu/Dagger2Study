package com.passerbywhu.dagger2study.daggergenerate;

import javax.annotation.Generated;

import dagger.internal.Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum TestData_Factory implements Factory<TestData> {
  INSTANCE;

  @Override
  public TestData get() {
    return new TestData();
  }

  public static Factory<TestData> create() {
    return INSTANCE;
  }
}
