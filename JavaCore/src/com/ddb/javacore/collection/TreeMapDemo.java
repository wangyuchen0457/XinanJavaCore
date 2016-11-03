package com.ddb.javacore.collection;

import java.io.PrintStream;
import java.util.TreeMap;



public class TreeMapDemo {


	public static void main(String[] args) {
		
		PrintStream out = System.out;
		TreeMap< Long ,Integer> tMap=new TreeMap< Long ,Integer>();
		tMap.put(0L, 10);
		tMap.put(1L, 12);
		tMap.put(2L, 14);
		tMap.put(3L, 16);
		out.println("tMap :" + tMap);
		
		out.println("tMap.get(0L) :" + tMap.get(0L));
		TreeMap<Long,Integer> tMap2 = (TreeMap<Long, Integer>) tMap.clone();
		out.println("tMap2:" + tMap2);
		
	}

}
