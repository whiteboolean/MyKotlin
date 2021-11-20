package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.File

//TODO 66.Kotlin语言中的Map的创建
/**
 *
 */
fun main() {
    val mMap1: Map<String, Double> = mapOf("Jake" to (12.2), "Ray" to (12.34))
    val mMap2 = mapOf(Pair("Jake", 32.3), Pair("Ray", 32))

    //上面两种方式是等价的
}