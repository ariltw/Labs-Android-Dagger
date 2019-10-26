package dev.ariltw.dagger.car

import java.util.logging.Logger
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {
    val TAG: String = DieselEngine::class.java.simpleName

    override fun start() {
        Logger.getLogger(TAG).info("Diesel engine started!")
    }

}