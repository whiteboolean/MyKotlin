package com.example.mykotlin.third_step

//TODO 39.Kotlin语法中对比使用if判断null值情况
fun main() {
    var info: String? = "李小龙"
//    info = null
    if (info == null) {
        println(info ?: "原来你是null啊")
    } else {
        println("啊原来你不为null啊")
    }
}