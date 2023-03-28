package com.capgemini.stream.api;
// creating thread using Thread class 
class MyAnotherThread extends Thread{
	public void run() {// i have to override the run method as Class thread
		//implements the Runnable interface
		for(int i = 10; i>=0;i--) {
			System.out.println(i);// if i want to sleep thread for 2 second then i will use 
			try{
				Thread.sleep(2000);// 2 sec 
			}catch(Exception e){
				
			}
		}
	}
}
public class ThreadingDemo3 {

	public static void main(String[] args) {
		MyAnotherThread t = new MyAnotherThread();
		t.start();// as i am extending Thread class so i have start method

	}

}
