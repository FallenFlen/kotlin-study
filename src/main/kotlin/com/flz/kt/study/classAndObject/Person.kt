package com.flz.kt.study.classAndObject

class Person constructor(firstName: String, lastName: String) {
    private var firstName: String
    private var lastName: String
    private var age: Int?

    init {
        this.firstName = firstName
        this.lastName = lastName
        this.age = null
    }

    constructor(firstName: String, lastName: String, age: Int?) : this(firstName, lastName) {
        this.age = age
    }

    fun getDescription(): String {
        return listOf(this.firstName, this.lastName, this.age).joinToString("-")
    }
}