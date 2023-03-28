package com.capgemini;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the vlaue whose factorial you want");
		int num = sc.nextInt();
		int fact= 1;
		do {
			fact = fact*num;
			num--;
		}
		while(num>1);
		System.out.println(fact);
	}
		

}
