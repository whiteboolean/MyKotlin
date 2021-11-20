package com.example.mykotlin.step_4

//TODO 77.Kotlin语言的构造初始化顺序学习

//第一步生成 ： val sex：Char
class KtBase77(_name:String ,val sex:Char) { // 主构造


    //第二步 生成 val name //由于你是写在init代码块前面，所以先生成你 ，其实类成员和init代码块是同时生成
    val name = _name

    init {
        val nameValue = _name //第三步 ：生成nameValue细节
        println("init代码块打印：nameValue：$nameValue")
    }


    //第四步 次构造 三个参数的必须调用主构造
    constructor(name:String ,sex:Char ,age:Int) :this(name,sex){
        //第五步 生成次构造的细节
        println("次构造，三个参数的,name:$name,sex:$sex,age:$age")
    }

    val derry = "AAA"

    //init代码块和类成员同时按初始化顺序生成

}

fun main(args: Array<String>) {
    KtBase77("Jake",'男',90)
}