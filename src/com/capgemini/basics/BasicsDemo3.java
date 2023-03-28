package com.capgemini.basics;

public class BasicsDemo3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int i = 5;
		int max = a > b ? a : b;// conditional operator(ternary operator)
		// condition ? true value : false value
		System.out.println(max);// output is 7
		// && and || they perform right side operation only when
		// left side operation is true(&&) for || false
		i += 5;// i= i+5;
		System.out.println(i);// 10
		i -= 5; // i = i-5;
		System.out.println(i);
		i *= 5; // i=i*5
		System.out.println(i);
	}

}
