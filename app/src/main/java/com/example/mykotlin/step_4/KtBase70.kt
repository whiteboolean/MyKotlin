package com.example.mykotlin.step_4

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.File

//TODO 70.Kotlin语言的定义类与field关键字学习

class KtBase70 {
    var name = "Jake"
        get() = field
        set(value) {
            field = value
        }

    /**
     * 背后做的事情
     *
     *增加get set方法
     */

    var value = "ABCDF"
        get() = field
        set(value) {
            field = value
        }

    var info = "fdsafa"
        get() = field.capitalize()
        set(value) {
            field = "**[$value]**"
        }
}

fun main() {
    KtBase70().name = "Kevin"

}