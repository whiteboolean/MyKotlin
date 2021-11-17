package com.example.mykotlin.second_step


// TODO 27.Kotlin语言的匿名函数类型推断
fun main(args: Array<String>) {

    //匿名函数： 类型推断为String
    //方法名： 必须指定参数类型和返回值类型
    //方法名 = 类型推断返回值
    val method: (Int) -> Unit = {

    }

    //入参和出参
    val method1 = { v1: Double, v3: Float, v2: Int ->
        true
    }

    val method2 = { v1: Double, v3: Float, v2: Int ->
        "true"
    }

    val method3 = { v1: Double, v3: Float, v2: Int ->
        3.1315043
    }


    println(method3(1.0, 32F, 3))

}