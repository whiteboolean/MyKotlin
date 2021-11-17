package com.example.mykotlin.third_step

import java.lang.Exception
import java.lang.IllegalArgumentException

//TODO 45.Kotlin语言的replace完成加密解密操作
fun main() {
    val sourcePwd = "ABCDSDFSADFDASFDSAFDSAFDSA"
    println("原始密码是：$sourcePwd")

    //加密操作：把字符替换成数字 ，打乱了，就属于加密了
    val r1 = sourcePwd.replace(Regex("[AKMBO]")) {
        it.value //完全没做任何事情

        when (it.value) { //这里的每一个字符 A B C D
            "A" -> "9"
            "K" -> "3"
            "M" -> "5"
            "B" -> "6"
            "O" -> "7"
            else -> it.value
        }
    }

    println("加密后的密码是：$r1")

    //解密操作
    val sourcePwdNew = r1.replace(Regex("[93567]")) {
        when (it.value) { //这里的每一个字符 A B C D
            "9" -> "A"
            "3" -> "K"
            "5" -> "M"
            "6" -> "B"
            "7" -> "O"
            else -> it.value
        }
    }
    println("解密后的密码是:$sourcePwdNew")
}
