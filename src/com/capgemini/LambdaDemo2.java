package com.capgemini;
@FunctionalInterface

public interface LambdaDemo2 {
	
	public abstract void sayHello();
		
 
  public static void main(String[] args) {
			 //creating a class LambdaDemo2Imp to implement its interface
	//second way to use it by creating anonymous class as i have already studies 
	/* Anonymous class way 
	  LambdaDemo2 obj = new LambdaDemo2() {
				
				@Override
				public void sayHello() {
					System.out.println("learning lambda using anonymous class");
				}
			};*/
			// using or interface with help of lambda
	 LambdaDemo2 obj =()->System.out.println("i am using lambda for first time it is good");
	 
	 obj.sayHello();
	}
}

