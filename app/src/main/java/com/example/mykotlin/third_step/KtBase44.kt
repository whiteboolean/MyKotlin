package com.example.mykotlin.third_step

import java.lang.Exception
import java.lang.IllegalArgumentException

//TODO 43.Kotlin语言的split操作
fun main() {
    val jsonText = "JAKE,LANCE,AV,WAHAHA"
    //list自动类型推断成 list = list
    val list = jsonText.split(",")

    println(list)
    //C++ 结垢  kt也有解构
    val (v1, v3, v4, v5) = list
    println("v1:$v1 , v2:$v3 ,v4:$v4,v5:$v5")
}
