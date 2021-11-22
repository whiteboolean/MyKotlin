package com.example.official_documents

/**
 * 使用值检查并自动转换
 */

fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    //使用while循环
    val items2 = listOf<String>("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    println(describe("1"))
    println(describe("Hello"))
    println(describe(33243243232432432))
    println(describe("1"))
    println(describe(1))
    println(describe(3.223))

}

//使用when表达式
fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

