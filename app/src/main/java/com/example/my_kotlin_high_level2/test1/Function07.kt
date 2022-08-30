package com.example.my_kotlin_high_level2.test1

import lambdaImpl

fun main() {

    showAction {
        "我的值是:$it"
    }

    //:: 把这个函数变成函数引用，就可以传递赋值给变量了
    showAction(::lambda)
    val r1: Function1<Int, String> = ::lambdaImpl
    val r2: (Int) -> String = r1
    val r3: Int.() -> String = r2 // Int.() == (Int)  Int.()  Int.属于来源 ，会自动把来源作为第一个参数

    //Int.() -> String 接收类型 (Int)->String
    //Int.(String) -> Unit方法是两个参数的? = (Int,String) ->Unit
}

fun lambda(value: Int) = "我的值是:$value"


fun showAction(action: (Int) -> String) {
    println(action(88))
}