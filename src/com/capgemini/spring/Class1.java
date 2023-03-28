package com.capgemini.spring;

public class Class1 {
	// spring it is a dependency injection framework to make java application loosely coupled
	//spring framework makes the easy development of javaEE application
	// most popular framework 
	// by rod johnshon in 2003
	// most imp topic 
	/*what is dependency injection
	 * it is a design pattern 
	 * when  one class depends on other class for doing there work that is dependency 
	 * ex
	 * class Ramu{								class Geeta{
	 *  geeta ob ;									public void doWrk(){
	 *  public void doWork(){								}
	 *  }													}
	 *  }
	 *  here Ramu class depends on Geeta class to do its work 
	 * if we create object of geeta and provide it to Ramu that is tight coupling 
	 *when spring frame work does it for us that is lose coupling 
	 *that is known as dependency injection 
	 *spring will inject the object of geeta in ob 
	 *this whole process (technique is known as 
	 *Inversion of control (IOC)
	 *spring will create object of class at runtime  and will inject it that is ioc
	 * 
	 * 			layers in project
	 * 	UI LAYER ->  BUSINESS LAYER ->   DATA ACCESS LAYER ->    DB 
	 * 
	 * 		PRODUCT CONTROLLER ----> PRODUCT SERVICE -----> PRODUCTDAO 			
	 * 			(CLASS)						(CLASS)				(CLASS)
	 * 	here object will be created and injected with  help of spring 
	 * other use full tools
	 * spring jdbc
	 * spring orm 
	 * spring mvc 
	 * spring security 
	 * 
	 * */
	public static void main(String[] args) {
		
	}

}
