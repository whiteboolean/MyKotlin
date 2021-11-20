package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.File

//TODO 71.Kotlin语言的计算属性与防范竞态条件

class KtBase71 {
    var number: Int = 0
    //会自动生成getSet方法

    val number2: Int
        get() = (1..1000).shuffled().first()

    var info: String? = null
    //防范静态条件 ，当你调用成员，这个成员可能为null，可能为空值，就必须采用防范竞态条件，这个是Kt编程的规范化

    fun getShowInfo(): String {
        return info?.let {
            if (it.isBlank()) {
                "info你原来是空代码"
            } else {
                "最终的值是:$it"
            }
        } ?: "info是空"
    }

}

fun main(args: Array<String>) {
    //背后隐式代码：

}