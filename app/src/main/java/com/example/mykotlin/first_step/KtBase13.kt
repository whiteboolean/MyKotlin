package com.example.mykotlin.first_step

//TODO 13.Kotlin语言的range表达式
fun main(args: Array<String>) {
    val number = 148
    //range 范围从哪里到哪里
    if (number in 0..43){
            print(number)
    }

    //range 范围 从哪里到哪里
    if(number in 0..59){
        print("不及格")
    }else if (number in 0..9){
        print("不及格 并且分数很差")
    } else if (number in 60..100){
        print("合格")
    } else if (number !in 0..100){
        print("天才")
    }

}
