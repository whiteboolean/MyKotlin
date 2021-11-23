package com.example.mykotlin.step_6

import com.example.mykotlin.p


open class MyAnyClass(name: String) //祖宗类

open class PersonClass(name: String) : MyAnyClass(name = name) //父类

class StudentClass(name: String) : PersonClass(name = name)

class TeacherClass(name: String) : PersonClass(name = name)

class DogClass(name: String) //其他类，另类

class CatClass(name: String) //其他类另类

//TODO 106-Kotlin语言的泛型类型约束学习
//T :PersonClass 相当于 Java的 T extends PersonClass
// PersonClass本身 与 PersonClass的所有子类都可以使用，其他的类，都不能兼容此泛型

class KtBase106<T : PersonClass>(private val inputTypeValue: T, private val isR: Boolean = true) {
    fun getObj() = inputTypeValue.takeIf { isR }
}

fun main(args: Array<String>) {
    val any = MyAnyClass("Jake")
    val per = PersonClass("Jake")
    val stu = StudentClass("Jake")
    val pea = TeacherClass("Jake")

//    val  r1 = KtBase106(any).getObj()
}


