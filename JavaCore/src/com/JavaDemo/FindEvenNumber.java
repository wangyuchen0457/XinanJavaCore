package com.JavaDemo;

public class FindEvenNumber {

	public static void main(String[] args) {
		 for(int i=Integer.MIN_VALUE;i<=Integer.MAX_VALUE;i++){
			 boolean isEven=(i%2==0);
			 System.out.println(String.format("i=%d,isEven=%b",i, isEven));
			 if (i==Integer.MAX_VALUE){
				 break;
			 };
		 }
	}

}
