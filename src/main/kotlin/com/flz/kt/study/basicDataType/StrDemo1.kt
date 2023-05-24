package com.flz.kt.study.basicDataType

fun main() {
//    var str1: String = null 编译错误，不带“?”的变量不能为null
    var str1: String? = null
    str1 = "abc"

    val repeat = str1.repeat(20)
    println(repeat)

    println(repeat[repeat.length - 1])

    for (ch in repeat) {
        print("===$ch===")
    }

    println()

    val message = "kotlin message"
    val template = "你就是酷不酷吧，这是模板字符串：$message"
    println(template)
}