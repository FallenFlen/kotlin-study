package com.flz.kt.study.classAndObject.dataClassDemo

import java.math.BigDecimal

fun main() {
    val bankAccount = BankAccount("u1", "ZSB00001", BigDecimal("996"))
    // 解构语法
    val (userName, number, balance) = bankAccount
    bankAccount.extendAttr = "ext1"
    println("first bank account basic info:$userName,$number,$balance,${bankAccount.extendAttr}")

    val bankAccount2 = BankAccount("u1", "ZSB00001", BigDecimal("996"))
    bankAccount.extendAttr = "ext1-diff"

    println(bankAccount == bankAccount2) // true,extendAttr不参与
    println(bankAccount === bankAccount2) // false
}