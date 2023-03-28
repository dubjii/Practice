package com.capgemini.programingquestions;

import java.util.Scanner;

public class PalindromeNo4 {

	public static void main(String[] args) {
		/*	What is meant by palindrome no?
			A palindromic number is the same number that is read forward and backwards. 
			3663. 100001. 891198. 72911927,121
		  */
		Scanner sc  = new Scanner (System.in);
				System.out.println("enter that no u want to be checked");
				int num = sc.nextInt();
				int rev = 0;
				int temp = num;
				while(num!=0) {
					rev = rev*10+num%10;
					num = num/10;
					
				}
				if(rev == temp) {
					System.out.println("palindrome");
					
				}
				else {
					System.out.println("not palindrome");
				}
	}

}
