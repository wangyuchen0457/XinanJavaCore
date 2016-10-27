package com.sysDada;

import java.io.PrintStream;
import java.util.Scanner;

public class Welc {

	Aodi aodi = new Aodi();
	Pika pika = new Pika();
	Mazida mazida = new Mazida();
	Jinlong jinlong = new Jinlong();
	Song song = new Song();
	Yi yi = new Yi();
	int check = 0;//定义一个判断输入是否错误的数
	public void print() {
		PrintStream out = System.out;
		System.out.println("欢迎使用答答租车系统！\n您是否要租车？1 是  0 否");
		Scanner scan = new Scanner(System.in);
		double i = scan.nextDouble();
        //判断输入的数字  选择打印类型
		if (i == 0) {
			out.println("系统已退出！");// 不租车则退出系统
			check++;//判断是否跳出程序的条件成立
			return;

		} else if (i == 1) {
			out.println("您可租用的汽车类型及其价目表：\n序号\t汽车名称\t\t租金\t\t容量");
		} else {
			out.println("输入有误，请重试！");
			check++;//判断是否跳出程序的条件成立
			return;
		}
		out.println(aodi);
		out.println(mazida);
		out.println(pika);
		out.println(jinlong);
		out.println(song);
		out.println(yi);

	}
}