package com.flz.kt.study.basicDataType

fun main() {
    // 装箱，跟java一样，Integer装箱有缓存池
    val n1Int: Int = 100
    val n1Integer: Int? = n1Int
    val n1Integer2: Int? = n1Int
    println(n1Integer == n1Integer2)
    println(n1Integer === n1Integer2)

    val n2Int: Int = 999996
    val n2Integer: Int? = n2Int
    val n2Integer2: Int? = n2Int
    println(n2Integer == n2Integer2) // true 双等号比较内容
    println(n2Integer === n2Integer2) // false 三等号比较引用

}