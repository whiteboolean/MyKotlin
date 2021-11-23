package com.example.mykotlin.step_5

open class  Person3(val name:String){
    private fun showName() = "父类显示:$name"

    open fun myPrintln() = println(showName())

    fun methodPerson() = println("我是父类的方法")
}

class Student3(val nameSub:String ) : Person3(nameSub){

    override fun myPrintln() {
        println("子类显示:$nameSub")
    }

    fun methodStudent() = println("我是子类的方法...") //子类独有的函数
}

fun main() {
    val p:Person3 = Student3("李四")

    (p as Student3).methodStudent()
    p.methodStudent()
}