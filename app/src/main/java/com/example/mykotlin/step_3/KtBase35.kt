package com.example.mykotlin.step_3

//TODO 35.在kotlin中语言的可空性特点
fun main() {

    //TODO 第一种情况，默认是不可以空类型，不能随意给null
    var name: String = "JAKE"

    //提示 ： 不能为非空类型
//    name = null


    //TODO 第二种情况，声明可空类型

    var name2 :String?
    name2 = null

}