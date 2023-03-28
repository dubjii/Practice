package com.capgemini.stream.api;
class Producer extends Thread{
	Company c;
	Producer(Company c){
		this.c = c;
		
	}
	public void run() {
		int i =1;
		while(i<10) {
			this.c.produce_item(i);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				
			}
			i++;
		}
		
	}
	
}
public class ThreadingDemo8 {

	public static void main(String[] args) {
		

	}

}
