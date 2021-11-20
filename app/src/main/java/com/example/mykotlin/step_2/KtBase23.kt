package com.example.mykotlin.step_2

fun main() {
    val count = "Jake".count()
    println("count:$count")

    val len2 = "JakeJJJJ".count() {
        // Jake中字符等于j的字符有多少个
        it == 'J'
    }
    println(len2)

    val len3 = "ABCDEFG"

    len3.count{
        it == 'A' //len3中字符等于A的有多少个
    }

}