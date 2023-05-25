package com.flz.kt.study.basicDataType

fun main() {
    printInfo("abc")
    printInfo(123)
    printInfo(null)
    printInfo(1L)

    val x = 1
//    val y: String = x as String throw exception
    val y: String? = x as? String
    println(y)
}

fun printInfo(item: Any?) {
    if (item is String) {
        println("this is string item, content:$item,length:${item.length}")
    } else if (item is Int) {
        println("this is int item, content:$item,plus 15:${item.plus(15)}")
    } else if (item == null) {
        println("wtf? null!")
    } else {
        println("wtf? unknown!")
    }
}