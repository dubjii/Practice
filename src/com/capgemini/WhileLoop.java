package com.capgemini;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the vlaue whose factorial you want");
		int num = sc.nextInt();// taking number as input from keyword

		Scanner s = new Scanner(System.in) ;
	
		System.out.println("enter the string pls");
		String str = s.nextLine();// taking string as input from keyword
		System.out.println(str);
		
		int fact= 1;
		while (num>1) {
		fact= fact*num;
		num--;
		}
		System.out.println(fact);
	}

}
