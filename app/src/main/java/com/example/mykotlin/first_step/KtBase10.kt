package com.example.mykotlin.first_step

//TODO 10.kotlin语言的编译时常量
//编译时常量只能是常用的基本类型：String Double Int Float Short Byte Char Boolean
//编译时常量只能是在函数之外定义，为什么？答：如果在函数之内定义，就必须在运行时才能调用函数赋值，
//何来编译时常量一说
//结论：编译时常量只能在函数之外定义，就可以在编译期间初始了。

const val PI = 4.5
fun main(args: Array<String>) {
    val info = "jake info" //这个称为只读类型的变量
    //const val PI = 45
}