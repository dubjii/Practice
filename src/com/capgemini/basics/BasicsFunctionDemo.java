package com.capgemini.basics;

import java.util.Scanner;

public class BasicsFunctionDemo {

	public static void main(String[] args) {
		
			//sum(); //here it is a method call
		// when the execution of sum program is over there will be some value
		//int ans= sum2();
		//System.out.println(ans);
		String greeting = greet();
		System.out.println(greeting);
	}
	// access modifier return type method name(arguments) {
	// body
	// return statement;
	//} 
	// here is method which can do sum of two numbers
//	 static public void sum() {// the things inside the bracket of method is parameters
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the first number");
//		int num1 = sc.nextInt();
//		System.out.println("enter the second  number");
//		int num2 = sc.nextInt();
//		int result = num1 +num2;
//		System.out.println(result);
//}
//	public static int sum2() {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the first number");
//	int num1 = sc.nextInt();
//	System.out.println("enter the second  number");
//	int num2 = sc.nextInt();
//	int result = num1 +num2;
//	return result;
	// after return if i write any code that line of code is basically unreachable
	// method call over after return statement
		//}
	public static String greet() {
		String massage = "hi how are you";
		return massage;
		
	}
}
