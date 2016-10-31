package com.Exam.java;

public class ShiXin {
	
public void printShiXin() {
	for (int i = 0; i < shixian.line; i++) {
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
}
}