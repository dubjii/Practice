package com.capgemini.arrays;

public class StaticUses {
	static int i = 10;
	
	static void display() {
		System.out.println(i);
		//System.out.println(this.i); can not use
		//show(); can not do this
		
	}
	void show() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// static method belongs to class not the object
		// static method can be accessed directly by class name and does not need any object 
		// a static method can access only static data it can not access non static data (instance variable)
		//A static method can call only other static methods and can not call a non static method
		// can no refer to this or super keyword in anyway
	}

}
