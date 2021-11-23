package com.example.mykotlin.step_5

//在KT中，所有的类，都隐式继承了：Any() ,你不写，默认就有
//Any类在KT设计中：只提供标准，你看不到实现，实现在各个平台处理就好了


class Obj1:Any()
//TODO .86.Kotlin语言中的Any超类学习
//Any == java Object类
fun main() {
    println(Obj1().toString())
}