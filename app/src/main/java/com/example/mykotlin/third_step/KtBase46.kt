package com.example.mykotlin.third_step

import java.lang.Exception
import java.lang.IllegalArgumentException
import java.util.*

//TODO 46.kotlin语言 == 和=== 比较操作
fun main() {
    // == 值内容的比较 相当于 Java的equals
    // === 引用的比较
    val name1: String = "Jake"
    val name2: String = "Jake"
    println(name1.equals(name2))
    println(name1 == name2)

    println(name1 === name2) //引用指向同一个地址


    val name4 =
        "Jake".replaceFirstChar {
            if (it.isLowerCase())
                it.titlecase(Locale.ROOT)
            else it.toString()
        } //修改成更大写

    println(name4 === name1)
}
