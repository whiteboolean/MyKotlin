package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi

//TODO 60.在kotlin语言的List集合遍历学习
fun main() {


    val list = listOf<String>("123","456","566","345")

    //第一种 遍历方法
    for(i in list){
        println("i:$i")
    }

    //第二种 遍历方法
    list.forEach {
        println("it:$it")
    }

    //第三种 遍历方式
    list.forEachIndexed{index, s ->
        println("下标:$index , 元素：$s")
    }
}