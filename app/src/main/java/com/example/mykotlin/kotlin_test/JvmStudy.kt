package com.example.mykotlin.kotlin_test

//Unit = Java void
fun main(args: Array<String>) {

}

class FunStudy {
    fun add() {

    }
}

fun add(): Unit {

}

fun add1(number1: Int, number2: Int): Int {
    return 0
}

//自动推断类型
fun add2(number1: Int, number2: Int): Int = number1 + number2

//自动推断类型
fun add3(number1: Int, number2: Int) = number2 + number1

//自动推断类型
fun add4(number1: Int, number2: Int) = number2 + number1.toDouble()

fun method01() = "Jake"

fun method03() = 99




