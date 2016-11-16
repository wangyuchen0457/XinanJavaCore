package com.demo;

class ThreadDemo {

	public static void main(String[] args)  {
       Thread testThread=Thread.currentThread();
    new TestThread().start();
          
       System.out.println(testThread.toString());
       
    		   for(int i=0;i<5;++i){
        	System.out.println("main 线程在运行");
        	System.out.println(Thread.activeCount());
//        	System.out.println(Thread.currentThread()); 
        	try { 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
	}
}
 class TestThread  extends Thread {
	 public void run(){
		 for(int i=0;i<5;++i){
			 System.out.println("TestThread在运行");
			// System.out.println(MAX_PRIORITY+"---"+MIN_PRIORITY);
			 System.out.println(Thread.activeCount());
			 System.out.println();
				try {
					Thread.sleep(1000);
					//Thread.yield();
					System.out.println(Thread.currentThread());  
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		 }
	 }
	 
 }