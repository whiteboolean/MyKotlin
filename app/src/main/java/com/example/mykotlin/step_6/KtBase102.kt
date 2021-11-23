package com.example.mykotlin.step_6

import com.example.mykotlin.p

abstract class BaseActivity{
    fun onCreate(){
        setContentView(getLayoutID())

        initView()
        initData()
        initXX()
    }

    private fun setContentView(layoutID:Int) = println("加载{$layoutID}布局xml中")

    abstract fun getLayoutID():Int
    abstract fun initData()
    abstract fun initView()
    abstract fun initXX()
}


class MainActivity : BaseActivity(){
    override fun getLayoutID(): Int {
        TODO("Not yet implemented")
    }

    override fun initData() {
        TODO("Not yet implemented")
    }

    override fun initView() {
        TODO("Not yet implemented")
    }

    override fun initXX() {
        TODO("Not yet implemented")
    }

    fun show(){
        super.onCreate()
    }
}