package dev.ariltw.dagger.dagger

import dagger.Binds
import dagger.Module
import dev.ariltw.dagger.car.Engine
import dev.ariltw.dagger.car.PetrolEngine

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun provideEngine(engine: PetrolEngine): Engine
}