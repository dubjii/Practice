package com.capgemini.practice;
		interface MyFunInterface {
			int doSomeCalculation(int a);
		}
public class Practice23 {

	public static void main(String[] args) {
		MyFunInterface obj = (a)-> {
			int x = a+10;
			x = x/2;
			return x;
			
		};
		int result = obj.doSomeCalculation(100);
		System.out.println(result);
	}

}
