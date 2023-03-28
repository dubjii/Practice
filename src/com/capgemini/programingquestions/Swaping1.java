package com.capgemini.programingquestions;

public class Swaping1 {

	public static void main(String[] args) {
	// Swaping means interchanging the no 
		int a = 10;
		int b = 20;
//		System.out.println("before swaping values are " + "a =" +a + "b = "  +b);
//		// logic 1 third variable 
//		int temp ;
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println("after swaping values are " + "a =" +a + "b = "  +b);
//		// logic 2 + and - operator
//		//without using third variable
//		a = a+b;// 30
//		b = a-b;// 30-20
//		a = a-b;// 30-10
//		System.out.println("after swaping values are " + "a =" +a + "b = "  +b);
		// third logic single statement
		b = a=b-(a=b);
		
//		
	}

}
