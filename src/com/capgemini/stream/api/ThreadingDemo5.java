package com.capgemini.stream.api;
class ThreadOp extends Thread{

	@Override
	public void run() {
		System.out.println("this is user defined thread");
		
	}
	
}
public class ThreadingDemo5 {

	public static void main(String[] args) {
		// whenever there is main method working then it is also known as  main thread working
		System.out.println("program strated");
		// going to start  user defined thread 
		ThreadOp t = new ThreadOp();
		t.start();
		
		
		
		
		
		
		
		System.out.println("progam endded");

	}

}
