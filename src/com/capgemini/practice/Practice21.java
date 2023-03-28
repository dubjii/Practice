package com.capgemini.practice;
@FunctionalInterface
		interface A21{
			void add(int a, int b);
			
		}
public class Practice21 {

	public static void main(String[] args) {
		A21 obj = ( a,b)-> 
		System.out.println("the sum is .... " + (a+b));
		obj.add(12, 13);
	
	}
}
