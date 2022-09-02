package com.example.my_kotlin_high_level3

import com.example.mykotlin.step_6.showPrintln

fun main() {

    listOf("AAA", "BBB", "CCC")
        .forEach {
            it.showPrintln()
        }


}

private inline fun <T> Iterable<T>.myForEach(lambda: (T) -> Unit) {
    for (item in this) lambda(item)
}

private inline fun <T> Iterable<T>.myForEach2(lambda: (T) -> Unit) =
    kotlin.run { for (item in this) lambda(item) }

private inline fun <T> Iterable<T>.myForEach3(lambda: T.() -> Unit) =
    r { for (item in this) lambda(item) }

private inline fun <R> r(lambda: () -> R) = lambda()

