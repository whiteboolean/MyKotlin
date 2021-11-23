package com.example.mykotlin.step_6

//自定义的中缀表达式 + 扩展函数一起用

//1.条件一 对第一个参数 C1.GOGOG进行扩展
//2.条件二 需要在括号(c2:C2) 参数里面，传递一个参数

private infix fun<C1,C2>C1.gogogo(c2:C2){

    println("我们的中缀表达式，对一个参数的内容是:$this")
    println("我们的中缀表达式，对二个参数的内容是:$c2")

}


//TODO 119--Kotlin语言的infix关键字
//infix == 中缀表达式 可以简化我的代码

fun main(args: Array<String>) {

    mapOf("133".to(0))

    mapOf("123" to 1)


    123 gogogo '男'

    "123".gogogo("M")

}