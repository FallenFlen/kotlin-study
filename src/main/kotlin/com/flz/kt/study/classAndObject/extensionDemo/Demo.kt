package com.flz.kt.study.classAndObject.extensionDemo

fun main() {
    val list = ArrayList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    println(list.joinToString())
    list.swap(0, 2)
    println(list.joinToString())
    list.swapGlobal(0, 1) // 用的是全局的扩展方法
    println(list.joinToString())
}

fun <T> ArrayList<T>.swap(index1: Int, index2: Int) {
    // this代表当前被拓展的类的对象
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}