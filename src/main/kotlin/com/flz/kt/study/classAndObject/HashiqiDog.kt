package com.flz.kt.study.classAndObject

class HashiqiDog : Dog {
    constructor(age: Int) : super("hsq", age) {

    }

    override fun executeSpecialAction() {
        println("hsq special action")
    }
}