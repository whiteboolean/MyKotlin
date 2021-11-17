package com.example.mykotlin.third_step

import java.lang.Exception
import java.lang.IllegalArgumentException
import java.util.*
import kotlin.math.roundToInt

//TODO 49.kotlin语言中Double转Int与类型格式化
fun main() {
    println(65.46.toInt())

    println(65.443.roundToInt())
    println(65.435.roundToInt())

    //结论： 用roundToInt()函数，保证Double ->转Int持有四舍五入的效果
    //保留三位小数点
    val r:String = "%.3f".format(65.5435343222)
    println(r)
}
