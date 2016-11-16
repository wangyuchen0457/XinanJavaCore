package com.ddb.javacore.thread;

public class ThreadRunableDemo {

	public static void main(String[] args) {
		Thread myThread = new MyThread(); 
		myThread.setName("MyThread");
		Thread thread = Thread.currentThread();
		Thread myRunable = new Thread(new MyRunable());
		myRunable.setName("MyRunable");
		System.out.println("thread.getId()"+thread.getId());
		myThread.start();
		System.out.println("myThread.getId"+myThread.getId());
		myRunable.start();
		System.out.println("myRunable.getId"+myRunable.getId());
	}

}
