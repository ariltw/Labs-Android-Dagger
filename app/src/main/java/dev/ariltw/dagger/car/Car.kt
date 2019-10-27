package dev.ariltw.dagger.car

import java.util.logging.Logger
import javax.inject.Inject

class Car @Inject constructor(private val wheels: Wheels, private val driver: Driver) {
    val TAG: String = Car::class.java.simpleName

    @Inject
    lateinit var engine: Engine

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Logger.getLogger(TAG).info("$driver drives $this")
    }
}