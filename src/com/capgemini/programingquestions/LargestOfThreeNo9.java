package com.capgemini.programingquestions;

import java.util.Scanner;

public class LargestOfThreeNo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter the first no");
	int num1 = sc.nextInt();
	System.out.println("enter the second  no");
	int num2 = sc.nextInt();
	System.out.println("enter the third no");
	int num3 = sc.nextInt();
	//The key difference between && and & operators is that && supports short-circuit evaluations 
	//while & operator does not.Another difference is that && will evaluate
	// the expression exp1, and immediately return a false value if exp1 is false.
	
	// 1st logic
	if(num1>num2 &num1 >num3 ) {
		System.out.println(num1);		
	}
	else if (num2 > num1 & num2 > num3) {
		System.out.println(num2);
		
	}
	else {
		System.out.println(num3);
	}
		// 2nd logic by ternary operator 
	// variable = Expression1 ? Expression2: Expression3
	int largest = num1>num2? num1:num2;
	largest = largest>num3 ? largest:num3;
	System.out.println("largest no is: "+ largest);
	}

}
