package com.example.mykotlin.step_4

// by lazy和lateinit的区别
//todo
//1. by lazy用来定义val类型， 定义的时候已经初始化完成，但是是懒加载模式
//2. lateinit var 是用来定义var类型，后面手动初始化

class KtBase79 {

    lateinit var databaseData1:String
    // 下面是 不使用惰性初始化 by lazy 普通方式(饿汉式 没有任何懒加载的特点)
    // val databaseData1  = readSQlServerDatabaseAction()

    //>>>>> 使用惰性初始化 by  lazy
    val  databaseData2 by lazy {
        readSQlServerDataBaseAction()
    }


    private fun readSQlServerDataBaseAction():String{
        println("开始读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("结束读取数据库数据中....")
        return "database data load success ok."
    }
}


fun main(args: Array<String>) {
    val p = KtBase78()
//    p.loadRequest()

    p.showResponseResult()
}
