/*用Scanner语句 在控制台输入 行数和列数，以及需要打印的三角形类型，行数和列数必须为大于1的整数。
 * 根据控制台打印规则，打印等腰三角形第一行*有1个，最后一行*有列数个，可得每行*的差，
 * 这个差值如果为奇数则第二行星号左右两边不对称，因此差为偶数才能打印标准的等腰三角形。
 * 打印实心等腰三角形用for循环依次打印每一行的空格和*，每行的空格数是从列数减一后除以2递减的，
 * 用循环语句打印空格完成后再打印*，等腰三角形尖角为一个*号，底边为列数个*，因此每行星号是等差数列。
 * 打印空格和*不换行，打印一行结束换行。
 * 空心等腰三角形星号前面空格同上，打印完空格打印一个星号，然后打印每行星号个数减2 个空格，
 * 之后除了第一行也就是尖角部分再打印一个星号，即构成空心。最后一行为了美观，使星号和空格交替打印。
 * 倒置的类似，只需将星号 空格个数跟正着的反过来即可。
 */
package com.javacore.exam;

import java.util.Scanner;

public class TriMain {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		// 提示键盘输入想要打印的三角形类型
		System.out.println("请选择想要打印的三角形类型！" + "\n" + "1、实心等腰三角形  2、空心等腰三角形 3、倒置实心等腰三角形 4、倒置空心 等腰三角形");
		//定义type作为判断打印形状的变量并从控制台接收
		int type = scan.nextInt();
		
		//如果控制台未输入列出的类型，则退出语句
		if (type != 1 && type != 2 && type != 3 && type != 4) {
			System.out.println("输入错误！");
			return;
		}
		//定义line作为三角形行数并从控制台接收
		System.out.print("请输入一个大与1的行数：");
	    int line = scan.nextInt();
	//如果行数小于等于1，没有意义，因此退出语句
		if (line <= 1) {
			System.out.println("请输入大于1的行数！");
			return;
		}
		//定义rank作为三角形列数并从控制台接收
		System.out.print("请输入一个大于1且为奇数的列数(为了显示效果请输入行数减1的偶数倍然后加1的值)：");
		 int rank = scan.nextInt();
	   // 如果列数小于等于1，没有意义，同样退出语句
		 if (rank <= 1) {
			System.out.println("请输入大于1的列数！");
			return;
		}
		// 如果打印星号每行之间差值为奇数，或行数大于列数，或列数为偶数，打印三角形效果不为完美的等腰三角形
		if ((((rank - 1) / (line - 1) % 2) != 0) || (line > rank) || (rank % 2) == 0) {
			System.out.println("显示问题导致无法正常显示为等腰三角形！");
		}
		//实例化ShiXin的一个对象
		ShiXin shixin=new ShiXin();
		//实例化KongXin的一个对象
		KongXin kongxin=new KongXin();
		//实例化DaoShiXin的一个对象
		DaoShiXin daoshixin=new DaoShiXin();
		//实例化DaoKongXin的一个对象
	    DaoKongXin daokongxin=new DaoKongXin();
		//根据type的值来调用相关方法
		switch (type) {
		case 1://打印实心等腰三角形
			System.out.println(line+"行"+rank+"列的"+"实心等腰三角形：");
			shixin.printShiXin(line, rank);//调用ShiXin的一个方法 并传line和rank参数。
			break;
		case 2:
			System.out.println(line+"行"+rank+"列的"+"空心等腰三角形：");
			kongxin.printKongXin(line, rank);//调用KongXin的一个方法 并传line和rank参数。
			break;
		case 3:
			System.out.println(line+"行"+rank+"列的"+"倒置实心等腰三角形：");
			daoshixin.printDaoShiXin(line, rank);//调用DaoShiXin的一个方法 并传line和rank参数。
			break;
		case 4:
			System.out.println(line+"行"+rank+"列的"+"倒置空心等腰三角形：");
			daokongxin.printDaoShiXin(line, rank);
			break;
		}
	}
}
