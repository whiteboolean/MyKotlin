package com.example.mykotlin.step_6

//TODO 116-Kotlin语言的标准函数与泛型扩展函数
fun main() {
    val r:Char = "Jake".mLet {
        it
        true
        "OK"
        "A"
        'a'
    }

    123.mLet {
        it
    }


    'C'.mLet {
        it
    }


    val r2:String = "Jake".let {
        it
        3232.32f
        "你好"
    }
}


//private 私有化
//inline 我们的函数是高阶函数 所以用到内联，做lambda的优化 性能提高
//fun<I,O>在函数中，申明两个泛型，函数泛型 I输入Input O输出Input


private inline fun <I, O> I.mLet(lambda: (I) -> O): O = lambda(this)