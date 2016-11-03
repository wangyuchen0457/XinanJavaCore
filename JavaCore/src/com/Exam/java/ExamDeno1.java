package com.Exam.java;

import java.util.Scanner;

public class ExamDeno1 {

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
		/*
		 * if ((line % 2) == 0) { System.out.println("列数请输入奇数！"); // return; }
		 */
		// 如果打印星号每行之间差值为奇数，或行数大于列数，或列数为偶数，打印三角形效果不为等腰三角形
		if ((((rank - 1) / (line - 1) % 2) != 0) || (line > rank) || (rank % 2) == 0) {
			System.out.println("显示问题导致无法正常显示为等腰三角形！");
		}
		if (type == 1) {// 打印实心等腰三角形

			for (int i = 0; i < line; i++) {
				int xing = i * (rank - 1) / (line - 1) + 1;
				// 首先打印空格
				for (int j = 0; j <= ((rank - xing) / 2); j++) {
					System.out.print(" ");
				}
				// 接下来打印星号
				while (xing > 0) {
					System.out.print("*");
					xing--;
				}
				// 最后记得在一行输入完毕后需要换行
				System.out.println();
			}
			// 如果打印星号每行之间差值为奇数，或行数大于列数，或列数为偶数，打印三角形效果不为等腰三角形
			/*
			 * if((((line-1)/(rank-1)%2)!=0)||(rank>line)||(line%2)==0){
			 * System.out.println("显示问题导致无法正常显示为等腰三角形，请重试！");
			 */

		}//打印倒置等腰三角形
		else if (type == 2) {
			for (int i = 0; i < line; i++) {
				int xing = rank - (i * (rank - 1) / (line - 1));
				// 首先打印空格
				for (int j = 0; j <= ((rank - xing) / 2); j++) {
					System.out.print(" ");
				}
				// 接下来打印星号
				while (xing > 0) {
					System.out.print("*");
					xing--;
				}
				// 最后记得在一行输入完毕后需要换行
				System.out.println();
			}
		}
		// 打印空心等腰三角形(空心三角形行列形状与相同行列实心三角形相同，列数为实际显示列数的2倍减1)
		else if (type == 3) {
			for (int i = 0; i < line - 1; i++) {
				int xing = i * (rank - 1) / (line - 1) + 1;
				// 首先打印空格
				for (int j = 0; j < ((rank - xing) / 2); j++) {
					System.out.print(" ");
				}
				// 接下来打印星号
				System.out.print("*");
				//打印两个星号中间的空格
				for (int a = xing; a > 2; a--) {
					System.out.print(" ");
				}
				if (i != 0)//如果不是第一行，第一个*对称地方要再打印一个*
					System.out.print("*");
				// 最后记得在一行输入完毕后需要换行
				System.out.println();
			}
			//打印最后一行星号，为了显示效果，星号与空格交替打印
			for (int b = 0; b <= rank - 1; b = b + 2) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		} //打印空心倒置等腰三角形（空心三角形行列形状与相同行列实心三角形相同，列数为实际显示列数的2倍减1）
		else if (type == 4) {
		   //打印第一行星号 
			for (int b = 0; b <= rank - 1; b = b + 2) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			for (int i = 1; i < line; i++) {
				int xing = rank - (i * (rank - 1) / (line - 1));
				// 首先打印空格
				for (int j = 0; j <= ((rank - xing) / 2) - 1; j++) {
					System.out.print(" ");
				}

				// 接下来打印星号
				System.out.print("*");
				for (int a = xing; a > 2; a--) {
					System.out.print(" ");
				}
				if (i != line - 1)//如果不是最后一行 末尾加一个*.
					System.out.print("*");
				// 最后记得在一行输入完毕后需要换行
				System.out.println();
			}
		}
	}
}
