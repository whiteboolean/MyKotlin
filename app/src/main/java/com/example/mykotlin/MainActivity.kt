package com.example.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logE("1111")
        GlobalScope.launch {
            logE("2222")
            getFirst()
            logE("3333")
            getSecond()
            logE("4444")
        }
        logE("5555")
    }



    private fun getFirst(){
        Thread.sleep(2000)
    }

    private fun getSecond(){
        Thread.sleep(3000)
    }
    
    val logE: (String)->Unit = {
        Log.e("MainActivity",it)
    }
}