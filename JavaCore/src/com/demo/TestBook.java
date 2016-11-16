package com.demo;

public class TestBook {

	public static void main(String[] args) {
         Book bookA=new Book();
         Book bookB=new Book();
         bookA.price=1.0;
         bookA.title="字典";
         bookB.price=2.0;
         bookB.title="杂志";
         bookB=bookA;
         bookA.printInfo();
         bookB.printInfo();
	}

}
