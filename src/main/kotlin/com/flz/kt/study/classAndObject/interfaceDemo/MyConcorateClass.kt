package com.flz.kt.study.classAndObject.interfaceDemo

class MyConcorateClass(override var prop: Int) : MyInterface {


    override fun getRes(): Int {
        return this.prop * 233
    }

    override fun getRes2(): Int {
        return 528
    }
}