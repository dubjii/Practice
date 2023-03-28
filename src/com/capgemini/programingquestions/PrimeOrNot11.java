package com.capgemini.programingquestions;

import java.util.Scanner;

public class PrimeOrNot11 {

	public static void main(String[] args) {
		// prime no any natural no which have only 2 factors 1 and itself is prime 
		// example 13 19 
		//1 is neither prime nor composite
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int num = sc.nextInt();
		int count = 1;
		if(num>1) {
			for(int i = 2;i<= num;i++) {
				if(num%i==0) {
					count = count+1;
				}
			}
			if(count==2) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
				
			}
		}
		else {
			System.out.println("not prime");
		}

	}

}
