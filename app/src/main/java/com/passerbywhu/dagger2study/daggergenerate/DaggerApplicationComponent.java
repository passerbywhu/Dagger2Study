package com.passerbywhu.dagger2study.daggergenerate;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.MembersInjector;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<TestData> provideTestDataProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideTestDataProvider =
        ScopedProvider.create(TestModule_ProvideTestDataFactory.create(builder.testModule));

    this.mainActivityMembersInjector = MainActivity_MembersInjector.create(provideTestDataProvider);
  }

  @Override
  public void inject(MainActivity mainActivity) {
    mainActivityMembersInjector.injectMembers(mainActivity);
  }

  public static final class Builder {
    private TestModule testModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (testModule == null) {
        this.testModule = new TestModule();
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder testModule(TestModule testModule) {
      this.testModule = Preconditions.checkNotNull(testModule);
      return this;
    }
  }
}
