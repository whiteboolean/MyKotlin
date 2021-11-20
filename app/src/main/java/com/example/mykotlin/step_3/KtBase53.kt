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
 *
 * with <---> 和run基本上一样，知识
 * 1.with函数返回类型，是根据函数最后一行的变化而变化 此条
 * 2.with函数的匿名函数里面持有的是this
 *
 */
//TODO 53.Kotlin语言中的with内置函数
fun main() {
    val str = "fdsa"
    with(str) {
        this
    }
    with(str, ::println)
    with(str, ::getStrLen)
    with(str, ::getInfMap)

    with(with(with(str) {
        length
    }) {
        this
    }) {
        this
    }
}

fun getStrLen(str: String) = str.length
fun getLenInfo(len: Int) = "你的字符串长度是:$len"
fun getInfMap(info: String) = "[$info]"