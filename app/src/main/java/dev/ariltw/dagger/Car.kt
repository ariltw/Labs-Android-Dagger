package dev.ariltw.dagger

import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheels: Wheels) {
    lateinit var engine: Engine
    lateinit var wheels: Wheels

    fun drive(): Unit {

    }
}