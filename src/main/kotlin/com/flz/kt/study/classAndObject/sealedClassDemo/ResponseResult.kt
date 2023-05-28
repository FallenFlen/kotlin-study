package com.flz.kt.study.classAndObject.sealedClassDemo

sealed class ResponseResult(code: Int, message: String?) {
    protected val message: String?
    protected val code: Int

    init {
        this.message = message
        this.code = code
    }

    // 密封类可以拥有抽象方法，密封类本身不能被实例化
    abstract fun doOthers()

    fun displayBasicInfo() {
        println("$code & $message")
    }
}
