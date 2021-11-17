package com.example.mykotlin.first_step

//TODO 17.Kotlin函数参数的默认参数
fun main(args: Array<String>) {
    action02("姓名",15)
}

private fun action01(name: String, age: Int) {
    println("我的姓名是:$name,我的年龄是:$age")
}

private fun action02(name: String, age: Int = 19) {
    println("我的姓名是:$name,我的年龄是:$age")
}

