package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi

//TODO 61.Kotlin语言的解构语法过滤元素学习
/**
 * 1.集合配合解构语法
 * 2.反编译看Java给三个变量赋值的代码
 * 3.解构屏蔽接受值
 */
fun main() {


    val list = listOf<String>("123","456","566","345")

    val (value1,value2,value3) = list

    println("value1:$value1,value2:$value2,value3:$value3")

    var(v1,v2,v3) = list
    v1 = "oK"
    println("v1:$v1,v2:$v2,v3:$v3")


    //用_内部可以不接收赋值，可以节约一点性能
    val(_,n2,n3) = list
//    println(_) _不是变量名 ，是用来过滤解构赋值的，不接收赋值给我
    println("n2:$n2,n3:$n3")

}