package com.example.my_practice

fun main(args: Array<String>) {
    "SFA".a("123")

    functionTest {
        "你好"
    }
}


fun functionTest(block: () -> String) {
    block()
}