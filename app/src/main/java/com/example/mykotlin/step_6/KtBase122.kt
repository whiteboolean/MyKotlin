package com.example.mykotlin.step_6

import com.example.mykotlin.p as t
import com.example.mykotlin.step_6.randomItemValuePrintln as p
import com.example.mykotlin.step_6.randomItemValue as k


fun main() {


    val str = "str"
    val a = str.apply {
        this.length
    }
    t(a)

}


private inline fun<I> I.mApply(lambda:I.() ->I) :I = lambda(this)


