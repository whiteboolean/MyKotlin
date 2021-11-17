package com.example.mykotlin.second_step


// TODO 32.Kotlin语言的函数引用学习
// TODO lambda属于函数类型的对象
fun main() {
    // 需要把methodResponseResultImpl普通函数变成函数类型的对象(函数引用)
    login(DB_SAVE_USER_NAME4, DB_SAVE_USER_PWD4, ::methodResponseResultImpl)

    val obj = ::methodResponseResultImpl
    val obj2 = obj
    val obj3 = obj2

    login("","",obj3)
}

fun methodResponseResultImpl(msg: String, code: Int) {
    println("最终登录的成果是: msg:$msg code:$code")
}


const val DB_SAVE_USER_NAME4 = "Jake"
const val DB_SAVE_USER_PWD4 = "123456"

inline fun login(name: String, pwd: String, responseResult: (String, Int) -> Unit) {
    if (DB_SAVE_USER_NAME4 == name && DB_SAVE_USER_PWD4 == pwd) {
        responseResult("登录成功", 200)
    } else {
        responseResult("登录失败", 404)
    }

}
