package com.example.my_practice

fun main() {
    //kotlin集合操作符

    val list1 = listOf<Int>(1,2,3,4,5)

    //any list1里面是否有一个元素
    println("list1里面至少有一个元素:${list1.any()}")

    //any list1如果至少有一个元素符合给定条件
    val isLeastMatch = list1.any {
        it == 100
    }
    println("list1里面至少有一个元素等于1:${isLeastMatch}")

    //all 如果List集合全部元素都满足给定条件，那么返回true，否则返回false
    val isAllMatch = list1.all {
        it== 3
    }
    println("list1里面所有元素都等于3:${isAllMatch}")


    val isAllMatch2 = list1.all {
        it < 200
    }
    println("list1里面所有元素都小于200:${isAllMatch2}")


    val isNoneList = list1.none()
    println("list1里面没有任何元素:$isNoneList")



    //我看到这个函数源码的时候，觉得这个封装很鸡肋，后来一想，这样写的好处可能是为了方便链式调用吧
    list1.count()


    list1.count {
        it%2==0
    }
    //返回集合中满足给定条件predicate的元素的数量

    val list2 = listOf<Int>(1,2,3,4,5,67)
    list2.count()





}