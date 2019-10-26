package dev.ariltw.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.ariltw.dagger.car.Car
import dev.ariltw.dagger.dagger.CarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = DaggerCarComponent.create()
        component.inject(this)

        car.drive()
    }
}
