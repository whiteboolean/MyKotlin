package com.example.mykotlin.step_6

import com.example.mykotlin.p


//1.万能对象返回器 Boolean来控制是否返回运用takeIf
class KtBase104<T>(private val isR: Boolean, private val obj: T) {
    fun getObj(): T? = obj.takeIf { isR }
}


//TODO 104 - kotlin语言的泛型函数学习
// 1.万能对象返回器 Boolean来控制是否返回 运用 takeIf
// 2.四个对象打印
// 3.对象打印 + run + ?:
// 4.对象打印 + apply + ?:
// 5.show(t:T) + apply + ?:

fun main() {
    val stu = Student("张三", 89, '男')
    val stu2 = Student("李四", 99, '女')


    val teacher1 = Teacher("Ray", 18, '男')
    val teacher2 = Teacher("Ray", 19, '女')

    //2.四个对象打印
    p(KtBase104(true, stu).getObj())
    p(KtBase104(true, stu2).getObj())

    p(KtBase104(true, teacher1).getObj())
    p(KtBase104(true, teacher2).getObj())

    println(KtBase104(false, teacher2).getObj() ?: "返回的是null")

    p()

    //3.打印对象用 run
    val r: Any = KtBase104(true, stu).getObj()?.run {
        p("万能对象是:$this")
        545.3f
    } ?: p("返回的是")

    p()

    //apply的特点：传入this , 返回this
    val r2:Student = KtBase104(true,stu2).getObj().apply {
        p(r)
    }!!
    p("r2:$r2")


    val r3:Student = KtBase104(true,stu2).getObj().apply {
        if (this==null){
            p("你返回的是null")
        } else{
            p("万能对象是:$this")
        }
    }!!


}


fun <B> show(item:B){
    item?.also {
        println("万能对象是:$it")
    } ?: p("大哥，妮万能对象返回器，返回的是null")
}

fun <B> show2(item:B){

    var r : B? = item ?.also {
        if (it == null) {
            println("大哥，你万能对象返回器，是返回null啊")
        } else {
            println("万能对象是:$it")
        }
    } ?: null
    println("show2: 你传递进来的r:$r")
}