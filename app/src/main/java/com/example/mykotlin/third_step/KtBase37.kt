package com.example.mykotlin.third_step

//TODO 37.在kotlin中语言let的安全调用
fun main() {
    var name: String? = null
    name = "Jake"

    var r = name?.let {
        if (it.isBlank()) {
            //如果name是空值 没有内容
            "default"
        } else {
            "[$it]"
        }
    }
    println(r)
}