package com.example.mykotlin.step_3

import java.io.File

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
 */
//TODO 54.Kotlin语言中的also内置函数
fun main() {
    val str = "afafdsa"

    var a = str.also {
//        it == str本身
    }.also {
        println("转换成小写字母")
    }.also {
        println("结束了")
    }

    val file = File("D://")
    file.also {
        file.setReadable(true)
        file.setWritable(true)
        println(file.readLines())
    }.also {
        it.setWritable(true)
    }


    a.map {

    }
}

