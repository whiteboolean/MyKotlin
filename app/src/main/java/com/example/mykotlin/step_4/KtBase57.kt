package com.example.mykotlin.step_4

//TODO 57.在kotlin语言中的List创建与元素获取
//普通获取方式 ： 索引
// 防止崩溃取值方式 ： getOrElse getOrNull
fun main() {
    val list = listOf("Jake","Rookie","Black","block")

    //普通取值方式
    println(list[0])
    println(list[1])
    println(list[2])
    println(list[3])

    println()

    //我们写KT代码，一定不会崩溃，空指针异常
    //防止崩溃取值，getOrElse getOrNull
    println(list.getOrElse(3){"越界了"})
    println(list.getOrElse(4){"越界了"})
    println(list.getOrElse(55){"越界了"})


    println()

    println(list.getOrNull(1))
    println(list.getOrNull(4))
    println(list.getOrNull(111))
    println(list.getOrNull(22)?:"你越界了奥")

    //getOrNull + 空合并操作符

    //小结：开发过程中，尽量使用getOrElse或 getOrNull才能体现KT的亮点

}