package com.example.mykotlin.step_5

interface  RunnableKT{
    fun run()
}

open class KtBase88{
    open fun add(info:String) = println("KtBase88 add:$info")

    open fun del(info:String) = println("KtBase88 del:$info")
}

//TODO.88.Kotlin语言的对象表达式的学习
//1.add del println
//2.匿名对象表达式
//3.具名实现方式
//4.对Java的接口，用对象表达式方式
fun main(){
    //匿名对象 表达式方式
    val p:KtBase88 = object :KtBase88(){
        override fun add(info: String) {
            println("我是匿名对象 add:$info")
        }

        override fun del(info: String) {
            println("我是匿名对象 del:$info")
        }
    }


    p.add("Jake")
    p.del("Faker")


    //具名实现方式
    val p2 = KtBase88Impl()
    p2.add("Jake")
    p2.del("Faker")

    //对jAVA的接口用Kt[对象表达式方式] 方式一

    val p3 = object:Runnable{
        override fun run() {
            println("Runnabl run ...")
        }
    }
    p3.run()

    //对Java的接口
    val p4 = Runnable{

    }

    //对kt的接口
    val p5 = object:RunnableKT{
        override fun run() {
            println("fdas")
        }
    }.run()


}


//具名实现 具体名字 == KtBase88Impl
class KtBase88Impl :KtBase88(){
    override fun add(info: String) {
        println("我是具名对象 add:$info")
    }

    override fun del(info: String) {
        println("我是具名对象 del:$info")
    }
}