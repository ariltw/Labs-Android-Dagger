package dev.ariltw.dagger

import dagger.Component

@Component
interface CarComponent {
    val getCar: Car
}