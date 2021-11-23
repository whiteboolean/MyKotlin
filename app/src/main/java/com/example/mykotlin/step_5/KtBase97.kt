package com.example.mykotlin.step_5

import com.example.mykotlin.p
import kotlin.math.E

enum class Exam() {
    Fraction1,
    Fraction2,
    Fraction3,
    Fraction4;
}

class Teacher(private var exam: Exam) {

    fun show() = when (exam) {
        Exam.Fraction1 -> "零分"
        Exam.Fraction2 -> "及格"
        Exam.Fraction3 -> "良好"
        Exam.Fraction4 -> "优秀"
    }


}


// TODO 97-Kotlin语言的代数数据类型
// 1.定义枚举Exam类，四个级别分数情况
// 2.定义Teacher老师类，when使用枚举类
// 3.需求 得到优秀的孩子姓名
fun main() {
    println(Teacher(Exam.Fraction1).show())
    println(Teacher(Exam.Fraction3).show())
}