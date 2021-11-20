package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi

//TODO 64.Kotlin语言的集合转换与快捷函数学习
/**
 * 1.定义可变List集合
 * 2.list转Set去重
 * 3.List转Set 转List也能去重
 * 4.快捷函数去重
 */
fun main() {

    val  list  = mutableListOf("Jake","Jett","Jett","Leo","Ray","Adam")//list可以重复元素

    //List转Set去重
    val set  = list.toSet()
    println(set)

    //List转Set转List去重
    val list2 = list.toSet().toList()
    println(list2)

    //快捷函数去重 distinct
    println(list.distinct()) //内部做了：先转变成 可变的Set集合 再转换成List集合

    println(list.toMutableSet().toList())
}