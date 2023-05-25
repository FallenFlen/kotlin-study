package com.flz.kt.study.controlFlow

fun main() {
//    test1()
    test2()
}

private fun test2() {
    val intRange = 1..10
    val intRangeList = intRange.toList()

    intRangeList.forEach tag@{
        if (it == 5) {
            return@tag // 等价于常规循环中的continue
        }
        println(it)
    }

    println("-".repeat(20))
}

private fun test1() {
    val intRange = 1..100
    val intRangeList = intRange.toList()

    intRangeList.forEach {
        if (it == 5) {
            return // 不像java只会把lambda终止，kt会直接终止test1
        }
        println(it)
    }

    println("-".repeat(20))

    for (i in intRange) {
        println(i)
    }

}
