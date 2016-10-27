package com.sysDada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Welc welc = new Welc();
		welc.print();// 打印欢迎界面
		if (welc.check != 0) {//判断是否跳出程序
			return;
		}
		Select s = new Select();// 调用Select
		s.sel();
		System.out.println("谢谢使用，欢迎继续使用！");
		System.out.print("是否继续使用？继续使用请输入 1  输入其他任意值退出：");
		double i = scan.nextDouble();
	    
		while(i==1){
			
			welc.print();// 打印欢迎界面
			if (welc.check != 0) {
				return;
			}
            // 调用Select
			s.sel();
			System.out.println("谢谢使用，欢迎继续使用！");
			System.out.print("是否继续使用？继续使用请输入 1  输入其他任意值退出：");
			i = scan.nextDouble();
			if(i!=1){
				System.out.println("再见！");
				return;
			}
		      }
		System.out.println("再见！");
	    }
}