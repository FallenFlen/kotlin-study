package com.flz.kt.study.classAndObject

fun main() {
    val p1 = Person("f1", "n1")
    val p2 = Person("f2", "n2", 23)
    println(p1.getDescription())
    println(p2.getDescription())
    println("-".repeat(10))
    val dog = Dog("Dog", 1)
    dog.call()

}