package com.example.mykotlin.third_step

import java.lang.Exception
import java.lang.IllegalArgumentException
import java.util.*

//TODO 47.Koltin语言的字串遍历操作
fun main() {
    val str = "fdasfdasfasfdsafasd"
    str.forEach { c -> //覆盖默认参数名
        println("[$c]")

    }
}
