package com.example.mykotlin.step_3

import java.lang.Exception
import java.lang.IllegalArgumentException

//TODO 41.Kotlin语法中异常处理与自定义异常特点
fun main() {

    try {
        val info: String?  = "null"
        checkException(info)
        val info2:String? = null
        println(info2?:"fsd")

        var str: String? = null
        var str2: String? = "May be declare nullable string"
        var len1:  Int = str ?.length ?: -1
        var len2:  Int = str2 ?.length ?:  -1

        println("Length of str is ${len1}")
        println("Length of str2 is ${len2}")
        return
//        println(info!!.length)
    } catch (e: Exception) {
        e.printStackTrace()
        print("嗯嗯嗯")
    } finally {
        println("finally之前return了看finally还走不走")
    }
}

private fun checkException(info: String?) {
    info ?: throw CustomException()
}

class CustomException : IllegalArgumentException("你的代码太辣鸡了")
