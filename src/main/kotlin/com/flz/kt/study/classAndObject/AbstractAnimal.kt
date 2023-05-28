package com.flz.kt.study.classAndObject

abstract class AbstractAnimal constructor(type: String) {
    protected var type: String

    init {
        this.type = type
    }

    fun call() {
        println("current animal(${this.type}) is doing something now!")
        makeSound()
        eat()
    }

    abstract fun makeSound()

    abstract fun eat()

    // 对子类开放重写权限
    open fun executeSpecialAction() {
        println("dog common special action")
    }
}