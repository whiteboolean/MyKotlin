package com.example.mykotlin.step_1

//TODO 15.Kotlin语言的String模板
fun main(args: Array<String>) {
  val garden =  "黄石公园"
    val time = 5

    println("今天天气很晴朗,去${garden}玩，😰${time}小时")

    //KT的if是表达式，更灵活，Java的if是语句，还有局限性
    val isLogin = true
    println("server response result:${if (isLogin) "恭喜你登录成功" else "对不起，" +
            "登录失败了，请检查Request信息"}")

}

