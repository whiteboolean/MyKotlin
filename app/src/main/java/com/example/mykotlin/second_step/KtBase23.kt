package com.example.mykotlin.second_step

fun main() {
    val count = "Jake".count()
    println("count:$count")

    val len2 = "Jake".count() {
        // Jake中字符等于j的字符有多少个
        it == 'j'
    }
    println(len2)
}