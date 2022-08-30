package com.example.my_kotlin_high_level2.test1

fun main() {
    loginEngine("admin","admin")
}



private fun loginEngine(userName:String,userPwd:String) :Unit {

    loginServer(userName,userPwd) { userName, userPwd ->
        if (userName == "admin" && userPwd == "admin") {
            println("登录成功")
        } else {
            println("登录失败")
        }
    }
}


private fun loginServer(userName: String,userPwd: String,responseResult:(String,String)->Unit) = responseResult(userName,userPwd)