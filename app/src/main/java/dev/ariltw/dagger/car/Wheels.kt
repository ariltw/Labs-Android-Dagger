package dev.ariltw.dagger.car

import javax.inject.Inject

class Wheels @Inject constructor(private var rim: Rims, private var tires: Tires) {

}