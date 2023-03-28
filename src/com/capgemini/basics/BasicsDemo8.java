package com.capgemini.basics;

import java.util.Scanner;

public class BasicsDemo8 {

	public static void main(String[] args) {
		// i is row j is column printing 5*5 matrix
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println("");
		}
		// question is to find sum of digit
		// example 1234= 1+2+3+4 = 10
		// using modulo we can do it
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no whos sum you want");
		int num = sc.nextInt();
		int result = 0;
		while (true) {
			
			result =  result + (num%10);
			num = num / 10;
			if (num <=10) {
				break;
			}

		}
			result = result+num;
		System.out.println(result);
	}

}
