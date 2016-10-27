package com.sysDada;

public class Song {
	public int number=5;
	public  String name="松花江";
    public int money=400;
    public int volume2=4;
	@Override
	public String toString() {
		return number + ".\t " + name + "\t\t" + money + "元/天\t\t载货：" + volume2 + "吨";
	}
}
