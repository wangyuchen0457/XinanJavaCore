/*求数组的最大值和最小值的平均值，用Scanner来接收数组的长度和数组的每个值，用for循环遍历每一个值输入。
 * 然后定义最大值max最小值min，将两个值都初始化为数组第一个值。foreach循环中用max与min与每个元素比较，
 * 比较大的值赋给max， 小的值赋给min，foreach结束后即得到数组中最大值和最小值。求平均将两数相加除以2即可。
 */
package com.javacore.exam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam {
	private static Scanner scan;

	public static void main(String[] args) {
	
		System.out.print("求数组中的最大值和最小值的平均值\n请输入一个大于0的整数作为数组长度:");
		scan = new Scanner(System.in);
		// 定义数组长度为x
		int x = scan.nextInt();
		if(x<=0){
			System.out.println("请输入大于0的整数作为数组长度!");
			return;
		}
		// 定义一个double型的数组demo
		double[] demo = new double[x];
		for (int i = 0; i < x; i++) {// 用for循环获得数组的值
			System.out.print("请输入数组的第" + (i + 1) + "个值:");
			demo[i] = scan.nextDouble();// 输入每个元素的值
		}
		// 用Arrays里的方法输出刚才获得的数组
		System.out.println("输入的数组为：" + Arrays.toString(demo));
		double max = demo[0];// 定义最大值max，赋初始值为demo的第一个值
		double min = demo[0];// 定义最大值max，赋初始值为demo的第一个值
		// 用foreach循环遍历每一个数组的值 与max和min比较，大的值赋给max，小的值赋给min
		for (double d : demo) {
			if (d > max) {
				max = d;
			} else if (d < min) {
				min = d;
			}
		}
		System.out.println("数组的最大值为:" + max + "  最小值为：" + min);
		// 定义一个avg作为max和min的平均值
		double avg = (max + min) / 2;
		System.out.println("最大值和最小值的平均值为：" + avg);
	}

}
