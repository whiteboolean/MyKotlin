package com.example.mykotlin.kotlin_test

fun main(args: Array<String>) {
    //TODO val 可读2 不可改
    val name: String = "Derry"
    //不可改
    //name  ="jett"
    //可读
    print("name:$name")

    //TODO Var 可读可改
    //可改
    var sex:Char =  'M'
    //可改
    sex = 'F'

    //可读
    print("sex:$sex")

    //TODO val与var使用场景
    /**
     * 首选val 如果要使用的变量后面有变更，则选择var
     */

}