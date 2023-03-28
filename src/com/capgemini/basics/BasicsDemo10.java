package com.capgemini.basics;

public class BasicsDemo10 {

	public static void main(String[] args) {
		
			System.out.println(area(5.7, 9.0));// here calling the float method
			System.out.println(area(9, 8));// here calling the int method
			
	}
	public static double area(double length,double width) {
		return length*width;
		// here we have to methods of same name  this is known as methodOverloading this takes place in 
		// in a single class only here we have changed the data types of parameter 
		//we can not overload a method by 
		// changing  the return data type
		//Method overloading cannot be done by changing the return type of methods
		
		
	}
	public static int area(int length,int width) {
		return length*width;
	}

}
