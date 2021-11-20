package com.example.mykotlin.step_1

//TODO Kotlin的只读类型
fun main(args: Array<String>) {

    //默认提示：变量永远都不会被修改，建议修改成val == 不可改变的
    var info:String = "MyInfo"
    println(info)

    val age:Int =  99
//    age = 98
    print("age:$age")

    val info1 :String =  "jake is good"
    print(info1)


    val age2 = 199
    for (age22 in 0..1999){
        print(age22)
    }

}