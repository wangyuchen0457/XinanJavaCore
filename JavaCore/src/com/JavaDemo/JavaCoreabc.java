package com.JavaDemo;

import java.io.PrintStream;

public class JavaCoreabc {
	public static void main(String args[]) {
		PrintStream out = System.out;
		out.println("HelloWorld!");
		out.println(args[2]);
		out.println("my name is " + args[0] + " my age is" + args[1]);
	}
}
