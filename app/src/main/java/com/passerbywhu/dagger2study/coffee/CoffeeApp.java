package com.passerbywhu.dagger2study.coffee;

import javax.inject.Singleton;

import dagger.Component;

public class CoffeeApp {
  @Singleton
  @Component(modules = { DripCoffeeModule.class })
  public interface Coffee {
    CoffeeMaker maker();
  }
}
