package com.example.mykotlin.first_step

import android.util.Log

//TODO 19.Kotlin语言的unit函数特点
fun main(args: Array<String>) {

}
private const val TAG = "KtBase19"
// :Unit不写，默认也有，相当于Java的void关键字(void是无参数返回的忽略类型)，
//但是void是关键字，不是类型
// Unit是单例类 ，Unit是类，代表 无参数返回的忽略类型 == Unit类型类
private fun doWork(): Unit {
    println("doWork")
}

private fun doWork2(){
    println("doWork2")
}



