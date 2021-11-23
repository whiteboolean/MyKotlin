package com.example.mykotlin.step_6

import com.example.mykotlin.p

//1.类 isMap map takeIf map是什么类型
class KtBase105<T>(val isMap: Boolean = false,  val inputType:T) {

    inline fun <R> map(mapAction:(T)->R) = mapAction(inputType).takeIf { isMap }
}

inline fun <I,O> map( isMap: Boolean, inputType:I,mapAction: (I)->O ) =
    if (isMap) mapAction(inputType) else null

fun main(args: Array<String>) {

    val ktBase105 = KtBase105(true, inputType = 23)
    val r = ktBase105.map {
        it.toString()
    }
    p("r:$r")


    val map1 = map(true,123){
        it.toString()
    }

    123.run{

    }

}


