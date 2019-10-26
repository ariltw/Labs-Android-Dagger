package dev.ariltw.dagger

import dagger.Component

@Component (modules = [WheelsModule::class])
interface CarComponent {
    var getCar: Car
    fun inject(activity: MainActivity)
}