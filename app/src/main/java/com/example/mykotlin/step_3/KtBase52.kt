package com.example.mykotlin.step_3

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
 */
//TODO 51.Kotlin语言中的run内置函数
fun main() {
    val str = "Jake is good"
    val r1: Float = str.run {
        true
        4343.43f
    }

   val a  = str.run {
        23.3f
    }


    str.run(::具名函数)
        .run(::showText)
        .run{
            "你好吗？"
        }
        .apply {

        }.run(::print)
}

fun 具名函数(str: String): Boolean = if (str.length > 0) true else false

fun showText(isLong: Boolean) = if (isLong) "合格" else "不合格"