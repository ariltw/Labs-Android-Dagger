package dev.ariltw.dagger.car

import java.util.logging.Logger
import javax.inject.Inject

class Remote @Inject constructor() {
    val TAG: String = Remote::class.java.simpleName

    fun setListener(car: Car) {
        Logger.getLogger(TAG).info("Remote on")
    }
}