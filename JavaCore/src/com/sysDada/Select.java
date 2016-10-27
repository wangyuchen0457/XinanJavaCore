package com.sysDada;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

import jdk.nashorn.internal.ir.BreakableNode;

public class Select {
	Aodi aodi = new Aodi();
	Pika pika = new Pika();
	Mazida mazida = new Mazida();
	Jinlong jinlong = new Jinlong();
	Song song = new Song();
	Yi yi = new Yi();
	Scanner scan = new Scanner(System.in);
	public void sel() {
		int cargo=0;//声明载货车辆的个数
		int mancar=0;//声明载人车辆的个数
		int sumMoney = 0;// 声明总金额
		int sumVolume1 = 0;// 声明总载人量
		int sumVolume2 = 0;// 声明总载货量
		PrintStream out = System.out;
		out.println("请输入需要租车的数量：");
		int i = scan.nextInt();//i作为需要租车的数量
		if(i<=0){
			out.println("输入有误！");
			return;
		}
	   int[] n =new int[i];//定义一个数组保存输入的车型序号
		for (int j = 1; j <= i; j++) {
			String[] Car=new String[i];
			out.print("请选择第" + j + "辆车:");
			 n[j-1] = scan.nextInt();   //读取输入的车辆序号
			//  out.println();
			switch (n[j-1]) {        //判断选择的车型
			case 1:
				sumMoney = sumMoney + aodi.money;
				sumVolume1 = sumVolume1 + aodi.volume;
				mancar++;
				break;
			case 2:
				sumMoney = sumMoney + mazida.money;
				sumVolume1 = sumVolume1 + mazida.volume;
				mancar++;
				break;
			case 3:
				sumMoney = sumMoney + pika.money;
				sumVolume1 = sumVolume1 + pika.volume1;
				sumVolume2 = sumVolume2 + pika.volume2;
				mancar++;
				cargo++;
				break;
			case 4:
				sumMoney = sumMoney + jinlong.money;
				sumVolume1 = sumVolume1 + jinlong.volume;
				mancar++;
				break;
			case 5:
				sumMoney = sumMoney + song.money;
				sumVolume2 = sumVolume2 + song.volume2;
				cargo++;
				break;
			case 6:
				sumMoney = sumMoney + yi.money;
				sumVolume2 = sumVolume2 + yi.volume2;
				cargo++;
				break;
			default:
				out.println("输入有误，请重新输入");
				j--;
				break;
			}
			/*if (n[j-1]> 6 || n[j-1]< 1) {
				out.println("输入有误，请重新输入");
				j--;
				continue;*/
			}
		out.println("请输入需要租车的天数：");//输入租车天数
		int day=scan.nextInt();
		if(i<=0){
			out.println("输入有误！");
			return;
		}
		sumMoney=sumMoney*day;   //总金额
		String[] manCar = new String[i];//定义载人汽车的数组
		String[] cagoCar= new String[i];//定义载货汽车的数组
		//给载人汽车数组赋值
		for(int k=0;k<i;k++){   
			switch (n[k]) {
			case 1:
				manCar[k]=aodi.name;
				break;
			case 2:
				manCar[k]=mazida.name;
			    break;
			case 3:
			    manCar[k]=pika.name;
			    break;
			case 4:
				manCar[k]=jinlong.name;
				break;
		     default:
		        continue;
			}
		}
		//给载货汽车数组赋值
		for(int k=0;k<i;k++){
			switch (n[k]) {
			case 3:
				cagoCar[k]=pika.name;
				break;
			case 5:
				cagoCar[k]=song.name;
			    break;
			case 6:
			    cagoCar[k]=yi.name;
			    break;
		     default:
		        continue;
			}
		}
		//打印载人汽车
	  if(mancar!=0){
		out.print("您的账单：\n载人汽车：");
		for(String car:manCar){
			if(car!=null)//避免输出空值
			out.print(car+" ");
		}
		}else{
			out.println("无载人型汽车");
		}
	  out.println();
	  //打印载货汽车
	  if(cargo!=0){
		out.print("载货汽车：");
		for(String car:cagoCar){
			if(car!=null)
			out.print(car+" ");
		}
	  }else{
		  out.println("无载货型汽车");
	  }
	  out.println();
		//out.println(Arrays.toString(n));
		out.println("共"+sumMoney+"元钱\t可载"+sumVolume1+"人\t可载货"+sumVolume2+"吨");
}
}
