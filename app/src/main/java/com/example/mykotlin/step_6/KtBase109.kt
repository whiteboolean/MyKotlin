package com.example.mykotlin.step_6

import com.example.mykotlin.p

//生产者 out T协变[out T 此泛型能够被获取 读取所以是out] <---> T extends
interface Producer<out T>{

    //out T代表整个生产者类里面 这个T 只能被读取 不能被修改
//    fun consumer(item:T) {
//    }

    //只能被读取
    fun  producer():T
}


//消费者 in T 逆变[in T 此泛型只能修改 更新所以是in]
interface Consumer<in T>{
    //in T代表整个生产者里面 这个T 只能被修改，不能被读取
    fun consumer(item:T) {}

    //不能被读取(编译不通过)
//    fun  producer():T

    //? extends T  生产者 只能读取 不能set 类似 out 协变

    //? super T 消费者 只能set 不能读取 类似in 逆变
}

open class Animal // 动物
open class Humanity : Animal() // 人类
open class Man : Humanity() // 男人
open class WoMan : Humanity() // 女人

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  只管生产者
class ProducerClass1 : Producer<Animal> {
    override fun producer(): Animal {
        println("生产者 Animal")
        return Animal()
    }
}

class ProducerClass2 : Producer<Humanity> {
    override fun producer(): Humanity {
        println("生产者 Humanity")
        return Humanity()
    }
}

class ProducerClass3 : Producer<Man> {
    override fun producer(): Man {
        println("生产者 Man")
        return Man()
    }
}

class ProducerClass4 : Producer<WoMan> {
    override fun producer(): WoMan {
        println("生产者 WoMan")
        return WoMan()
    }
}

// TODO 109-Kotlin语言的out-协变学习
// 1.Producer Consumer 不变
// 2.ProducerClass4
// 3.main 测试
fun main() {
    val p1 : Producer<Animal> = ProducerClass1() // ProducerClass1他本来就是 传递 Animal ，当然是可以的

    val p2 : Producer<Animal> = ProducerClass2() // ProducerClass2他本来就是 传递 Humanity，居然也可以，因为out
    val p3 : Producer<Animal> = ProducerClass3() // ProducerClass3他本来就是 传递 Man，居然也可以，因为out
    val p4 : Producer<Animal> = ProducerClass4() // ProducerClass4他本来就是 传递 WoMan，居然也可以，因为out

    // 泛型默认情况下是：泛型的子类对象 不可以赋值给 泛型的父类对象
    // 泛型默认情况下是：泛型具体处的子类对象  不可以赋值给 泛型声明处的父类对象

    // out: 泛型的子类对象 可以赋值给 泛型的父类对象
    // out: 泛型具体出的子类对象 可以赋值给 泛型声明处的父类对象

    // 协变：父类 泛型声明处  可以接收   子类 泛型具体处
}
