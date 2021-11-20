package com.example.mykotlin.step_3

const val INFO = "Jake is Success Result"
//TODO 43.Kotlin语言的substring
fun main() {
    val indexOf= INFO.indexOf("i")
    println(INFO.substring(0,indexOf))
    println(INFO.substring(0 until indexOf))
}
