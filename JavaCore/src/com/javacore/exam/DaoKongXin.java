package com.javacore.exam;
//打印倒置空心等腰三角形
public class DaoKongXin extends TriMain{
	 public void printDaoShiXin(int line ,int rank) {
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
