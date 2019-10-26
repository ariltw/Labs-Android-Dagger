package dev.ariltw.dagger.car

import java.util.logging.Logger

class DieselEngine(val horsepower: Int) : Engine {
    val TAG: String = DieselEngine::class.java.simpleName

    override fun start() {
        Logger.getLogger(TAG).info("Diesel engine started. Horsepower: $horsepower")
    }
}