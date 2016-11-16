package com;

import java.util.ArrayList;

public class CloneDemo {

	public static void main(String[] args) {

		ArrayList strList1 = new ArrayList<Object>();
		ArrayList strList2 = new ArrayList<Object>();
		strList1.add("1");
		strList1.add("2");
		strList1.add("3");
		strList1.add("4");
		System.out.println("数组1"+strList1.toString());
		for (Object i : strList1) {
			System.out.println(i);
		}
		strList2= (ArrayList) strList1.clone();
		//strList1=strList2;
		strList2.add("5");
		System.out.println("数组1"+strList1.toString());
		for (Object i : strList1) {
			System.out.println(i);
		}
		System.out.println("数组2"+strList2.toString());
	  for (Object i : strList2) {
			System.out.println(i);
		}
	}

}
