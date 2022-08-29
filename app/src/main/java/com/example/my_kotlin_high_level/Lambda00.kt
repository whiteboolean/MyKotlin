package com.example.my_kotlin_high_level

fun main() {
    "你好".toast()
    124.toast()

}


//Java的函数 先有输出再有输入
//public Object student(String name)

//KT 的函数 先有输入 再有输出 合理
public fun getStudent(name:String):Any?{
    return null
}


fun String.toast() = print(this)
fun Int.toast() = print(this)
fun <T>T.toast() = print(this)
