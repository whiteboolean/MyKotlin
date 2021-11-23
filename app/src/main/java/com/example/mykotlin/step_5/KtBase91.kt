package com.example.mykotlin.step_5

import com.example.mykotlin.p


//普通类
class ResponseResultBean1(var msg:String ,var code:Int , var data:String) :Any()

//数据类型 ---- 一般是用于JavaBean的形式下 ，用数据类
data class ResponseResultBean2(var msg:String, var code:Int, var data:String):Any()
//set get 构造函数 解构操作 copy toString hashCode equals 数据类型生成更丰富

//TODO 91.Kotlin语言的数据类型学习
//1.普通类与数据类的toString 背后原理
//2.前面学习过的 == 与 ===
//3.普通类的 == 背后原理
//4.数据类的 == 背后原理


fun main() {

    val list = listOf<String>("Jake","Jake2","Jake3","Ray")
    val(v1,v2,v3,v4) = list
    p(ResponseResultBean1("loginSuccess",200,"城路成功"))


}