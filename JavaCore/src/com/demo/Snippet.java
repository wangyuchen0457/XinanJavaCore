package com.demo;

import com.Exam.java.mathExam;

public class Snippet {
	public static void main(String[] args) {
		
		Double x=-16.5;
		Double t=14.5;
		double	y=Math.floor(x);
		/*double z=Math.ceil(x);
		System.out.println(y);
		System.out.println(z);*/
		y=Math.copySign(t, x);
		System.out.println(y);
		Character s='a';
		Character d=s.toUpperCase(s);
		System.out.println(d);
	}
}