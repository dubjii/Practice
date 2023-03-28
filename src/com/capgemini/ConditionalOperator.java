package com.capgemini;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a =5;
		int b =7;
		int max = a>b ? a:b;// conditional operator
		// condition ? true value : false value
		System.out.println(max);// output is 7
				// && and || they perform right side operation only when
		//left side operation is true(&&) for || false
	}

}
