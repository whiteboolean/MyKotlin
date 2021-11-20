package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.File

//TODO 67.Kotlin语言的读取Map的值
/**
 *1.[]找不到会返回null
 *2.getOrDefault
 *3.getOrElse
 *4.与Java一样会崩溃
 */
fun main() {
    val mMap = mapOf("Derry" to 123, "kevin" to 34)

    //和上面是等价的
    val mMap2 = mapOf(Pair("123", 13), Pair("2323", 3))


    //方式1 读取map集合
    println(mMap["Derry"])
    println(mMap["Jake"])

    //方式2 读取Map集合
//    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
    println(mMap.getOrDefault("Derry", 12))

    //方式3 读取Map集合
    println(mMap.getOrElse("Kevin") { 12 })
//    }

    //方式4 读取Map集合
    println(mMap.getValue("Jake")) //空指针异常

    //TODO 建议map获取内容，尽量使用方式2 方式3
}