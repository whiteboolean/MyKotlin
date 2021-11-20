package com.example.mykotlin.step_4

//TODO 80.Kotlin语言的初始化陷阱 --学习
class KtBase80 {

    var number = 9
    init{
        number = number.times(9)
    }


}

fun main() {
    //Kotlin是按照顺序执行的
    println(KtBase80().number)
}
