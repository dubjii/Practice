package com.capgemini.programingquestions;

import java.util.Scanner;

public class NoOfDigits6 {

	public static void main(String[] args) {
	// no of digits in a no example 1234 op is 4
		Scanner sc  = new Scanner (System.in);
		System.out.println("enter that no u want to be checked");
		int num = sc.nextInt();
	
		int count=0;
		while(num!=0) {
			num = num/10;// 121/10 12 12/10 1 1/`0 0
			 count= count+1;// 1 2 3
			 
			 
		}
		System.out.println(count);
	}

}
