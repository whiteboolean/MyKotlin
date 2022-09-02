package com.example.my_kotlin_high_level3


fun main() {

    //1.定义name集合
    val names = listOf("zhangsan","lisi","wangwu")

    //2.定义ages集合
    val ages = listOf(20,21,22)

    names.zip(ages).toMap().map {
        "your name:${it.key} , your age:${it.value}"
    }.map {
        println(it)
    }

//    names.map {
//        println("names:it:$it")
//    }


}