package com.example.official_documents

fun sum(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    println("sum of 19 and 23 is ${sum(19,20)}")
    printSum(1,2)
}

fun printSum(a:Int , b :Int ) {
    println("Sum of $a and $b is ${a+b}")

    var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is","was")},but now is $a"
    println(s2)

    //条件表达式
    fun maxOf(a:Int, b :Int ):Int {
        if (a>b){
            return a
        } else{
            return b
        }
    }

    fun maxOf2(a:Int , b:Int ) = if (a>b) a else b

    fun parseInt(str:String) :Int?{
        return str.toIntOrNull()
    }

}









