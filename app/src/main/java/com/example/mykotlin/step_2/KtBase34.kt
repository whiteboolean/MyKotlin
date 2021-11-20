package com.example.mykotlin.step_2


// TODO 34.Kotlin语言的匿名函数与具名函数
fun main() {

    //匿名函数 lambda 实现体
    showPersonInfo("lisi", 99, '男', "学习") {
        print("显示结果it:$it")
    }

    //具名函数
    showPersonInfo("wangwu", 90, '女', "学习C————", ::showResultImpl)
}

fun showResultImpl(result: String) {
    println("显示结果：$result")
}

inline fun showPersonInfo(
    name: String,
    age: Int,
    sex: Char,
    study: String,
    showResult: (String) -> Unit
) {
    val str = "name:$name ,age:$age ,sex:$age ,study:$study"
    showResult(str)
}



