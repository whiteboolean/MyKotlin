package com.example.mykotlin.step_6

import com.example.mykotlin.p
import java.io.File


//TODO 124-Kotlin语言的变换函数 - flatMap

/**
 * map{ 返回类型 ：T String
 *
 */

//TODO flatMap 相当于 List<List<String>>集合的集合，有嵌套关系

//map：遍历每一个元素
//
//flatMap：遍历每一个元素，并铺平元素
//
//var list =listOf(listOf(10,20),listOf(30,40),listOf(50,60))
//
//var mapList = list.map{element->element.toString()}
//
//var flatMapList = list.flatMap{element->element.asIterable()}
//
//flatMap中的函数一定要返回一个Iterable，不然报错
//
//结果：
//
//[[10, 20], [30, 40], [50, 60]]
//
//[10, 20, 30, 40, 50, 60]

fun main(args: Array<String>) {
    val list : List<String> = listOf("李四", "王五", "赵六", "初七")

    val newList:List<String> = list.map {
        "你的姓名是:$it"
    }.map {
        "$it,你文字的长度是:${it.length}"
    }.flatMap {
        listOf("$it 在学习C++","$it 在学习Java","$it 在学习Kotlin \r\n") //每次返回一个集合


    }

//    println(newList)
//    println(newList.size)


    val list2 = listOf(1,2,3)
    val newList2 : List<String> = list2.flatMap {
        listOf("$it 在学习C++", "$it 在学习Java", "$it 在学习Kotlin")
    }
    println(newList2)
}