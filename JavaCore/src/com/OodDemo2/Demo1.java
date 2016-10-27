package com.OodDemo2;

public class Demo1 extends Demo {
public Demo1(){
	System.out.println("子类");
}

public static void main(String[] args) {
    Demo demo2=new Demo2();	
    Demo demo3= demo2;

}
}