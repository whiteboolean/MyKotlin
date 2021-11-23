package com.example.mykotlin.step_6

import com.example.mykotlin.p
import java.io.File
import java.nio.charset.Charset
import java.util.ArrayList

data class ResponseResult1(val msg: String, val code: Int)
data class ResponseResult2(val msg: String, val code: Int)
data class ResponseResult3(val msg: String, val code: Int)
data class ResponseResult4(val msg: String, val code: Int)
// 省略几亿个类 ....

//对超类进行扩展

fun Any.showPrintlnContent() = p("当前内容是:$this")

fun Any.showPrintlnContent2(): Any {
    p("当前内容是:$this")
    return this
}


//TODO 114-Kotlin语言的超类上定义扩展函数
//1.扩展函数不允许被重复定义
//2.对超类扩展函数的影响
//3.扩展函数 链式调用

fun main() {
    ResponseResult1("login success", 200).showPrintlnContent()
    ResponseResult2("login success", 200).showPrintlnContent()
    ResponseResult3("login success", 200).showPrintlnContent()
    ResponseResult4("login success", 200).showPrintlnContent()
}

//KT内置的扩展函数，被我们重复定义，属于覆盖，而且优先使用我们自己定义的扩展函数
fun File.readLines(charset: Charset = Charsets.UTF_8): List<String> {

    val result = ArrayList<String>()
    forEachLine(charset) {
        result.add(it)
    }
    return result
}