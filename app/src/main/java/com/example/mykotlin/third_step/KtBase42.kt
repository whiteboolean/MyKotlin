package com.example.mykotlin.third_step

import java.lang.Exception
import java.lang.IllegalArgumentException

//TODO 42.Koltin 语言的先决条件函数
fun main() {
    val value1:String? = null
    val value2:Boolean = false
    //checkNotNull(value1) //java.xx.xxx
    requireNotNull(value1)
    require(value2)
}
