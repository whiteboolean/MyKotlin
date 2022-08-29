package com.example.my_kotlin_high_level

/**
 * 玩转lambda表达式和高阶函数
 */
fun main() {
    //lambda难度慢慢升级
    //Unit == java的void
    //TODO 下面去哪不都是函数声明，既然是函数声明，就不能调用

    //函数的声明，用lambda去描述函的声明
    var method1: () -> Unit

    var method2: (Int, Int) -> Unit

    var method3: (String, Double) -> Any

    var method4: (Int, Double, Long, String) -> Boolean

    var method5: (Int, Int) -> Int

    // :(参数) ->返回 方式一 基本上属于声明todo函数
    // ={参数->方式} 方式二()基本上属于声明实现结合

    val method01 = { println("我是method01函数") }
    method01.invoke()
    method01()

    val method02 = { "我是method02函数" }
    val str02 = method02.invoke()
    val str02_ = method02()
    println("$str02\n$str02_")

    val method03 = { str: String -> println("你传递进来的是:$str") }
    method03("method03函数")

    val method04 = { number1: Int, number2: Int -> number1.toString() + number2.toString() }
    println(method04(1, 2))

    val method05 = { number1: Int, number2: Int -> number1 + number2 }
    print(method05(1, 2))

    val method06: (Int) -> String  //先声明
    method06 = fun(value: Int): String = value.toString()

    val method07: (Int) -> String//先声明
    method07 = fun(value): String = value.toString()

    //声明实现一气呵成
    val method08: (Int) -> String = { value -> "$value" }
    println(method08(12))

    var method09: (String, String) -> Unit = { aStr, bStr ->
        println("aStr:$aStr,bStr:$bStr")
    }
    method09("AAA", "BBB")

    var method10: (String) -> Unit = {
        println("$it")
    }

    var method11: (Int) -> Unit = {
        when (it) {
            1 -> println("你传递是一")
            in 2..90 -> println("你传递是20~60之间")
            else -> println("都不满足")
        }
    }

    (method11(223))


    var method12: (Int) -> String = {
        when (it) {
            1 -> "你传递的是1"
            in 2..90 -> "你传递的是100"
            else -> "都不满足"
        }
    }
    println(method12(124))


    val method13: (Int, Int) -> Unit = { _, number2 ->
        println("你传递的第二个参数是:$number2")
    }
    method13(100, 200)

    val method14 = { str: Any -> str }
    println(method14(true))
    println(method14(34.33f))


    val method15 = { sex: Char ->
        if (sex == '男') println("你传入的是男生") else if (sex == '女') println("你传入的是女生") else println("你传入的是非人类")
    }
    method15('恶')

    var method16: (Int) -> Unit
    method16 = { println("???? your value is :$it") } //覆盖
    method16(888)

    var method16s: (String?, String) -> Unit = { str, str2 ->
        println("str:$str,str2:$str2")
    }
    method16s("你好", "我是你爹")


    var method16ss = {str:String ,str2:String ->
        println("str:$str,str2:$str2")
    }
    method16ss("你好","我是你爷")

    //需求，传入什么就打印什么，并且输出
    val printMe  ={ str:Any ->
        str
    }
    printMe("达不溜")
    printMe("达不溜1")
    printMe(124)

}
