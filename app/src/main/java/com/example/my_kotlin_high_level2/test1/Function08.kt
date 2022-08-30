package com.example.my_kotlin_high_level2.test1



class AndroidCLickListener<T>{

    private val actions = arrayListOf<(T ?)->Unit>()
    private val values = arrayListOf<T ?>()

    fun addListener(value:T?,action:(T?)->Unit){
        if (!actions.contains(action)){
            actions+=action //add添加用户自定义事件
            values+=value
        }
    }


    fun touchListeners(){
        if (actions.isEmpty()){
            println("你还没有添加任何事件")
            return
        }
        actions.forEachIndexed { index, function ->
            function.invoke(values[index])//执行所有的元素 lambda规则 == 用户自定义事件体
        }
    }
}

fun main() {
    val func = AndroidCLickListener<String>()
//    func.touchListeners() //


    func.addListener("你好1") {

    }

    func.addListener("你好2") {

    }
    func.addListener("你好3") {

    }
    func.addListener("你好4") {

    }

    func.touchListeners()


    func.touchListeners()

    println()

    // 我想传递 事件
    func.addListener("Derry4", ::show1)

    var result : (Any ?) -> Unit = ::show1

    // 异步在lambda想要实现泛型，基本上做不到，用Any代替
    val method01 : (Any) -> Unit = {}

    // lambda无法玩泛型

    func.touchListeners()

    val v1 = ::a
}

fun <T> show1( value : T ?) {
    println("show1 事件函数 事件被触发了 执行了 值是:$value")
}

fun a() {}