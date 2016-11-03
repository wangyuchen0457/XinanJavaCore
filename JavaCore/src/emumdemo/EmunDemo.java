package emumdemo;

import java.io.PrintStream;

public class EmunDemo {
	
	public static void print(MonthEmun test){
		PrintStream out = System.out;
		switch (test.getIndex()) {
		case 1:
			out.println("1月   ");
			out.println(test.getIndex()+"---"+test.getName());
			out.println(test.ordinal());
			break;
		case 2:
			out.println("2月  ");
			out.println(test.ordinal());
			out.println(test.toString());
			out.println(test.getClass());
			break;
		case 3:
			out.println("3月  ");
			break;
		case 4:
			out.println("4月   ");
			break;
		case 5:
			out.println("5月   ");
			break;
		case 6:
			out.println("6月   ");
			break;
		case 7:
			out.println("7月  ");
			break;
		case 8:
			out.println("8月   ");
			break;
		case 9:
			out.println("9月   ");
			break;
		case 10:
			out.println("10月   ");
			break;
		case 11:
			out.println("11月   ");
			break;
		default:
			out.println("12月   ");
			break;
		
		}
		
	}
	public static void main(String[] args) {

		
		
	}
}
