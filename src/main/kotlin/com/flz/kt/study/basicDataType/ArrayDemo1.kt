package com.flz.kt.study.basicDataType

fun main() {
    val array = Array(5) { i -> "--$i--" }
    for (it in array) {
        println(it)
    }

    val array2 = arrayOf("s1", "s2", "s3", "s4")
    val map = array2.map { it.reversed() }
    map.forEach { println(it) }

    val array3: Array<String> = arrayOf("1", "2")
}