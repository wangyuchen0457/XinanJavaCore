/*求数组中最大值与最小值的平均值。思路用foreach循环遍历数组中每个元素。首先定义最大值max最小值min，
 * 将两个值初始化为数组第一个值和第二个值。foreach循环中用max与min与每个元素比较，比较大的值赋给max，
 * 小的值赋给min，foreach结束后既得数组中最大值和最小值。求平均将两数相加除以2即可。
 */
package com.Exam.java;

public class Test {
	public static void main(String[] args) {
		double[] demo={11,4,3,4,5,6,7,8,9,10};		
		double max=demo[0];
		double min=demo[0];
		for (double d : demo) {
		     if(d>max){
		    	 max=d;
		     }else if(d<min){
		    	 min=d;
		     } 
		     }
		double avg=(max+min)/2;
		System.out.println(avg);
		}
	}


