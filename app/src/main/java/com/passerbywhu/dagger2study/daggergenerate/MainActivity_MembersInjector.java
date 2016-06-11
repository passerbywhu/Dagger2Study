package com.passerbywhu.dagger2study.daggergenerate;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.MembersInjector;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<TestData> mDataProvider;

  public MainActivity_MembersInjector(Provider<TestData> mDataProvider) {
    assert mDataProvider != null;
    this.mDataProvider = mDataProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<TestData> mDataProvider) {
    return new MainActivity_MembersInjector(mDataProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mData = mDataProvider.get();
  }

  public static void injectMData(MainActivity instance, Provider<TestData> mDataProvider) {
    instance.mData = mDataProvider.get();
  }
}
