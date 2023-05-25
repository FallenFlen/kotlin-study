package com.flz.kt.study.controlFlow

fun main() {
    handle(1)
    val result = try {
        handle(null)
        lastStep(1) // 最后一个表达式的值为try-catch的返回值（如果没有异常）
    } catch (e: Exception) {
        e.printStackTrace()
        -1 // 如果有异常被catch了，最后一个表达式的值为try-catch的返回值
    }
    println(result)
}

fun handle(num: Int?) {
    num ?: throw Exception("num can not be null")
    println(num)
}

fun lastStep(num: Int): Int {
    return num * 2
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}