package com.example.mykotlin.second_step

//TODO 24.Kotlin 语言的函数类型&隐式返回学习
fun main() {
    //我们现在在写函数

    //第一步：函数输入输出的声明
    val methodAction: () -> String
    //第二步： 对上面函数的实现
    methodAction = {
        val inputValue = 9999999
        "$inputValue Jake"
        //匿名函数不需要写return ，最后一行就是返回值
    }

    println(methodAction)

    val methodStudy: (Int, String) -> Int

    methodStudy = { i: Int, s: String ->
        (i.toString()+s).toInt()
    }

    println(methodStudy(1,"32"))

}


/*
    fun methodAction():String {
         return "Jake"
 */