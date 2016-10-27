package com.LoopDemo.java;

import java.io.PrintStream;

public class LoopDemo2 {
	public static void main(String[] args) {
		PrintStream out = System.out;
		out.println("For 循环：");
		for (int i = 0; i < 5; i++) {
			out.println("i = " + i);
		}

		out.println();
		out.println("For 循环：1+...100 = ");
		int all = 0;
		for (int i = 1; i <= 100; i++) {
			// out.println("i = " + i);
			if(i<3){
				out.println("i<3 continue");
				continue;
			}
			all = all + i;
		}
		out.println("all =  " + all);

		// while
		int x = 4;
		int y = 0;
		out.println();
		out.println("While Demo: ");
		while (y <= x) {
			out.println("y = " + y);
			y++;
			out.println("y = " + y);

		}

		// do while
		int m = 3;
		out.println();
		out.println("do while demo: ");
		do {
			out.println("m = " + m);
			m--;
			out.println("m = " + m);
		} while (m >= -1);

		out.println("do while demo: ");
		do {
			out.println("m = " + m);
			m--;
			out.println("m = " + m);
		} while (m == -1);

		// foreach
		out.println();
		out.println("foreach demo: ");
		int[] arry = { 11, 22, 33, 44, 55, 66 };
		for (int i : arry) {
			out.println("i = " + i);
		}

		out.println();
		out.println("foreach demo: ");
		for (int i = 0; i < arry.length; i++) {
			out.println("i = " + arry[i]);
			// out.println("= = " + arry[arry.length]);

		}
	}}
