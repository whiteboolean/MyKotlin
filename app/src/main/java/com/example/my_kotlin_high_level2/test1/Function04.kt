package com.example.my_kotlin_high_level2.test1

fun main() {
    loginEngine("admin","admin"){
        if (it){
            println("登录成功")
        }else{
            println("登录失败")
        }
    }
}


private fun loginEngine(userName:String,userPwd:String,responseResult:(Boolean)->Unit){
    if (userName=="admin" && userPwd == "admin"){
        responseResult(true)
    }else{
        responseResult(false)
    }
}