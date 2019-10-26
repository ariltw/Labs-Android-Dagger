package dev.ariltw.dagger.car

import javax.inject.Inject

class Wheels @Inject constructor(var rim: Rims, var tires: Tires) {

}