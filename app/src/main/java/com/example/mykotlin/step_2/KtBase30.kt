package com.example.mykotlin.step_2


// TODO 29.在函数中定义参数是函数的函数
fun main(args: Array<String>) {

    doLogin("Jake", DB_SAVE_USER_PWD2, { a: String, b: Int ->
        println("最终登陆结果为：msg:$a , b:$b")
    })

    doLogin(DB_SAVE_USER_NAME2, DB_SAVE_USER_PWD2, serverResponse = { a: String, b: Int ->
        println("最终登陆结果为：msg:$a , b:$b")
    })

    doLogin("Jake", DB_SAVE_USER_PWD2) { a: String, b: Int ->
        println("最终登陆结果为：msg:$a , b:$b")
    }
}


const val DB_SAVE_USER_NAME2 = "Jake"
const val DB_SAVE_USER_PWD2 = "123456"

private fun doLogin(userName: String, userPwd: String, serverResponse: (String, Int) -> Unit) {
    if (DB_SAVE_USER_NAME2 == userName &&
        userPwd == DB_SAVE_USER_PWD2
    ) {
        val serverResponseResult = "恭喜你登录成功"
        serverResponse(serverResponseResult, 200)
    } else {
        val serverResponseResult = "对不起，登录失败"
        serverResponse(serverResponseResult, 404)
    }
}