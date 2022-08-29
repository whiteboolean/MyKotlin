package com.example.mykotlin.step_6

import com.example.mykotlin.step_6.randomItemValuePrintln as p
import com.example.mykotlin.step_6.randomItemValue as k


fun main() {

    val list:List<String> = listOf("Jake","Ray","Rookie")
    val set:Set<Double> = setOf(545.4,434.5,656.6)

    //使用扩展函数

    println(list.k())
    list.p()
}