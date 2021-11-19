package com.example.mykotlin.third_step

import java.io.File
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.util.*
import kotlin.math.roundToInt

/**
 * 内置函数的总结
 *apply:
 * 1.apply函数返回类型，永远都是info本身
 * 2.apply函数的匿名函数里面持有的是this == info 本身
 *
 * let：
 * 1.let函数返回类型，是根据函数最后一行的变化而变化
 * 2.let函数的匿名函数里面持有的是it == 集合本身
 *
 * run：
 * 1.run函数返回类型，是根据函数最后一行的变化而变化 此条
 * 2.run函数的匿名函数里面持有的是this
 *
 * with: <---> 和run基本上一样，知识
 * 1.with函数返回类型，是根据函数最后一行的变化而变化 此条
 * 2.with函数的匿名函数里面持有的是this
 *
 *
 * also:
 * 1.also函数返回类型，永远都是返回调用者本身
 * 2.also里面持有的是it
 *
 *
 * takeUnless
 */
//TODO 55.Kotlin语言中的takeUnless内置函数
fun main() {

    val name = "JakeAha"
    val hasJake = name.indexOf("ha")
    println("hasJake = $hasJake")
    if (hasJake > 0) {
        println("hasJake>0:")
    }
    println(name)


    //换成takeIf的写法

    name.indexOf("Aha")
        .takeUnless {
            it < 0
        }?.let {
            println("it：$it")
            it
        }.run {
            println(this.toString())
        }
}

