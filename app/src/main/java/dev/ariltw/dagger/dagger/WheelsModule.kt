package dev.ariltw.dagger.dagger

import dagger.Module
import dagger.Provides
import dev.ariltw.dagger.car.Rims
import dev.ariltw.dagger.car.Tires
import dev.ariltw.dagger.car.Wheels

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
        return Wheels(
            Rims(),
            Tires()
        )
    }
}