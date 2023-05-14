package com.example.my_practice

fun main() {
    //kotlin集合操作符
    val list1 = listOf<Int>(1, 2, 3, 4, 5)

    //1.any list1如果至少有一个元素符合给定条件
    val isLeastMatch = list1.any {
        it == 100
    }
    println("list1里面至少有一个元素等于1:${isLeastMatch}")

    //any list1里面是否有一个元素
    println("list1里面至少有一个元素:${list1.any()}")


    //2.all 如果List集合全部元素都满足给定条件，那么返回true，否则返回false
    val isAllMatch = list1.all {
        it == 3
    }
    println("list1里面所有元素都等于3:${isAllMatch}")


    val isAllMatch2 = list1.all {
        it < 200
    }
    println("list1里面所有元素都小于200:${isAllMatch2}")


    //3.count 获取数组中满足条件的元素个数
    list1.count {
        it % 2 == 0
    }
    val list2 = listOf(1, 2, 3, 4, 5, 67)
    list2.count()


    //4.none 判断数组中的所有元素的限定条件，如果全部都不满足则返回true，和all相对
    val isNoneMatch = list1.none {
        it == 2
    }
    println("list1是不是所有元素都不等于2")
    val isNoneList = list1.none()
    println("list1里面没有任何元素:$isNoneList")


    //5.fold
    //对数组中所有元素进行一定算法计算的方法，返回最终计算出的结果
    val listFold = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val fold1 = listFold.fold(2) { result, item ->
        print("result:$result item:$item")
        result + item
    }

    val reduce1 = list1.reduce { acc, i ->
        acc + i
    }

    println("reduce:所有元素相加 $reduce1")


    val list3 = listOf("1", "2", "3")
    val result = list2.reduceRight { s, acc ->
        s + acc
    }
//    >>> 123


    //49
    //
    val listMap = listOf<Int>(1,2,3,4,5,6)


    //50.partition
    //把一个集合按照一定的规则拆分成两个
    val listPartition = listOf(0, 1, 2, 3, 4, 5, 6)
    val partition = listPartition.partition { it % 2 == 0 }
    val firstPartition = partition.first
    val secondPartition = partition.second
    println("firstPartition:$firstPartition secondPartition:$secondPartition")

}