package com.capgemini.programingquestions;

import java.util.Scanner;

public class SumOfDigit8 {

	public static void main(String[] args) {
		// do sum of digits example 123 sum = 6
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num!=0) {
			 
			sum = sum+ num%10;
			num = num/10;
			
		}
		System.out.println("sum of digit is : " + sum );
	}

}
