package com.flz.kt.study.classAndObject.basic

class HashiqiDog : Dog {
    constructor(age: Int) : super("hsq", age) {

    }

    override fun executeSpecialAction() {
        println("hsq special action")
    }
}