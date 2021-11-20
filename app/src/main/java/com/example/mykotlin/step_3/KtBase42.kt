package com.example.mykotlin.step_3

//TODO 42.Koltin 语言的先决条件函数
fun main() {
    val value1:String? = null
    val value2:Boolean = false
    //checkNotNull(value1) //java.xx.xxx
    requireNotNull(value1)
    require(value2)
}
