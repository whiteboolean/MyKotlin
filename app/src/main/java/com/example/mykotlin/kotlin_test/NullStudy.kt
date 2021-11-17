package com.example.mykotlin.kotlin_test

class NullStudy {
    //Kotlin不会给变量赋默认值，但是java会，所以后面自己使用的
    //时候尽量要给变量赋一个默认值。
//    var info:String
}

fun main(args: Array<String>) {
    var name:String = ""

    var name1 :String ? = null

    //第一种 如果name1不为null才执行
    name?.length

    //第二种 不管name2是否为空都执行
    name1!!.length

    //第三种 和Java一样
    if (name1!=null) name.length

}