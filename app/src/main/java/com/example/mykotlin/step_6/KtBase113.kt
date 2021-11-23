package com.example.mykotlin.step_6

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.example.mykotlin.p


//假设之歌代码是，开源的，活着是很庞大JDK源码，或者是非常复杂的开源库
class KtBase113(val name:String,val age:Int,val sex:Char)

//增加扩展函数
fun KtBase113.show(){
    p("给ktbase113增加扩展函数")
}

//增加扩展函数

fun KtBase113.getInfo() = "我是getInfo函数,name:${name},age:${age},sex:${sex}"


fun String.addExtAction (number:Int) = this+"@".repeat(number)

fun String.showStr() = println(this)


/* 增加扩展函数后 的 背后代码

    public final class KtBase113Kt {

        public static final void show(KtBase113 $this$show) {
            System.out.println("我是show函数, name:" + $this$show.name + ", age:" + $this$show.age, sex:" + $this$show.sex);
        }

        public static final void getInfo(KtBase113 $this$getInfo) {
            return "我是getInfo函数, name:" + $this$show.name + ", age:" + $this$show.age, sex:" + $this$show.sex;
        }

        public static final void showStr(String $this$showStr) {
            System.out.println($this$showStr);
        }

        public static final String addExtAction(String $this$addExtAction) {
           return $this$addExtAction + StringsKt.repeat((CharSequence)"@", number);
        }

        public static void main(String [] args) {
            main();
        }

        public static void main() {
            // ...
        }
    }

 */

//TODO 113-Kotlin语言的定义扩展函数学习
fun main(args: Array<String>) {
    val p = KtBase113("张三",28,'男')
    p.show()
    println(p.getInfo())



}