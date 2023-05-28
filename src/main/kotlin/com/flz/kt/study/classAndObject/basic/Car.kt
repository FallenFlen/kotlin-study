package com.flz.kt.study.classAndObject.basic

class Car {
    var code: String? = null
        set(value) {
            println("change value to $value")
            // field代表当前字段
            field = value?.repeat(2) ?: "null"
        }
        get() {
            println("current value:$field")
            return field
        }


}