package com.example.mykotlin.step_6

import com.example.mykotlin.p

//
class KtBase108<INPUT>(val isR: Boolean, vararg objects: INPUT) {

    //开启INPUT泛型的只读模式
    private val objectArray: Array<out INPUT> = objects

    //1.5中返回类型变化的解释
    fun getR1(): Array<out INPUT>? = objectArray.takeIf { isR }

    fun getR2(): Any = objectArray.takeIf { isR } ?:"你是null了"

    //有可能是 Array<out INPUT>
    fun getR3() : Any? = objectArray.takeIf { isR }?:"你是null"?:null

    fun getR4(index:Int) :INPUT ? = objectArray[index].takeIf { isR }?:null
}

//2.
fun <INPUT> inputObj(item:INPUT) {
    println((item as String).length)
}


//TODO 108-Kotlin语言的[]操作符学习
//1.5种返回类型变化的及解释
//1.给泛型传入null后，直接操作

