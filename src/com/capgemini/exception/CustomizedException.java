package com.capgemini.exception;
class UnderAgeException extends Exception{// here as is is extending exception so it is checked exception
	public UnderAgeException(String msg) {
		super(msg);// here super keyword is used to provide description to default exception handler
		
	}
}
	// in case of checked exception the program will only compile when we use try catch or throws
public class CustomizedException {

	public static void main(String[] args) {
		// how we can create our own exception class 
		// parent class of all classes in java is object class 
		// we can either create checked exception or unchecked exception
		// throwable class is parent class of exception 
		// if we want our exception class to be checked  one then we have to inherit the exception class
		// if we want our exception class to be unchecked  one then we have to inherit the Runtime exception class
		int age = 17;
		try {
		if(age <18 ) {
			throw new  UnderAgeException("you can not vote");
		}
		else {
			System.out.println("u can ");
		}
		}
		catch( UnderAgeException e) {
			System.out.println(e);
		}
	}
}

