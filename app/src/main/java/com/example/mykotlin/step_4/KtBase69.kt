package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.File

//TODO 69.Kotlin语言的可变map集合学习
/**
 *
 * 1.可变集合的操作 +=[] put
 * 2.getOrPut 没有的情况
 * 3.getOrPut 有的情况
 */
fun main() {

    // 1.可变集合的操作 += [] put
    val map: MutableMap<String, Int> =
        mutableMapOf(
            Pair("Derry", 123),
            "Kevin" to 456,
            Pair("Dee", 789)
        )

    map += "AAA" to 124
    map += "BBB" to 1234
    map -= "AAA"
    map["CCC"] = 999
    map.put("DDD", 999)//put和[]等价的

    //2.getOrPut 没有有的情况
    //如果整个map集合里面没有FFF的key元素，我就帮你先添加到map集合里面去，再从map集合里面获取
    val r: Int = map.getOrPut("FFF") { 444 }
    println(map["FFF"]) //👆🏻已经帮你加进去了，所以你可以获取

    //3.getOrPut 有点情况
    val r2 = map.getOrPut("Derry") { 444 } //发现Derry是有值得，那么就直接获取出来，相当于444的值就失效了
    println(r2)

}