package com.capgemini.stream.api;

public class ThreadingDemo4 {

	public static void main(String[] args) {
		// life cycle of Thread
		//stop() method is used to terminate the thread execution.
		//Once thread executed is halted by stop() method, start() 
		//function cannot restart the thread execution
		//stop() function has been deprecated in the latest versions of java.	
		// System.exit() this method is used to stop jvm 
		//exit(0) : Generally used to indicate successful termination.
		//exit(1) or exit(-1) or any other non-zero value – 
		//Generally indicates unsuccessful termination.
		// Terminate JVM
		// System.exit(0);
		// Thread Operations 
		// thread class Provides methods to perform operations with threads 
		// The Thread class is Present in java.lang package 
		// public String getName() - returns the name of thread
		// public String setName(String name)- set the name of the thread
		// public void run() - contains the task of the thread
		//public void start()- start thread by allocating resources 
		// public long getId() - returns the id of thread
		// setPriority(p), getPriority() - set and get priority
		// sleep() join() , interrupt(),resume() stop() etc
	}

}
