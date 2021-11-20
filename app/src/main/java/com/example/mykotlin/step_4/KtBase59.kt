package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi

//TODO 59.在kotlin语言中的mutator函数学习
//1.mutator += -=操作
//2.removeIf
@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    //1.mutator += -=操作
    val list: MutableList<String> = mutableListOf("Jake", "Johnson", "Tony")
    list += "李四" //mutator的特性 += -= 其实背后就是运算符重载而已
    list += "王五"
    list += "Tony"
    println(list)

    //2.removeIf
    //list.removeIf{ true }
    list.removeIf {
        it.length == 4 //字符串长度为4的时候移除该元素
    }
    println(list)
}