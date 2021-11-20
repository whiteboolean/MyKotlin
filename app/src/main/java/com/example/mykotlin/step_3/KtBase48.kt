package com.example.mykotlin.step_3

//TODO 48.Kotlin语言的数字类型的安全转换
fun main() {

    val number:Int = "666".toInt()

    println(number)

    val number2:Int = "666.6".toInt()
    println(number2)


    val number3:Int?= "666.6".toIntOrNull()
    println(number3)

    val number4:Int? = "888.88".toIntOrNull()
    println(number4?:"原来你是null")

    //小结：以后字符串有整形相关的转换，尽量用此函数
}
