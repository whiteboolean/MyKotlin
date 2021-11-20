package com.example.mykotlin.step_4

//TODO 57.在kotlin语言中的可变List集合学习
// 可变的集合
// 可变的集合 to 不可变的集合
// 不可变的集合 to 可变的集合
fun main() {
    //可变的集合
    val list = mutableListOf<String>("Jake","Wright","Hawk")
    list.add("Ray")
    list.remove("Jake")
    println(list)


    //不可变集合 to 可变集合
    val  list2 = listOf(134,32,32)
//    list2.add
    //list2.remove

    val list3:MutableList<Int> = list2.toMutableList()
    list3.add(111)
    list3.remove(124)
    println(123)


    //可变集合to不可变集合

    val  list4 :MutableList<String> = mutableListOf("123")
    list4.add("fda")
    list4.remove("322")


    var list5 :List<String> = listOf()
    list5 = list4.toList()

//    list5无法操作
}