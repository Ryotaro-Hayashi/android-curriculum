package com.example.language_specification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // インスタンスを作成
        val car = Car()
        // car.name()
        car.car()

        val bike = Bike()
        bike.bike()
    }
}
