package dev.ariltw.dagger

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        var tires: Tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(): Wheels {
        return Wheels(Rims(), Tires())
    }
}