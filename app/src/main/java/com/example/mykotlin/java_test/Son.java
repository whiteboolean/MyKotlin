package com.example.mykotlin.java_test;

public class Son extends Parent {

    public static String A = staticMethodA();
    public String B = methodB();

    static {
        System.out.println("son-- 静态代码块 static construct");
    }

    {
        System.out.println("son-- 构造代码块 normal construct");
    }

    public Son() {
        System.out.println("son-- 构造方法construct Son");
    }

    public void show() {
        System.out.println("son-- show方法");
    }

    public static String staticMethodA() {
        System.out.println("son-- 初始化变量A staticMethodA");
        return "son-- staticA";
    }

    public String methodB() {
        System.out.println("son-- 初始化变量B methodB");
        return "son-- methodB";
    }
}
