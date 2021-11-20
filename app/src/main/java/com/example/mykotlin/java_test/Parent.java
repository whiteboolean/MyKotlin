package com.example.mykotlin.java_test;

public class Parent {
    public static String A =staticMethodA();
    public String B = this.methodB();

    static {
        System.out.println("Parent-- 静态代码块 static construct");
    }

    {
        System.out.println("Parent-- 构造代码块 normal construct");
    }

    public Parent() {
        System.out.println("Parent-- 构造方法construct Parent");
    }


    public static String staticMethodA(){
        System.out.println("Parent-- 初始化变量A staticMehodA");
        return "Parent-- staticA";
    }

    public String methodB(){
        System.out.println("parent-- 初始化变量B methodB");
        return "Parent-- methodB";
    }
}
