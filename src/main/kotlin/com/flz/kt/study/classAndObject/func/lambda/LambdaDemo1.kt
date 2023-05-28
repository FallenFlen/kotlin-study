package com.flz.kt.study

fun main() {
    val sum = { x: Int, y: Int, z: Int -> x + y + z }
    println(sum.invoke(1, 2, 3))
    println(sum.invoke(6, 5, 4))
}
