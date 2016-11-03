package com.Exam.java;
public class Chicken {
	public static void print(Integer mount, Integer money) {//print方法两个参数  mount表示总数，money表示总金钱
		int muJi, gongJi;//声明购买母鸡,公鸡的个数
		int i=1;//定义i作为第i种情况
		System.out.println("花" + money + "元钱买" + mount + "只鸡：");
		for (muJi = 0; muJi <= money / 3; muJi++) {//第一个循环母鸡从0到最大值
		  for (gongJi = 0; gongJi <= money / 5; gongJi++) {//第二个循环公鸡从0到最大值
			int sanXiaoJi = (mount - muJi - gongJi)/3;//小鸡数量为总数减去公鸡和母鸡  三只小鸡的数量即再除以3
				//判断总钱数符合，且小鸡数量为整数，小鸡数量大于0.
			if (muJi * 3 + gongJi * 5 + sanXiaoJi == money  && (mount - muJi - gongJi)%3 == 0 && sanXiaoJi >= 0) {
			  System.out.println("第"+i+"种情况：母鸡有：" + muJi + " 公鸡有:" + gongJi + " 小鸡有：" + sanXiaoJi*3);
		      i++;
			  }

		    }
		}
	}
	public static void main(String[] args) {
		Chicken.print(200 , 200);//传入参数
	}
}
