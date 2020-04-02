package com.example.language_specification

//class Car() {
//    // メソッドを定義
//    fun name() = println("軽トラック")
//}

// 親クラス
open class Vehicle {
    val speed = "走る"
    val tire= "タイヤ"
    val engine = "エンジン"
    val seat = "シート"
}

// 親クラスを継承した子クラス
class Car : Vehicle() {
    fun car() {
        println("親から受け継いだロジック")
        println(speed)
        println(tire)
        println(engine)
        println(seat)
    }
}

class Bike : Vehicle() {
    fun bike() {
        println("親から受け継いだロジック")
        println(speed)
        println(tire)
        println(engine)
        println(seat)
    }
}