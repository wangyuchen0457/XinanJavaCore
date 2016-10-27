package com.sysDada;

public class Mazida {
	public int number=2;
	public  String name="马自达6";
    public int money=400;
    public int volume=4;
	@Override
	public String toString() {
		return number + ".\t " + name + "\t\t" + money + "元/天\t\t载人：" + volume + "人";
	}
}
