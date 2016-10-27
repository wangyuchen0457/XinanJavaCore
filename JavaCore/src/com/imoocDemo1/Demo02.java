package com.imoocDemo1;

public class Demo02 {// 外部类
	
	public void show() {
		System.out.println("你好!");
	}

	public class Demo002 {// 内部类
		public Demo002(){
			Demo02.this.show();
		}
		public void show() {
			System.out.println("nihao!");
		}
	}

	public static void main(String[] args) {
		Demo02 hello = new Demo02();
		Demo002 hello2 = hello.new Demo002();
		/*hello.show();*/
	}
}