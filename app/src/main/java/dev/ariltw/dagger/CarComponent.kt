package dev.ariltw.dagger

import dagger.Component

@Component
interface CarComponent {
    var getCar: Car
    fun inject(activity: MainActivity)
}