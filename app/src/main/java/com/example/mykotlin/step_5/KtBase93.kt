package com.example.mykotlin.step_5

import com.example.mykotlin.p

class KtBase93(var name: String, var age: Int, var sex: Char) {
    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = sex
}

data class Student2Data(var name:String,var age:Int,var sex:Char)

//TODO 93.Kotlin语言的解构声明学习
fun main() {
    val(name,age,sex) = KtBase93(name = "Ray",age = 13,sex = '男')
    p("普通类解构之后： name:$name,age:$age,sex:$sex")

    val (name1,age1,sex1) = Student2Data(name = "Ray",age = 13,sex = '男')
    p("数据类解构之后： name:$name,age:$age,sex:$sex")

    val(_,age2,_) =Student2Data(name = "Ray",age = 13,sex = '男')
    p("数据类解构后：age2:$age2")
}