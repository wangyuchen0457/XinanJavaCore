package com.annotated;

/**
 * 功能测试类
 * Created by sxf on 15-3-15.
 */
public class TestA{

    public TestA(String name) {
        this.name = name;
    }

    String name;

    @AutoCall(name="打印")
    public void printName() {
        System.out.println("Hello "+name);
    }

    @AutoCall(name="打电话", tip="给谁打电话呢？")
    public void call(String... str) {
        System.out.println("正在打电话给"+str);
    }

    @AutoCall(name="发短信", tip="给谁发短信呢？")
    public void send(String... str) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (String s : str) {
            if (flag) flag = false; else sb.append("、");
            sb.append(s);
        }
        System.out.println("正在发短信给"+sb.toString());
    }
}