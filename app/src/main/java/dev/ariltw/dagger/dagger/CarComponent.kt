package dev.ariltw.dagger.dagger

import dagger.Component
import dev.ariltw.dagger.MainActivity
import dev.ariltw.dagger.car.Car

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    var getCar: Car
    fun inject(activity: MainActivity)
}