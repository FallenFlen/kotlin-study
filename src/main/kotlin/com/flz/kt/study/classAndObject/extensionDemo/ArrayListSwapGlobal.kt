package com.flz.kt.study.classAndObject.extensionDemo

fun <T> ArrayList<T>.swapGlobal(index1: Int, index2: Int) {
    // this代表当前被拓展的类的对象
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}