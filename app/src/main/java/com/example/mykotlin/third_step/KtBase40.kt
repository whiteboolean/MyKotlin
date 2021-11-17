package com.example.mykotlin.third_step

//TODO 40.在kotlin空合并操作符
fun main() {
    var info: String? = "李小龙"
    info = null

    val rosetta = info?.let { "[$it]" }
    println(rosetta)
}