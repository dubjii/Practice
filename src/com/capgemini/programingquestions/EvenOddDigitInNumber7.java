package com.capgemini.programingquestions;

import java.util.Scanner;

public class EvenOddDigitInNumber7 {

	public static void main(String[] args) {
		// no of even and odd digits in a number example 1234 even 2 odd 2
		Scanner sc  = new Scanner (System.in);
		System.out.println("enter that no u want to be checked");
		int num = sc.nextInt();
		int even =0;
		int odd = 0;
		while(num!=0) { // 1234 
			int temp = num;
			 temp=num%10;
			if(temp%2 ==0 ) {
				even = even+1;
			}
			else {
				odd = odd+1;
			}
			num = num/10;
		}
		System.out.println("even no:" + even);
		System.out.println("odd no " + odd);
	}

}
