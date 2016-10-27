package com.sysDada;

public class Aodi  {
	public int number=1;
	public  String name="奥迪A4";
    public int money=500;
    public int volume=4;
   
	@Override
	public String toString() {
		return   number +".\t " + name + "\t\t" + money + "元/天\t\t载人：" +volume+ "人";
	}
}
