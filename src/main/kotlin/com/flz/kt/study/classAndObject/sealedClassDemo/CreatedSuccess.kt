package com.flz.kt.study.classAndObject.sealedClassDemo

class CreatedSuccess : ResponseResult(201, "created") {
    override fun doOthers() {
        println("do others after created")
    }

}