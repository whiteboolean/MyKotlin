package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.File

//TODO 75.Kotlin语言的构造函数中默认参数学习
/**
 * 主构造函数：规范来说，都是增加_xxx的方式，临时的输入类型，不能直接用，需要接收下来，成为变量才能用
 * _name 等等，都是临时的类型
 */


class abcd{

    constructor()  {

    }
}

class KtBase75(name:String = "Jake"){ // 主构造


    //2个参数的次构造，必须要调用主构造函数，否则不通过，为什么次构造必须调用主构造，
    //because：主构造统一管理，为了更好的初始化设计
    constructor(name:String ="李四",sex:Char = 'M') :this(name){
        println("2个参数的次构造函数 name:$name,sex:$sex")
    }


    constructor(name:String ="Jake",sex:Char ,age:Int) :this(name){
        println("3个参数的次构造函数 name:$name,sex:$sex,age:$age")
    }

    constructor(name:String,sex:Char,age:Int,info:String):this(name){
        println("4个参数的次构造函数 name:$name,sex:$sex,age:$age ,info:$info")
    }


}

fun main(args: Array<String>) {

}