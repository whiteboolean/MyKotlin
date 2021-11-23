package com.example.mykotlin.step_6

class KtBase103<T> (private val obj:T){
    //万能输出器
    fun show() = println("万能输入器:$obj")
}

data class Student(val name: String , val age: Int, val sex: Char)
data class Teacher(val name: String , val age: Int, val sex: Char)


//TODO 103-Kotlin语言的定义泛型类
fun main() {
    val stu = Student("Ray",18,'男')
    val stu2 = Student("Rookie",89,'女')

    val teacher = Teacher("Johnson",100,'男')
    val teacher2 = Teacher("Adam",100,'男')

    KtBase103(stu).show()
    KtBase103(stu2).show()
    KtBase103(teacher).show()
    KtBase103(teacher2).show()

}