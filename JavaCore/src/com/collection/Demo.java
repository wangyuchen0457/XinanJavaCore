package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
         List<Integer> strList=new ArrayList<Integer>();
         strList.add(1);
         strList.add(2);
         strList.add(3);
         strList.add(4);
         strList.add(1);
         System.out.println("strList: " + strList);
         Set<Integer> intSet=new HashSet<Integer>();
         intSet.add(2);
         intSet.add(3);
         intSet.add(4);
         intSet.add(1);
         System.out.println("intSet: " + intSet);
	}

}
