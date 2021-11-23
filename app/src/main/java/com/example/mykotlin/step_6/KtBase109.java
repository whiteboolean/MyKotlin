package com.example.mykotlin.step_6;


import com.example.mykotlin.step_5.HumanBeing;
import com.example.mykotlin.step_5.Person;
import com.example.mykotlin.step_5.Student;

import java.util.ArrayList;
import java.util.List;

public class KtBase109 {

    public static void main(String[] args) {

        List<CharSequence> list = new ArrayList<>();

        //泛型默认情况下是泛型的子类对象 不可以赋值给泛型的父类对象

        List<CharSequence> list1 = new ArrayList<>();

        //? extends T就相当于KT里面的out ，所以才可以 泛型子类对象赋值给 泛型父类对象
        //out:泛型具体出的子类对象 可以赋值给泛型声明处的父类对象

        //无法确定 list2是person的子类的哪一级，有可能是孙子级，穷孙子集，所以不能写，只能读
        // 只能 read ，不能wright  --- out

        List<? extends Person> list2 = new ArrayList<>();
        Person person = list2.get(1);
//        list2.set(1, new Student("你好"));


        //最算是 HumanBeing类 -- in
        // 只能write(但是也只能read person以及person 的子类) 不能 read
        List<? super Person> list3 = new ArrayList<>();
//        Person object = list3.get(1);
        list3.set(1, new Person("你好"));


        //？ extends T 可以读取到T对象，而不能写入T对象和T的子对象
        //？ super T 可以读取到Object对象，可以写入T对象和T的子对象
        //协变 ： 父类泛型声明处 可以接受子类泛型具体
    }
}
