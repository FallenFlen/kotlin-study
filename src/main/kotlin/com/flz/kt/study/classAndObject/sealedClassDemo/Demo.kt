package com.flz.kt.study.classAndObject.sealedClassDemo

// sealed class:密封类
fun main() {
    displayInfo(CommonSuccess())
    println()
    displayInfo(CreatedSuccess())
}

fun displayInfo(responseResult: ResponseResult) {
    when (responseResult) {
        is CommonSuccess -> {
            responseResult.displayBasicInfo()
            println("success and then")
            responseResult.doOthers()
        }

        is CreatedSuccess -> {
            responseResult.displayBasicInfo()
            println("success and then")
            responseResult.doOthers()
        }

        // switch密封类不需要else，如果全覆盖的话
//        else -> {
//            ...
//        }
    }
}