package com.example.official_documents

fun main(args: Array<String>) {
    val b = BaseImpl("base")
    Derived(b).print()
}

interface Base{
    fun print()
}

class BaseImpl(val x:String) :Base{
    override fun print() {
        print(x)
    }
}

//Derived的父类列表中的by字句 会将b存储Derived内部，并且编译器会生成所有b类型的方法
class Derived(b:Base) :Base by b


