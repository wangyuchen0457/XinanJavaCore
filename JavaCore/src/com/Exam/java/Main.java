package com.Exam.java;

import java.util.Scanner;

public class Main {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		// 提示键盘输入
		System.out.println("请选择想要显示的三角形类型！" + "\n" + "1、实心等腰三角形  2、倒置实心等腰三角形 3、空心等腰三角形 4、倒置空心 等腰三角形");
		int type = scan.nextInt();
		if (type != 1 && type != 2 && type != 3 && type != 4) {
			System.out.println("输入错误！");
			return;
		}
		System.out.print("请输入一个大与1的行数：");
	    int line = scan.nextInt();
	
		if (line <= 1) {
			System.out.println("请输入大于1的行数！");
			return;
		}
		System.out.print("请输入一个大于1的列数：");
		 int rank = scan.nextInt();
		if (rank <= 1) {
			System.out.println("请输入大于1的列数！");
			return;
		}
		// 如果打印星号每行之间差值为奇数，或行数大于列数，或列数为偶数，打印三角形效果不为等腰三角形
		if ((((rank - 1) / (line - 1) % 2) != 0) || (line > rank) || (rank % 2) == 0) {
			System.out.println("显示问题导致无法正常显示为等腰三角形！");
		}
	
	}

}
