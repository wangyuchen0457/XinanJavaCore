package com.javacore.exam;
//打印倒置实心等腰三角形
public class DaoShiXin extends TriMain{
	 public void printDaoShiXin(int line ,int rank) {
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
	
}
