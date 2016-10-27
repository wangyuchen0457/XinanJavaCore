package com.Exam.java;

import java.util.Scanner;

public class ExamDemo2 {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		System.out.print("请输入行数：");
	     int rank = inScanner.nextInt();
	     if(rank<=1){
	     	System.out.println("请输入大于1的行数");
	     	return;
	     }
	     System.out.print("请输入列数：");
	     int line = inScanner.nextInt();
	     if((line%2)==0){
	     	System.out.println("列数请输入奇数！");
	     	//return;
	     	}
	    
	     
	     for (int i = 0; i < rank-1; i++) {
	     	int xing=i*(line-1)/(rank-1)+1;
	     	// 首先打印空格
	     
	     	for (int j =0; j <= ((line-xing)/2)-1; j++) {
	     		System.out.print(" ");
	     	    }
	     	
	     	// 接下来打印星号
	     	System.out.print("*");
	     	for(int a=xing;a>2;a--){
	     		System.out.print(" ");
	     	}
	     	if(i!=0)System.out.print("*");
	     	// 最后记得在一行输入完毕后需要换行
	     	System.out.println();
	        }
	     for(int b=0;b<=line-1;b++) {
	    	 System.out.print("*");
	    	 
	     }
	     //如果打印星号每行之间差值为奇数，或行数大于列数，或列数为偶数，打印三角形效果不为等腰三角形
	     if((((line-1)/(rank-1)%2)!=0)||(rank>line)||(line%2)==0){
	     	System.out.println("显示问题导致无法正常显示为等腰三角形，请重试！");
	     
           }
		
		
		
	}
}
