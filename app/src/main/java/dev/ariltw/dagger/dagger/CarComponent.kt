package dev.ariltw.dagger.dagger

import dagger.BindsInstance
import dagger.Component
import dev.ariltw.dagger.MainActivity
import dev.ariltw.dagger.car.Car
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    var getCar: Car
    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsepower(@Named("horsepower") horsepower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun build(): CarComponent
    }
}