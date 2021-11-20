package com.example.mykotlin.step_1

//TODO 14.Kotlin语言的when表达式
fun main(args: Array<String>) {
    val week = 5

    /**
     * Java的if语句
     * KT的if是表达式，有返回值
     */
    val info = when(week){
        1->"今天是星期一"
        2-> 23
        3-> "你好"
        else ->{
            println("养猪去了，忽略星期几")
        }
    }
    println(info)


}

