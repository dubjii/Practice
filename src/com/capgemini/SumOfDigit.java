package com.capgemini;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no sum you want");
		int num = sc.nextInt();
		int result=0;
		//1234
		while(num >10) {
		result = (num%10)+result;
		num = num/10;
		}
		result = result+num;
		System.out.println(result);
		
		}

}
