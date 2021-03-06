package com.passerbywhu.dagger2study.coffee;

class ElectricHeater implements Heater {
  boolean heating;

  @Override public String on() {
    this.heating = true;
    return "~ ~ ~ heating ~ ~ ~";
  }

  @Override public void off() {
    this.heating = false;
  }

  @Override public boolean isHot() {
    return heating;
  }
}
