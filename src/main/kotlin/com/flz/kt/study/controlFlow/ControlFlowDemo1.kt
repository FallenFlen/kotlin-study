package com.flz.kt.study.controlFlow

fun main() {
    println(practiceIfElse())
    practiceWhen(888)
    practiceWhen(null)
    practiceWhen("abc")
    practiceWhen(5.66)

    println("-".repeat(20))

    println(practiceWhen2(-1))
    println(practiceWhen2(0))
    println(practiceWhen2(1))
    println(practiceWhen2(4))
    println(practiceWhen2(6))

    practiceWhen3("0")
    practiceWhen3("1")
}

private fun practiceWhen3(item: String) {
    when (val toInt = item.toInt()) {
        0 -> println("zero!")
        else -> println("nothing!")
    }
}

private fun practiceWhen2(item: Int): Int {
    return when (item) {
        0, 1 -> 20230525
        in 2..10 -> item + 996
        else -> 0
    }
}

private fun practiceWhen(item: Any?) {
    // == switch
    when (item) {
        is Int -> {
            println("is Int")
        }

        is String -> {
            println("is String")
        }

        null -> {
            println("is fucking null?")
        }

        else -> {
            println("wtf man?")
        }
    }
}

private fun practiceIfElse(): String {
    val a = 996
    val b = 997
    return if (a > b) "aBig" else "bBig"
}