package com.example.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.thread
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


//自定义委托 ： 提供者委托，可以更加直接的写法
operator fun TextView.provideDelegate(any: Any?, property: KProperty<*>) = object :
    ReadWriteProperty<Any?, String?> {
    override fun getValue(thisRef: Any?, property: KProperty<*>): String? {
        Log.e(this.javaClass.canonicalName, "getValue:$text")
        return text as String?
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String?) {
        Log.e(this.javaClass.canonicalName, "setValue:$text")
        text = value
    }

}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        logE("1111")
//        lifecycleScope.launch {
//            logE("2222")
//            val async1 = async { getFirst() }
//            logE("3333")
//            val async2 = async { getSecond() }
//            awaitAll(async1, async2).apply {
//                logE("${get(0)} ${get(1)}")
//            }
//            logE("4444")
//        }
//        logE("5555")

        val tv: TextView = findViewById(R.id.tvHelloWorld)

        var stringA: String? by tv
//        stringA = "修改了"
//        Log.e(this.localClassName,"stringA:$stringA tv.text:${tv.text}")

//        tv.text = "你好"
        Log.e(this.localClassName, "stringA:$stringA")


    }


    private suspend fun getFirst(): Int = withContext(Dispatchers.Default) {
        logE.invoke("getFirstStart")
        getFirst2()
        logE.invoke("getFirstEnd")
        return@withContext 1
//        thread {
//            logE.invoke("getFirstStart")
//            Thread.sleep(2000)
//            logE.invoke("getFirstEnd")
//        }
    }

    private fun getFirst2() {
        lifecycleScope.launch {
            Thread.sleep(2000)
        }

    }

    private suspend fun getSecond(): Int = withContext(Dispatchers.Default) {
        logE.invoke("getSecondStart")
        getSecond2()
        logE.invoke("getSecondEnd")
        return@withContext 2
    }

    private fun getSecond2() {
        lifecycleScope.launch {
            Thread.sleep(2000)
        }

    }
//        thread {
//            logE.invoke("getSecondStart")
//            Thread.sleep(3000)
//            logE.invoke("getSecondEnd")
//        }


    val logE: (String) -> Unit = {
        Log.e(
            "MainActivity",
            "it:$it threadName:${Thread.currentThread().name} time:${
                SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(
                    Date(System.currentTimeMillis())
                )
            }"
        )
    }
}