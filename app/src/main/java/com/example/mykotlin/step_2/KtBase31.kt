package com.example.mykotlin.step_2


// TODO 31.Kotlin语言的内联函数
/**
 * 此函数有使用lambda作为参数，就需要声明内联
 * 如果此函数，不适用内联，在调用端会生成多个对象来完成lambda的调用(会造成性能损耗)
 * 如果此函数使用内联，相当于 C++ #define 宏定义 宏替换 会把代码替换到调用处
 * 调用处没有任何函数开辟，对象开辟的损耗
 * 登录API 模仿 前端
 */
fun main(args: Array<String>) {

    doLogin("Jake", DB_SAVE_USER_PWD3, { a: String, b: Int ->
        println("最终登陆结果为：msg:$a , b:$b")
    })
//
//    doLogin(DB_SAVE_USER_NAME3, DB_SAVE_USER_PWD3, serverResponse = { a: String, b: Int ->
//        println("最终登陆结果为：msg:$a , b:$b")
//    })
//
//    doLogin("Jake", DB_SAVE_USER_PWD3) { a: String, b: Int ->
//        println("最终登陆结果为：msg:$a , b:$b")
//    }
}


const val DB_SAVE_USER_NAME3 = "Jake"
const val DB_SAVE_USER_PWD3 = "123456"


private  fun doLogin(userName: String, userPwd: String, serverResponse: (String, Int) -> Unit) {
    if (DB_SAVE_USER_NAME3 == userName &&
        userPwd == DB_SAVE_USER_PWD3
    ) {
        val serverResponseResult = "恭喜你登录成功"
        serverResponse(serverResponseResult, 200)
    } else {
        val serverResponseResult = "对不起，登录失败"
        serverResponse(serverResponseResult, 404)
    }
}

