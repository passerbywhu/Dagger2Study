package com.passerbywhu.dagger2study.daggergenerate;

import javax.annotation.Generated;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TestModule_ProvideTestDataFactory implements Factory<TestData> {
  private final TestModule module;

  public TestModule_ProvideTestDataFactory(TestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TestData get() {
    return Preconditions.checkNotNull(
        module.provideTestData(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TestData> create(TestModule module) {
    return new TestModule_ProvideTestDataFactory(module);
  }
}
