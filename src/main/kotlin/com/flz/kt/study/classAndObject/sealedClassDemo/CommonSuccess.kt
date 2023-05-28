package com.flz.kt.study.classAndObject.sealedClassDemo

class CommonSuccess : ResponseResult(200,"success") {
    override fun doOthers() {
        println("do others after success")
    }

}