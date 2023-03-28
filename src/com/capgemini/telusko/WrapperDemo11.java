	package com.capgemini.telusko;
		// topic 11
		public class WrapperDemo11 {
			public static void main(String[] args) {
				int i = 5;
				// primitive data type but in opps every things should be with help of object 
				// so instead of int we should use Integer 
				Integer I=  new Integer(i);// wrapper class 
				// here putting primitive variable inside object this is known as boxing(wrapping)  
				//here i and I have same value as 5 but first i is primitive variable 
				// I is reference variable
				System.out.println(I);// output 5 
				int j = I.intValue();// unboxing unwrapping 
				Integer value = i; // auto boxing
				int k = value ; // auto unboxing
				// primitives works faster than the wrapper classes
				String str = "133";
				//int num = str;// wrong way 
				// parseInt() method used to convert string into number 
				// Integer.valueof()return type is object 
				// Integer.parseInt() return type is primitive data type
				
				int num = Integer.parseInt(str);
				// this method converts a string into Integer
				// now it will print 133
				System.out.println(num);
				Float f = 9.8f;
			}

		}
