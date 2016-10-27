package com.LoopDemo.java;

import java.io.PrintStream;
import java.util.Scanner;
public class LoopDemoTraning1 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		PrintStream out=System.out;
		 double x1,x2,e,f,g;
		 //输入abc的值
		out.print("求aX^2+bX+C=0中X的值"+"\n"+"请输入a的值:");
			double a=input.nextDouble();
			out.print("请输入b的值:");
			double b =input.nextDouble();
			out.print("请输入c的值:");
			double c =input.nextDouble();
			if(a==0){
				if(b==0) 
				{
				out.println(" 输入错误! ");	
				
				}else
				{
			
				out.println("方程变为bx+c=0");
				x1=-c/b;
				out.println("x = "+x1);
				}
				//b^2-4ac必须>=0
			}else if(b*b-4*a*c<0)
			{
				out.println("输入错误，请重新输入！");
				
			} else if(b*b-4*a*c==0){
				x1=-b/a*2;
				out.println("x只有一个值： x = "+x1);
				
			}else{
			//计算 AX^2+BX+C=0
			//y=(-b+-sqrl(b^2-4ac))/(2a)
		    double d=2*a;		 
		    e=4*a*c;		    
		    f=b*b;		      
		    g=Math.sqrt(f-e);		 
		    x1=(-b+g)/d;
		    x2=(-b-g)/d;
		    out.println("x的值为x1= "+x1+" x2= "+x2);	    
	}
	}
}
