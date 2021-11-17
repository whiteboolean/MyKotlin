package com.example.mykotlin.second_step


// TODO 25.Kotlin函数参数的学习
fun main(args: Array<String>) {

    val methodAction2: (Int, Int, Int) -> String = { a, b, c ->
        "a+b+c的值为${(a + b + c)}"
    }

    println(methodAction2(1,2,3))
}