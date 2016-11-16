package com.demo;

public class Person {
    String name;
    String like;
    int age;
	public static void main(String[] args) {
          Person person=new Person();
          person.age=20;
          person.like="跑步";
          person.name="张三";
          System.out.println("name : " + person.name+" age : " + person.age+ " like: " + person.like);
	}

}
