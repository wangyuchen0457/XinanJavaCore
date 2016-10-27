package com.LoopDemo.java;

import java.io.PrintStream;

public class LoopDemo9X9 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		/*
		 * int[] arry={4,2,65,2,32,15,123} ; for (int i : arry) {
		 * out.println(i); } out.println(arry.length);
		 */
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				out.print(+j + " * " + i + " = " + (i * j)+"\t");
				
			}
			out.println();
		}

	}

}
