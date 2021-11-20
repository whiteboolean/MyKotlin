package com.example.mykotlin.step_3

//TODO 43.Kotlin语言的split操作
fun main() {
    val jsonText = "JAKE,LANCE,AV,WAHAHA"
    //list自动类型推断成 list = list
    val list = jsonText.split(",")

    println(list)
    //C++ 结垢  kt也有解构
    val (v1, v3, v4, v5) = list
    println("v1:$v1 , v2:$v3 ,v4:$v4,v5:$v5")

    val list1 = listOf(1, 2, 3, 4)
    val (a1, a2, a3, a4) = list1
    println("a1:$a1,a2:$a2,a3:$a3,a4:$a4")
}
