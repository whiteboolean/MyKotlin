package com.example.mykotlin.step_2


// TODO 28.lambda表达式和匿名函数的关系
fun main(args: Array<String>) {
    val addResultMethod = { number1: Int, number2: Int ->
        "两数相加的结果是：${number1 + number2}"
    }
    println(addResultMethod(1, 2))


    //匿名函数 入参Int ，返回 Any类型
    // lambda表达式 Int，lambda表达式的结果Any类型
    val weekResultMethod = { number: Int ->
        when (number) {
            1 -> "星期1"
            2 -> "星期2"
            3 -> "星期3"
            4 -> "星期4"
            5 -> "星期5"
            6 -> "星期6"
            else -> -1
        }
        //weekResultMethod 函数:(Int) -> Any
    }
    println(weekResultMethod(0))
    //匿名函数 属于 lambda
}