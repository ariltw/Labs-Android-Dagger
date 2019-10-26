package dev.ariltw.dagger.dagger

import dagger.Binds
import dagger.Module
import dev.ariltw.dagger.car.DieselEngine
import dev.ariltw.dagger.car.Engine

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun provideEngine(engine: DieselEngine): Engine
}