package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi

//TODO 63.Kotlin语言的可变Set集合
fun main() {

    val set:MutableSet<String> = mutableSetOf("Jake","Tony","lisi")
    set+="李俊"
    set+="刘德利"
    set+="李连杰"
    set.add("刘军")
    set.remove("李四")
    println(set)



}