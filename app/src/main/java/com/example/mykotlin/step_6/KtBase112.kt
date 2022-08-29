package com.example.mykotlin.step_6

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View


/**
 * reified关键字是用于kotlin内联函数的，修饰内联函数的泛型，泛型被修饰后，在方法体里面，拿到泛型的Class对象，
 * 这与java是不同的，java需要泛型的class是需要把class传过来的，但是kotlin不用了
 */

data class Hello(
    val person: String
)

fun main(args: Array<String>) {

}

class MyView {

    var onClickListener: (() -> View.OnClickListener)? = null

}

class KtBase112 {


    var updateListener: (() -> Hello)? = null

    lateinit var listener: () -> String

    fun main(args: Array<String>) {
        updateListener = {
            Hello("你好")
        }


        updateListener = { methodListen() }

        listener = {
            "干哈呢"
        }.also {
            println(it)
        }
    }

    fun methodListen(): Hello {
        return Hello("123")
    }

    fun startActivity() {
//        val intent = Intent(MainActivity@this,javaClass<DetailActivity>)
//        intent.putExtra(DetailActivity.ID,item.id)
//        ittent.putExtra(DetailActivity.NAME,item.name)
//        startActivity(intent)
    }


//    public inline fun<reified T: Activity> Context.startActivity(vararg  params:Pair<String,String>){
//        val intent = Intent(this,T::class.java)
//        params.forEach {
//            intent.putExtra(it.first,it.second)
//            startActivity(intent)
//        }
//    }

}


//TODO 112-Kotlin语言的reified关键字学习

