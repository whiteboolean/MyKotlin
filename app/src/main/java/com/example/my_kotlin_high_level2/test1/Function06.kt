package com.example.my_kotlin_high_level2.test1

fun main() {
    //历史演化过程
    show("张三", lambda = {
        println("输出:$it")
    })

    show("李四",{
        println("输出:$it")
    })

    show("王五") {
        println("输出:$it")
    }

    show {

    }


    show2({

    },{

    })

}

fun show(name:String = "",lambda:(String)->Unit)  = lambda(name)

fun show2(lambda1:(Int)->Unit ,lambda2:(Int)->Unit){
    lambda1(100)
    lambda2(200)
}