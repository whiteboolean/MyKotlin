package com.example.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logE("1111")
        GlobalScope.launch {
            logE("2222")
            val async1 = async { getFirst() }
            logE("3333")
            val async2 = async { getSecond() }
            awaitAll(async1, async2).apply {
                logE("${get(0)} ${get(1)}")
            }
            logE("4444")
        }
        logE("5555")
    }


    private suspend fun getFirst(): Int = withContext(Dispatchers.IO) {
        logE.invoke("getFirstStart")
        delay(2000)
        logE.invoke("getFirstEnd")
        return@withContext 1
//        thread {
//            logE.invoke("getFirstStart")
//            Thread.sleep(2000)
//            logE.invoke("getFirstEnd")
//        }
    }

    private suspend fun getSecond(): Int = withContext(Dispatchers.IO) {
        logE.invoke("getSecondStart")
        delay(3000)
        logE.invoke("getSecondEnd")
        return@withContext 2
    }
//        thread {
//            logE.invoke("getSecondStart")
//            Thread.sleep(3000)
//            logE.invoke("getSecondEnd")
//        }


    val logE: (String) -> Unit = {
        Log.e(
            "MainActivity",
            "$it time:${SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date(System.currentTimeMillis()))}"
        )
    }
}