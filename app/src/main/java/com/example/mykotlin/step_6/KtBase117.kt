package com.example.mykotlin.step_6

val myStr:String = "AAA"


val String.myInfo:String
    get() = "Jake"



fun String.showPrintln():String{
    println("打印输出 并且 链式调用(只有String有资格这样):内容$this")
    return this
}


val String.stringAllInfoValueVal get() = "当前${System.currentTimeMillis()}"


//TODO 117-kotlin语言的扩展属性
fun main() {
    val str:String = "abc"
    println(str.myInfo)

    str.showPrintln()
        "你好".stringAllInfoValueVal //扩展属性
            .showPrintln()//扩展函数
}