package com.example.mykotlin.step_6

import com.example.mykotlin.p

class KtBase107<T>(vararg objects: T, var isMap: Boolean) {

    //1.objectArray:Array<T>
    //out 修饰的泛型，只能读取，不能修改
    private val objectsArray: Array<out T> = objects

    //2.showObj(index) "你${index}下标的对象是null"
    fun showObj(index: Int): T? = objectsArray[index].takeIf { isMap }

    //3.mapObj(index,变换lambda) objectArray[index]
    fun <O> mapObj(index: Int, mapAction: (T?) -> O) =
        mapAction(objectsArray[index].takeIf {
            isMap
        })
}

//TODO 107-Kotlin语言的vararg关键字(动态参数)
//1.objectArray:Array<T>
//2.showObj(index)
//3.mapObj(index,变换lambda)
//4.p.showObj p.mapObj(int ->str)
//5.p的类型 it的类型

fun main(args: Array<String>) {
    // *Java ?
    // P的类型 ?
    val p : KtBase107<Any?>  = KtBase107("Derry", false, 53454, 4543.3f, 4554.54, null, 'C', isMap = true)
    p(p.showObj(0))

    //mapObj
    //it的类型 实际上 真正的类型 {Comparable<*> & java.io.Serializable} 需要转换一下才行 例如：it.toString
    val r:Int = p.mapObj(0){
        it
        it.toString()
        it.toString().length
    }

    // it的类型  实际上 真正的类型 {Comparable<*> & java.io.Serializable}  由于我们的第三个元素是 Int类型，所以不需要转换，自动转的
    val r2 : String = p.mapObj(2) {
        "我的第三个元素是:$it"
    }
    println(r2)

    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    val p2 : KtBase107<String> = KtBase107("AAA", "BBB", "CCC", isMap = true)
    val r3 = p2.mapObj(2) {
        it
        // it 是什么类型 ？  String ?
        "我要把你变成String类型 it:$it"
    }
    println(r3)

}


