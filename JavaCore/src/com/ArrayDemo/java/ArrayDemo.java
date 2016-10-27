package com.ArrayDemo.java;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] intArray = { 1, 3, 2, 4, 5 };

		for (int i : intArray) {
			System.out.println(i);
		}
		int[] intArray1;
		intArray1 = new int[5];
		intArray1[4] = 5;
		System.out.println(intArray1[4]);
	}
}
