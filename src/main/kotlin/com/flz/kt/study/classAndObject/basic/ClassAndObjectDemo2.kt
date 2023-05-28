package com.flz.kt.study.classAndObject.basic

fun main() {
    val car = Car()
    println(car.code)
    car.code = "0528" // 对外就是普通赋值，实际上内部会去调setter，getter同理
    println(car.code)
}