package com.example.mykotlin.step_3

/**
 * 内置函数的总结
 *apply:
 * 1.apply函数返回类型，用于都是info本身
 * 2.apply函数的匿名函数里面持有的是this == info 本身
 *
 *
 * let：
 * 1.let函数返回类型，是根据函数最后一行的变化而变化
 * 2.let函数的匿名函数里面持有的是it == 集合本身
 *
 */
//TODO 51.Kotlin语言中的let内置函数
fun main() {

    //普通方式，对集合第一个元素相加
    val list: List<Int> = listOf(6, 5, 4, 5, 6, 7, 4)
    val value1: Int = list.first()

    val result1 = value1 + value1

    //let函数返回类型，是根据匿名函数最后一行的变化而变化
    val result2 = listOf(3, 4, 5, 6, 4).let {
        println(it)
        val i = it.first() + it.first()
        i
    }

    println(result2)


}

//普通方式 对值判null，并返回
private fun getMethod(value: String?): String {
    return if (value == null) "你传递的内容是Null" else "欢迎回来$value"
}

//简化版本
private fun getMethod2(value: String?) =
    if (value == null) "你传递的内容是Null" else "欢迎回来$value"

fun method3(value: String?): String = value?.let { "欢迎回来${it}" } ?: "你传递的内容是Null"
