package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.File

//TODO 76.Kotlin语言的初始化块学习
/**
 *
 */

class KtBase76(name: String, userAge: Int, userSex: Char) { // 主构造

    /**
     * 这个不是java的 static{}
     * 这个相当于java的{} 构造代码块
     * 初始化代码块init
     */
    init {
        println("主构造函数被调用了 $name,$userAge,$userSex")

        //如果第一个参数为false，就会调用第二个参数
        require(name.isNotBlank()) { "你的userName空空如也，抛出异常" }


        require(userAge > 0) { "你的年龄不符合" }
    }


    constructor(name:String) :this(name,13,'男') {
        println("次构造被调用了")
    }

    fun show(){

    }

}

//TODO
// 1.name，age，sex的主构造函数
// 2.init代码块学习 require
// 3.临时类型只有在init代码块才能调用
fun main(args: Array<String>) {
    KtBase76("李四",userAge = 99,userSex = '男')

    KtBase76("lsi")

    KtBase76("32",32,'男')
}