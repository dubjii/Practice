package com.capgemini.stream.api;
// topic synchronization see demo 7 and 8 together 
// making threads synchronized
//we will use synchronized keyword to make a process (method synchronized)
// here we done with synchronization but no inter thread communication 
// for that demo 8
class Company{
	int n ;
	
	synchronized public void produce_item(int n) {
		this.n = n;
		System.out.println("produced :" +this.n );
	}
	synchronized public int consume_item() {
		System.out.println("consumed :" +this.n);
		return this.n;
		
	}
}
public class ThreadingDemo7 {

	public static void main(String[] args) {
		

	}

}
