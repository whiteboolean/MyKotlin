package com.example.mykotlin.step_1

//TODO 20.Kotlin语言的nothing类型特点
fun main(args: Array<String>) {
    show(-1)
}

private fun show(number:Int){
    when(number){
        -1 -> TODO("没有这样的分数")
        in 0..59 -> println("不及格")
        in 60..70 -> println("及格")
        in 70..80 ->println("良")
        in 80..100 -> print("优秀")
    }
}

interface A{
    fun show()
}

class AImpl:A{
    override fun show() {
        //下面这句话不是注释提示，会终止程序的
        TODO("Not yet implemented")
    }
}



