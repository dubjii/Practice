package com.capgemini.basics;

public class BasicsFunctionDemo2 {

	public static void main(String[] args) {
		// pass the value of numbers when calling the method
		// we do that using parameters
			int value = sum(8,9);
			System.out.println(value);
			String str = "akash";
			System.out.println(str);
			str = "kunal";
			System.out.println(str);
	}
		public static int sum(int a , int b) {
			// we have to pass the value in the order of deceleration
		int result = a+b;
		return result;
		}
}
