package com.capgemini.basics;

public class BasicsDemo {
			// how java works
		//												interpreter
		/*  .java file -- -------> .class file(byte code)-------------> machine code(0,1)
		 *            compiler 							line by line 
		 * the source code will not directly run on a system we need jvm to run this 
		 * Because of jvm java is platform independent 
		 * byte code can run on all operating systems
		 * 
		 * 
		 *  
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
	public static void main(String[] args) {// main method is entry point of java code
		int max =2147483647 ;
		int min = -2147483648;
		short shortMax =32767 ;
		short shortMin  =-32768 ;
		long longmax = 9223372036854775807L;
		long longMin = -9223372036854775808l;
		byte byteMax = 127;
		byte byteMin = -128;
		int value1 = 9;
		float value2 = 10f/6f;
		double value3 = 10d/6d;// precision in double is more than float
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		boolean var = true;// it only contains true and false
		System.out.println(var);
		char c = 'a';
		System.out.println(c);
		String str = "hello world";
		System.out.println(str);
		
		String str1 = new String("hello world yo");// proper way to declare string 
		System.out.println(str1);
		int a = 10;
		
		a = 5;
		int b = a;
		System.out.println(b);
		
	}

}
