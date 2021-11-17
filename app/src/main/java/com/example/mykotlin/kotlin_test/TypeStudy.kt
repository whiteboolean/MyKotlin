package com.example.mykotlin.kotlin_test

fun main(args: Array<String>) {

    //TODO 类型推断
    val name1: String = "Jake"
    val info1: String = "真的很帅"

    //自动推导
    val name = "jake"
    val info = "你好"
    val sex = 'C'
    val age = 35

    //思考题：Kotlin是静态语言还是动态语言？
    var value1 = "KT" //因为在编译器，类型推断就决定了是String
    //value1 = 10000// 是String 类型不配
    //编译器就决定的就是静态语言
}