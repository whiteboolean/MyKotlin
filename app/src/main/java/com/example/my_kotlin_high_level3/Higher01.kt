package com.example.my_kotlin_high_level3

fun study01() = { name: String, age: Int ->

    true
    name
    age
    "我的姓名是:$name , 我的年龄是:$age"
}

fun study02() = { lambdaAction: (Int, Int) -> String, studyInfo: String ->
    false
    "男"
    val lambdaAction = lambdaAction(10, 10)
    println("最后值是:$lambdaAction + $studyInfo")
}

fun main() {
    println(study01())
    study02()({ number1, number2 ->
        "两数相加的结果是:${number1 + number2}"

    }, "liyuan")

}