package com.capgemini.basics;

public class BasicsDemo14 {
	public static  String greet(String name) {
		String massage = "hello";
		return massage + "  "  + name;
		
		
	}

	public static void main(String[] args) {
	
		String msg = 	greet("Akash Dubey");
		System.out.println(msg);
		

	}

}
