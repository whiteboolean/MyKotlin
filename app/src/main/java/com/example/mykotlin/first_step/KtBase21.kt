package com.example.mykotlin.first_step

import android.util.Log

//TODO 21.kotlin语言中反引号中函数的特点
fun main(args: Array<String>) {
    登录功能_2021年11月16日_中午_测试登录功能("derry", "你好")
}

private fun `登录功能_2021年11月16日_中午_测试登录功能`(name: String, pwd: String) {

}

private fun `为啥这里可以_这里不可以`(name: String) {
    println("为啥这里可以")
}

private fun 你好() {
    KtBase21.`in`()
    KtBase21.`is`()
}





