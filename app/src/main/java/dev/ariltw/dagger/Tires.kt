package dev.ariltw.dagger

import java.util.logging.Logger

class Tires {
    val TAG: String = Tires::class.java.simpleName

    fun inflate() {
        Logger.getLogger(TAG).info("Tires inflated");
    }
}