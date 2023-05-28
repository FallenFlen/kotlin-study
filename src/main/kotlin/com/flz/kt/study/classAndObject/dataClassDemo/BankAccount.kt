package com.flz.kt.study.classAndObject.dataClassDemo

import java.math.BigDecimal

data class BankAccount(
    var userName: String,
    var number: String,
    var balance: BigDecimal = BigDecimal.ZERO
) {
    // toString()、 equals()、 hashCode() 以及 copy()不会用到该属性
    var extendAttr: String = ""
}
