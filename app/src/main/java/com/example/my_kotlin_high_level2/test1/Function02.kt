package com.example.my_kotlin_high_level2.test1

fun main() {

    val fun4 = fun(n1:Int,n2:Int): (Int,Int) ->String = { n11,n22 ->
        "相加的结果为${n11+n22} $n1"
    }

    println(fun4(100,100)(1000,1000))

    val k01:(String)->(String)->(Boolean) ->Boolean = {
        {
            {
                true
            }
        }
    }
}