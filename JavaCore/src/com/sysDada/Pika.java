package com.sysDada;

public class Pika {
	public int number=3;
	public  String name="皮卡雪6";
    public int money=450;
    public int volume1=4;
    public int volume2=2;
	@Override
	public String toString() {
		return number + ".\t " + name+ "\t\t" + money + "元/天\t\t载人：" + volume1 + "人,载重:"+volume2+"吨";
	}
    
}
