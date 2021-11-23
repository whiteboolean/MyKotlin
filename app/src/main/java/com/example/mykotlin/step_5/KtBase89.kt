package com.example.mykotlin.step_5

class KtBase89{

    //伴生对象
    companion object{
        val info = "JakeInfo"
        fun showInfo() = println("info:$info")
        val name = "Jake"
    }

    //背后的逻辑 -->静态内部类 Companion类

    /* companion object {} 背后的逻辑

       private static final String name = "Jake";
       private static final String info = "JakeInfo";
       public static final KtBase89.Companion Companion = new KtBase89.Companion(xxx);

       public static final class Companion {

          @NotNull
          public final String getInfo() {
             return KtBase89.info;
          }

          @NotNull
          public final String getName() {
             return KtBase89.name;
          }

          public final void showInfo() {
             String var1 = "info:" + ((KtBase89.Companion)this).getInfo();
             boolean var2 = false;
             System.out.println(var1);
          }

          private Companion() {}

          // $FF: synthetic method
          public Companion(DefaultConstructorMarker $constructor_marker) {
             this();
          }
        }

     */

}

// TODO 89.Kotlin语言的伴生对象学习
// 伴生对象的由来： 在Kt中是没有java的这种static 静态，伴生很大程度上和java的这种static静态差不多的
// 无论 KtBase89() 构建多少次，我们的伴生对象，只有以此加载
// 伴生对象只会初始化一次
fun main() {
    println(KtBase89.info)
    println(KtBase89.name)

}

