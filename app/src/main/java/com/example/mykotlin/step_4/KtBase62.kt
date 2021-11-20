package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi

//TODO 62.Kotlin语言的Set创建与元素获取
/**
 * 1.set定义不允许重复
 * 2.普通方式elementAt 会越界崩溃
 * 3.elementAtOrElse elementAtOrNull
 */
fun main() {

    val set:Set<String> = setOf("list","wangwu","zhaoliu","zhaoliu") //set集合不会出现重复元素 ，zhaoliu加不进去
//    println(set)
//    println(set.count()) //长度为3
//    val a= set.count {
//        it == "zhaoliu"
//    }
//    println(a)


    println(set.elementAtOrElse(0){"越界了"})
    println(set.elementAtOrElse(100){"越界了"})


    println(set.elementAtOrNull(99))

    println(set.elementAtOrNull(89)?:"你越界了")



}