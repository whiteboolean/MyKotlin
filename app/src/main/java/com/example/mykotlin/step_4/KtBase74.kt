package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.File

//TODO 74.Kotlin语言的主构造函数学习
/**
 * 主构造函数：规范来说，都是增加_xxx的方式，临时的输入类型，不能直接用，需要接收下来，成为变量才能用
 * _name 等等，都是临时的类型
 *
 */
//class KtBase73(_name:String ,_sex:Char ,_age:Int,_info:String) {//主构造
//
//    var name = _name
//    get() = field //get不允许私有化
//    private set(value){
//        field = value
//    }
//
//    val sex = _sex
//    get() = field
//
//    val age :Int = _age
//    get() = field+1
//
//    val info = _info
//    get() = "【${field}]"
//
//
//    fun show(){
//        println(name)
//        println(sex)
//        println(age)
//        println(info)
//    }
//
//}

class KtBase74(name:String){ // 主构造

    //2个参数的次构造，必须要调用主构造函数，否则不通过，为什么次构造必须调用主构造，
    //because：主构造统一管理，为了更好的初始化设计
    constructor(name:String,sex:Char) :this(name){
        println("2个参数的次构造函数 name:$name,sex:$sex")
    }

    constructor(name:String,sex:Char,age:Int) :this(name){
        println("3个参数的次构造函数 name:$name,sex:$sex,age:$age")
    }

    constructor(name:String,sex:Char,age:Int,info:String):this(name){
        println("4个参数的次构造函数 name:$name,sex:$sex,age:$age ,info:$info")
    }


}

fun main(args: Array<String>) {

    val p = KtBase74("Jake")
    KtBase74("战三",'男')
    KtBase74("战三",'男')
//    KtBase74("战三",'男')
//    KtBase74("战三",'男')
}