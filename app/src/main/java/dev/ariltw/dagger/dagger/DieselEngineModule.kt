package dev.ariltw.dagger.dagger

import dagger.Binds
import dagger.Module
import dagger.Provides
import dev.ariltw.dagger.car.DieselEngine
import dev.ariltw.dagger.car.Engine

@Module
class DieselEngineModule(var housepower: Int) {

    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(housepower)
    }
}