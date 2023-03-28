package com.capgemini.programingquestions;

public class FibonacciSeries10 {
public static void main(String [] args) {
	// fibonacci series a series of number (fibonacci number)in which each number is sum of two preceding numbers
	// 0 1 1 2 3 5 8 13 21 .....
	int n1 = 0,n2 = 1, sum =0;
	System.out.print(n1 + "   " + n2 );
	for(int i = 2; i<=10; i++) {
		sum =n1+n2;
		System.out.print(" "+sum);
		n1 = n2;
		n2 = sum ;
	}
	
	
}
}
