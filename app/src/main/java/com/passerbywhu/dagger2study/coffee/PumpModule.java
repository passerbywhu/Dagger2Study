package com.passerbywhu.dagger2study.coffee;

import dagger.Module;
import dagger.Provides;

@Module
class PumpModule {
  @Provides
  Pump providePump(Thermosiphon pump) {
    return pump;
  }
}
