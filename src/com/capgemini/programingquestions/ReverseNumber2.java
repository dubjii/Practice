package com.capgemini.programingquestions;

import java.util.Scanner;

public class ReverseNumber2 {

	public static void main(String[] args) {
		// i have to reverse a number example 1234 to 4321
		// logic one
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int num = sc.nextInt();
		int rev = 0;
		
		// using algorithm
		while(num!=0) {
			rev = rev*10+num%10; // 0+1234%10 = 4  40+3 = 43 430+ 2 = 432 4320+1 = 4321
			num = num/10; // 1234 /10 = 123 123/10 = 12 12/10= 1 1/10 = 0
		}
		System.out.println(rev);
		// 2nd logic 
		// using StringBuffer class
		StringBuffer sb = new StringBuffer(String.valueOf(num));// here op is 0 as no has been 0 from above code 
		StringBuffer temp  = sb.reverse();
		System.out.println(temp);
		// 3rd logic same as 2nd method using StringBuilder class and append method 
	}

}
