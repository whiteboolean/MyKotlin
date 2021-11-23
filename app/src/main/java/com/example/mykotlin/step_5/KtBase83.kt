package com.example.mykotlin.step_5

//Kt所有的类，默认是final修饰的，不能被继承，和Java相反
//open：移除final修饰

open class HumanBeing(val name1:String)

open class Person(private val name: String):HumanBeing(name) {
    private fun showName() = "父类的姓名是 [$name]"

    //KT所有的函数，默认是final修饰的，不能被重写，和Java相反
    open fun myPrintln() = println(showName())
}


class Student(private val subName: String) : Person(subName) {
    private fun showName() = "子类名称是:$subName"

    override fun myPrintln() {
      println(showName())
    }
}

fun main(args: Array<String>) {
    // 1.父类 val name  = showName() ->String myPrintln -> Unit
    // 2.子类 myPrintln -> Unit
    val person: Person = Student("张三")
    person.myPrintln()
}