package com.flz.kt.study.classAndObject

// open表示可以开放继承权，不加open等价于java中的final
open class Dog constructor(type: String, age: Int) : AbstractAnimal(type) {
    var age: Int

    init {
        this.age = age
    }

    override fun makeSound() {
        println(super.type)
        println("${this.age} years old dog is wang wang wang!!!")
    }

    override fun eat() {
        println("${this.age} years old dog is eating shit!!! omg")
    }
}