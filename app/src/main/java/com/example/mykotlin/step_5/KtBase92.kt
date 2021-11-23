package com.example.mykotlin.step_5

import com.example.mykotlin.p

data class KtBase92(var name:String ,var age:Int) {

    var coreInfo:String = ""
    init{
        println("主构造被调用了")
    }

    //次构造
    constructor(name: String):this(name,99){
        p("次构造被调用")
        coreInfo = "增加非常核心的内容信息"
    }

    override fun toString(): String {
        return "toString name:$name,age:$age,coreInfo:$coreInfo"
    }

}

//TODO 92.Kotlin语言的copy函数学习
fun main() {
    val p1 = KtBase92("Ray")
    p(p1)
    val newP2 = p1.copy(name = "Rookie", age = 78)
    p(newP2)
}