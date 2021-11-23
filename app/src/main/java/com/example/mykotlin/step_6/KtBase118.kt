package com.example.mykotlin.step_6

//对String? == 可空类型，进行函数扩展，并且有备用值
fun String?.outPutStringValueFun(defaultValue:String) = println(this?:defaultValue)

fun String?.outPutStringValueFunGet(defaultValue:String) =
    if (this==null)defaultValue else this


fun main() {
    val infoValue:String? = null
    infoValue.outPutStringValueFun("我的默认值是1")


    val name = "Jake"

    name.outPutStringValueFun("我是默认值2")



}
