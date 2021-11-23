package com.example.mykotlin.step_5

import com.example.mykotlin.p

//四肢信息class
data class LimbsInfo(var limbsInfo: String, var length: Int) {
    fun show() {
        p("${limbsInfo}的长度是:$length")
    }
}


enum class Limbs(private var limbsInfo:LimbsInfo){

    LEFT_HAND(LimbsInfo("左手", 88)), // 左手
    RIGHT_HAND(LimbsInfo("右手", 88)), // 右手

    LEFT_FOOT(LimbsInfo("左脚", 140)), // 左脚
    RIGHT_FOOT(LimbsInfo("右脚", 140)) // 右脚
    ;

    fun show() = "四肢是:${limbsInfo.limbsInfo}的长度是:${limbsInfo.length}"

    fun updateData(limbsInfo: LimbsInfo){
        println("更新前的数据是:${this.limbsInfo}")
        this.limbsInfo.limbsInfo = limbsInfo.limbsInfo
        this.limbsInfo.length = limbsInfo.length
        println("更新后的数据是:${this.limbsInfo}")
    }
}

//TODO 96-Kotlin语言的枚举类定义函数学习
fun main(args: Array<String>) {
    //显示枚举值
    //一半不会这样做
    // 一般的用法如下：
    println(Limbs.LEFT_HAND.show())
    println(Limbs.RIGHT_HAND.show())
    println(Limbs.LEFT_FOOT.show())
    println(Limbs.RIGHT_FOOT.show())

    println()

    // 更新枚举值
    Limbs.RIGHT_HAND.updateData(LimbsInfo("右手2", 99))
    Limbs.LEFT_HAND.updateData(LimbsInfo("左手2", 99))
    Limbs.LEFT_FOOT.updateData(LimbsInfo("左脚2", 199))
    Limbs.RIGHT_FOOT.updateData(LimbsInfo("右叫2", 199))
}