package com.example.mykotlin.third_step

import java.io.File
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.util.*
import kotlin.math.roundToInt

//TODO 50.Kotlin语言中的apply内置函数
fun main() {
    val info = "Jake, you are good"
    //普通方式
    println("info字符串的长度是:${info.length}")
    println("info字符串的最后一个字符是:${info[info.length - 1]}")
    println("info全部转成小写是:${info.lowercase(Locale.getDefault())}")


    //apply内置函数的方式
    //apply特点 ：apply始终返回info本身

    val infoNew: String = info.apply {
        println("apply匿名函数里面打印的:$this")
        println("info字符串的长度是:${length}")
        println("info字符串的最后一个字符是:${this[length - 1]}")
        println("info全部转成小写是:${lowercase(Locale.getDefault())}")
    }

    println("apply返回的值:$infoNew")
    //真正使用apply函数的写法规则如下
    //apply特点： 返回函数本身，可以链式调用
    info.apply {
        println("info字符串的长度是:$length")
    }.apply {

    }.let {

    }.apply {

    }

    val file = File("/Users/dg/Documents/mp.log")
    file.apply {
        setExecutable(true)
        setReadable(true)
        println(file.readLines())
    }
}
