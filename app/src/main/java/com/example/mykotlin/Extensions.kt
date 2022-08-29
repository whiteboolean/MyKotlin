package com.example.mykotlin

import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

fun p(message: Any? = "") {
    println(message)

    "a".apply {
        "[$this]"
    }

    "a".let {
        "[$it]"
    }

    "a".run {
        //传入的是this，返回的是最后一行
        "[$this]"
        123
    }

    "aa".let {  }

    val str = "aa"


    with("a") {

    }

    "a".also {
        "[$it]"
    }


}


//apply 传入的参数是this ，返回的参数也是this
private inline fun <T> T.apply(function: T.() -> T): T = function(this)


//let 传入的参数是it ，返回的参数为最后一行
private inline fun <T, R> T.let(function: (T) -> R): R = function(this)


//run 传入的是this ，返回的是最后一行
//with 传入的是this，返回的是最后一行
private inline fun <T, R> T.run(function: T.() -> R): R = function(this)


private inline fun <T, R> with(receiver: T, block: T.() -> R): R {
    return receiver.block()
}


//also 传入的是it，返回的是this
private inline fun <T> T.also(function: (T) -> T): T = function(this)