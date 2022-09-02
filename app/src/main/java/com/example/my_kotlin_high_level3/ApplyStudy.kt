package com.example.my_kotlin_high_level3

import kotlin.contracts.contract

/**
 * 所有高阶函数，必须用inline修饰，为什么，因为内部会对lambda优化
 *
 */

fun main() {

    "你好".apply {
        length
    }.apply {
        single()
    }.apply {
        toInt()
    }

    "你好".myApply {
        println(this)
    }.myApply {
        println("我是:${this}")
    }

}

private inline fun <T> T.myApply(block: T.() -> Unit): T {
    block()
    return this
}

//inline fun <T> T.myLet