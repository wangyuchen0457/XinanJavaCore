package com.javacore.exam;
//定义一个KongXin类继承Main来打印空心等腰三角形
public class KongXin extends TriMain{
	 public void printKongXin(int line ,int rank) {
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
		 
		 
	 }
	 }
