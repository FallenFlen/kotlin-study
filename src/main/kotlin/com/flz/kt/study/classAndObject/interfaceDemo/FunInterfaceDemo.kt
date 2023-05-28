package com.flz.kt.study.classAndObject.interfaceDemo

import java.util.function.Consumer
import java.util.function.IntPredicate

fun main() {
    val intPredicate = IntPredicate { it % 2 == 0 }
    val consumer = Consumer<Int> { println(it * 10) }
    println(intPredicate.test(2))
    println(intPredicate.test(3))
    consumer.accept(1)
}