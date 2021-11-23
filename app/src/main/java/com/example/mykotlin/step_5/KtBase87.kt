package com.example.mykotlin.step_5

object KtBase87{
    /**
     * object类背后做了什么事情？
     *
     * public static final KTBase87 INSTANCE;
     *
     * private KtBase97(){}
     *
     * public final void show(){}
     *
     * static {
     *      KtBase87 var0 = new KtBase87();
     *      INSTANCE = var0 ;
     *      String var1 = "KtBase91 init..."
     *      ...
     *      System.out.println(var0);
     * }
     *
     */

    init{
        println("KtBase87 init...")
    }

    fun show() = println("我是show函数")
}

//TODO.87.Kotlin语言的对象声明学习
fun main(){
    //object KtBase87 既是单例的实例 也是类名
    //小结： 既然是单例的实例 又是类名，只有一个创建，这就是典型的单例

//    println(KtBase87)
    KtBase87.show()
//    println(KtBase87.show())
}