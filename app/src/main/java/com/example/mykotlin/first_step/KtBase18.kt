package com.example.mykotlin.first_step

//TODO 18:Kotlin语言的具名函数参数
fun main(args: Array<String>) {

    loginAction(userName = "你好",userPassword = "双十一")
}

private fun loginAction(userName:String,userPassword:String){
    println("用户姓名是谁？userName：$userName,密码是：$userPassword")
}






