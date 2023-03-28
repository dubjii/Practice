package com.capgemini.stream.api;
// creating threads
// using Runnable interface 
class MyThread implements Runnable{

	@Override
	public void run() {
		
		for(int i =0; i<= 10;i++) {
			System.out.println(i);
			// if i want my thread to sleep for 1 milli second then i will use
			try {
				Thread.sleep(1000);// i have to keep it in try catch block 
			} catch (InterruptedException e) {
				
				
			}
		}
	}
	
}
public class ThreadingDemo2 {

	public static void main(String[] args) {
	// creating object of MyThread
		MyThread t1 = new MyThread();
		// creating object of Thread class as it will be having start method 
		Thread obj = new Thread(t1);
		obj.start();// starting my threading 
	}

}
