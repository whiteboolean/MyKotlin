package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.File

//TODO 65.Kotlin中的数组类型
/**
 * Kotlin语言中的各种数组类型， 虽然是引用类型，背后可以编译成java基本类型
 *
 * IntArray intArrayOf
 * DoubleArray doubleArrayOf
 * ...
 *
 *
 * 1.intArrayOf常规操作的越界崩溃
 * 2.elementAtOrElse elementArOrNull
 * 3.List集合转数组
 * 4.arrayOf Array<File>
 */
fun main() {
    //1.intArrayOf 常规操作的越界崩溃
    val intArray = intArrayOf(1, 2, 3, 4, 5, 6)
    println(intArray[1])
    println(8)

    //2.elementAtOrElse elementAtOrNull
    println(intArray.elementAtOrElse(200) { 1 })
    println(intArray.elementAtOrNull(199) ?: 12)

    //3.List集合转数组
    val charArray = listOf('A', 'B', 'C').toCharArray()
    println(charArray)

    //4.arrayOf Array<File>
    val obj = arrayOf(File("aaa"), File("BBB"))


}