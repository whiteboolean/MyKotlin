package com.example.mykotlin.step_6

import com.example.mykotlin.p

//TODO 126 kotlin语言的过滤函数 - filter
fun main(args: Array<String>) {

    val nameLists = listOf(
        listOf("A", "B", "C"),
        listOf("D", "E", "F"),
        listOf("G", "H", "O")
    )

    nameLists.map {
        p(it)
//        p("1")
    }


    p()

    var i: Int = 0
    val flatMap = nameLists.flatMap {
        i++
//        println(it)
//        p("$i")
        listOf("")
    }

    println(flatMap)

    nameLists.flatMap {
        //进来了三次
            it ->
        it.filter {
            //进来了九次
            p("$it filter")
            it == "张三"
        }
    }.map {
        println("$it  ")
    }
    println()
    println()


    nameLists.map { it ->
        it.filter {
            true
        }
    }.map {
        print("$it ")
    }

    "aa".let {
     124
    }.run {
        324
    }.apply {

    }

    println()



}