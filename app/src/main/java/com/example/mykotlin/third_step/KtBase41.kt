package com.example.mykotlin.third_step

import java.lang.Exception
import java.lang.IllegalArgumentException

//TODO 41.Kotlin语法中异常处理与自定义异常特点
fun main() {

    try {
        val info: String? = "null"
        checkException(info)
        println(info!!.length)
    } catch (e: Exception) {
        print("嗯嗯嗯")
    }
}

private fun checkException(info: String?) {
    info ?: throw CustomException()
}

class CustomException : IllegalArgumentException("你的代码太辣鸡了")
