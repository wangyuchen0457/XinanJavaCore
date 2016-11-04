package com.Exam.java;

//mount-muji=gongji+xiaoji    money-3*muji=5*gongji+xiaoji/3  母鸡确定时可以求出公鸡和小鸡的值
public class Chicken2 {
//定义mount作为总只数，money作为总钱数
	public static void print(Integer mount,Integer money){
		int muji, gongji,xiaoji;
		System.out.println("花"+money+"元钱买"+mount+"只鸡");
		//定义i作为第i种情况
		int i=0;
		for (muji = 0; muji <= money/3; muji++) {
			gongji=(3*money-mount-8*muji)/14;//最上面两个式子组合得到公鸡与母鸡的关系
			//小鸡就是mount-gongji-muji
			xiaoji=mount-gongji-muji;
			//钱数确定为money  且数量都大于0
				if (muji*3+xiaoji/3+gongji*5==money && gongji>=0 && xiaoji>=0)  {
					i++;
					System.out.println("第"+i+"种情况 ：母鸡有：" + muji + " 公鸡有:" + gongji + " 小鸡有：" + xiaoji);
			}
		}
	}
	public static void main(String[] args) {
           Chicken.print(100, 100);
	}
}