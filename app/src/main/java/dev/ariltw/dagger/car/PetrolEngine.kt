package dev.ariltw.dagger.car

import java.util.logging.Logger
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {
    val TAG: String = PetrolEngine::class.java.simpleName

    override fun start() {
        Logger.getLogger(TAG).info("Petrol engine started!")
    }
}