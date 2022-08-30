package com.example.my_kotlin_high_level2.test1

fun main() {

    val myRunOK: Boolean = "你好".myRunOk {
        this == "你好"
    }
    println(myRunOK)

    val myRunIt = "你好".myRunIt {
        it.toString() == "你好"
    }

    val myRunOkItThis = "你好".myRunOkItThis {
        println(this)
        println(it.toString())
        true
    }
}


//持有it
fun <T> T.myRunIt(mm:(Int)->Boolean ) = mm(1)

//持有this
fun <T> T.myRunOk(mm: T.() -> Boolean) = mm()

//持有this和it
fun <T> T.myRunOkItThis(mm: T.(Double)->Boolean) = mm(12.3)




