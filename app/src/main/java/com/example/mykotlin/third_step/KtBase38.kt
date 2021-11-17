package com.example.mykotlin.third_step

//TODO 38.Kotlin语言中的非可控断言操作符特点
fun main() {
    var name:String ? = null

    val capitalize = name!!.capitalize() //!! 断言 不管name是不是null，都执行
    println(capitalize)
}