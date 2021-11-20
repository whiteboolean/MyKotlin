package com.example.mykotlin.step_2


// TODO 29.在函数中定义参数是函数的函数
fun main(args: Array<String>) {

    val response = { responseMsg: String, responseCode: Int ->
        println("最终拿到的结果是:responseMsg$responseMsg,responseCode:$responseCode")
    }
    doLogin("Jake", "123456", response)
}


const val DB_SAVE_USER_NAME = "Jake"
const val DB_SAVE_USER_PWD = "123456"

private fun doLogin(userName: String, userPwd: String, serverResponse: (String, Int) -> Unit) {
    if (DB_SAVE_USER_NAME == userName &&
        userPwd == DB_SAVE_USER_PWD
    ) {
        val serverResponseResult = "恭喜你登录成功"
        serverResponse(serverResponseResult, 200)
    } else {
        val serverResponseResult = "对不起，登录失败"
        serverResponse(serverResponseResult, 404)
    }
}