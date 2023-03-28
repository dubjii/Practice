package com.capgemini.programingquestions;

import java.util.Scanner;

public class Factorial13 {

	public static void main(String[] args) {
		// a factorial is a function that multiplies a number by every number below it
		// for example 5! = 5 * 4 *3*2*1 = 120
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int num = sc.nextInt();
		long multi = 1;
		if(num == 0){
			System.out.println("factorical of 0 is 1");
		}
		else {
		
		for (int i =1 ;i<= num;i++) {
			multi = multi*i;
			
		}
		System.out.println(multi);
	}
	}

}
