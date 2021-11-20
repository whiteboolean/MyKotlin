package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.File

//TODO 68.Kotlin语言的遍历map
/**
 */
fun main() {

    val map = mapOf("String" to 13,"Jake" to 234)

    map.forEach {
        println("it:$it,it.value:${it.value}")
    }

    map.forEach { t, u ->
        println("t:$t,u:$u")
    }

    map.forEach{(k,v) ->
        println("k:$k,v:$v")
    }

    for(item in map){
        println("item:${item.key}, item.value:${item.value}")
    }

}