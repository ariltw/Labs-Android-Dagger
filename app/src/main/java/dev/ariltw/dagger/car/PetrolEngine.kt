package dev.ariltw.dagger.car

import java.util.logging.Logger
import javax.inject.Inject
import javax.inject.Named
import kotlin.properties.Delegates

class PetrolEngine @Inject constructor(
    @Named("horsepower") private val horsepower: Int,
    @Named("engine capacity") private val engineCapacity: Int
) : Engine {
    val TAG: String = PetrolEngine::class.java.simpleName

    override fun start() {
        Logger.getLogger(TAG).info(
            "Petrol engine started! \n " +
                    "Horsepower : $horsepower \n" +
                    "Engine capacity : $engineCapacity"
        )
    }
}