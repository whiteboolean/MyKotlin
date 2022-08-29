package com.example.mykotlin.step_6

import com.example.mykotlin.p
import java.io.File


//TODO 124-Kotlin 语言的变换函数-map
fun main() {
    val list = listOf("Ray", "Rookie", "Adam")
    //T T T --->新的集合（R，R,R）
    //原理：就是把你 匿名函数 最后一行的返回值 加入一个新的集合 新集合的泛型是R，并且返回新集合

    val list2: List<Int> = list.map {
        "[$it]"
        99
    }
    p(list2)

    //用途： 和RxJava的思路，一模一样
    val list3 :List<String> = list.map {
        "姓名是:$it"
    }.map {
        "$it,文字的长度是:${it.length}"
    }.map {
        "[$it]"
    }

    for(s in list3){
        print("$s ")
    }


    list.map {
        "姓名是:$it"
    }.map {
        "$it,文字的长度是:${it.length}"
    }.map {
        "[$it]"
    }.map {
        print("$it ")
    }

}