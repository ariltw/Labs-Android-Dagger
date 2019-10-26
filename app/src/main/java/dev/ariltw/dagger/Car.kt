package dev.ariltw.dagger

import javax.inject.Inject

class Car @Inject constructor(wheels: Wheels) {
    @Inject lateinit var engine: Engine
    lateinit var wheels: Wheels

    fun drive(): Unit {

    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}