package com.example.mykotlin.step_2


// TODO 33.Kotlin语言的函数类型作为返回类型
fun main() {
    show("")
    show2("你好")

    val show5 = show4("你好")

    val show51 = show5("你好", 23)
}

fun show(info: String): Boolean {
    println("我是show函数 info:$info")
    return true
}

fun show2(info: String): String {
    println("我是show函数 info:$info")
    return "你好"
}

fun show4(info: String): (String, Int) -> String {
    return { name: String, age: Int ->
        "我是匿名函数 --- name:$name , age:$age"

    }
}

