package com.capgemini.basics;

import java.util.Scanner;

public class BasicsDemo13 {

	public static void main(String[] args) {
	// print the largest no
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the all 3 no");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
			max = a;
			if (max > b) {
				System.out.println(max);
			}
			else if(b>c) {
				System.out.println(b);
				
			}
			 
			
			else {
				System.out.println(c);
				
			}
		

	}

}
