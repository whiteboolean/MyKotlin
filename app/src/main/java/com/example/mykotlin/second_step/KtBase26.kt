package com.example.mykotlin.second_step


// TODO 26.Kotlin语言的it关键字特点
fun main(args: Array<String>) {
    val methodAction: (Int, Int, Int) -> String = { a, b, c ->
        val number = 23456
        "$number Jake ,a :$a , b:$b , c:$c"
    }
//    methodAction.invoke(1,2,3)
    methodAction(1, 2, 3)


    val methodAction2: (Int) -> String = {
        it.toString()
    }

    println(methodAction2(21))

    val methodAction3: (Double) -> String = {
        "methodAction3: $it"
    }

    println(methodAction3(12.21))
}