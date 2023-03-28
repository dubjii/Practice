package com.capgemini.basics;

import java.util.Scanner;

public class BasicsDemo6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {// we can write for loop also like for(; ;)
			//this is also valid for loop
			System.out.println(i);
		}
		// que) find no is prime or not
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no u want to check which is prime or not");
		int count = 0 ,v =0;

		int isPrime = sc.nextInt();
		for (int i = 2; i <= (isPrime / 2); i++) {
			if (isPrime % i == 0) {
				count = count + 1;
				break;
			}

		}
		if (count == 0 && isPrime != 1) {
			System.out.println("the no is prime");
		} else {
			System.out.println("no is not prime");
		}
		int x = 1;
		while (x <= 10) {// while loop
			System.out.println(x);
			x++;// increment
		}
			do {
				System.out.println(v);
				v=v+1;
			}
			while(v<=10); // do while loop runs once even if the condition is false but not for other loops
		}
	}


