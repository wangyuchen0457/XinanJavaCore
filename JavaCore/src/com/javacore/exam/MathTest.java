/*求ax^2+bx+c=0的根
 * 用Scanner来接收控制台输入的a,b,c的值
 * 求一个一元二次方程的根，首先要考虑a,b,c的取值，a如果为0，方程变为一元一次方程，根有一个，
 * 若同时b为0，方程错误，不存在。其次要考虑b^2-4ac，若小于0，方程无根,若等于0，则只有一个根。
 * 正常情况下x=(-b+-sqrl(b^2-4ac))/(2a)
 */
package com.javacore.exam;

import java.io.PrintStream;
import java.util.Scanner;

public class MathTest {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		PrintStream out = System.out;
		// 定义x1，x2为方程的两个根，e为4*a*c的值，f为b^2的值，g为根号下b^2-4ac的值
		double x1, x2, e, f, g;
		// 提示输入数值
		out.print("求aX^2+bX+C=0中X的值" + "\n" + "请输入a的值:");
		// 从控制台接收对应a，b，c的值
		double a = input.nextDouble();
		out.print("请输入b的值:");
		double b = input.nextDouble();
		out.print("请输入c的值:");
		double c = input.nextDouble();
		// a为0的情况
		out.println("输入的方程式为：" + a + "X^2+" + b + "X+" + c);
		if (a == 0) {
			// a为0，同时b为0的情况
			if (b == 0) {
				out.println(" 输入错误! ");
			} else {// a为0方程变成一元一次方程，方程只有一个根
				out.println("方程变为bx+c=0，方程只有一个根。");
				x1 = -c / b;// 求根
				out.println("X = " + x1);
			}
			// 如果a不等于0，b^2-4ac必须>=0 否则无根
		} else if (b * b - 4 * a * c < 0) {
			out.println("输入b^2-4ac小于0，错误！方程无根！");
		} else if (b * b - 4 * a * c == 0) {// b^2-4ac等于0的话，方程也只有一个根
			x1 = -b / a * 2;
			out.println("方程只有一个根： X = " + x1);
		} else {// 正常情况下，a!=0,且b^2-4ac>0。
			// 计算 AX^2+BX+C=0
			// x=(-b+-sqrl(b^2-4ac))/(2a)
			double d = 2 * a;
			e = 4 * a * c;
			f = b * b;
			g = Math.sqrt(f - e); // 用Math的求根号方法
			x1 = (-b + g) / d;
			x2 = (-b - g) / d;
			out.println("方程有两个根:\nX1= " + x1 + " X2= " + x2);
		}
	}
}
