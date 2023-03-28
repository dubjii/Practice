		package com.capgemini.exception;
		public class ExceptionDemo3 {// methods to print exception in java 
			public static void main(String[] args) {
		try {
		int a = 100, b = 0,c ;
		c = a/b;
		System.out.println("c");
		}
		catch(Exception e) {
			e.printStackTrace();// prints every thing
			System.out.println("1");
			System.out.println(e);// exception  name and description
			System.out.println("2");
			System.out.println(e.getMessage());// Description prints
			System.out.println("3");
		}
	}

}
