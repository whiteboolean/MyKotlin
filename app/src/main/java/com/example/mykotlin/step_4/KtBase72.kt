package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.File

//TODO 72.Kotlin语言的主构造函数学习
/**
 * 主构造函数：规范来说，都是增加_xxx的方式，临时的输入类型，不能直接用，需要接收下来，成为变量才能用
 * _name 等等，都是临时的类型
 *
 */
class KtBase72(_name:String ,_sex:Char ,_age:Int,_info:String) {//主构造

    var name = _name
    get() = field //get不允许私有化
    private set(value){
        field = value
    }

    val sex = _sex
    get() = field

    val age :Int = _age
    get() = field+1

    val info = _info
    get() = "【${field}]"


    fun show(){
        println(name)
        println(sex)
        println(age)
        println(info)
    }

}

fun main(args: Array<String>) {
    //背后隐式代码：
    //KtBase72()
    val p  = KtBase72(_name = "zhangsan" ,_info = "学习KT语言" ,_age = 88,_sex='M')

    p.show()
}