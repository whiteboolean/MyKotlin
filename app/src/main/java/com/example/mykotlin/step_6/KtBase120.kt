package com.example.mykotlin.step_6

import com.example.mykotlin.p

//导入文件

fun main(args: Array<String>) {
    val list = listOf("123","324","432")
    val set :Set<Double> = setOf(324.3,43.32,432.3)

    //如果不使用文件

    list.shuffled().first()
    set.shuffled().first()


    println()

    p(list.randomItemValue())

}