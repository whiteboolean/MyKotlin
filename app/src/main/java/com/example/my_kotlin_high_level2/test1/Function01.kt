package com.example.my_kotlin_high_level2.test1

fun main() {

    val r: Int = show01(1, 2) { it1, it2 ->
        it1 + it2
    }
    println("r:$r")

    val r1 = show01(1,2,3){ n1,n2,n3->
        n1+n2+n3
    }
    println("r1三数相加的结果为:$r1")

}

fun show01(number: Int, number2: Int, lambda: (Int, Int) -> Int) = lambda.invoke(number, number2)


fun show01(number:Int,number2:Int,number3:Int,lambda:(Int,Int,Int)->Int)  = lambda(number,number2,number3)


val show01s:(Int,(Int)->String) ->String = {it1,it2->
    it2.invoke(it1)
}