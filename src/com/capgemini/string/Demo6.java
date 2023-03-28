package com.capgemini.string;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
	// checking palindrome example jahaj ma etc 
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the string u want to check is palindrome or not");
		String str = sc.nextLine();
		String temp = str;
		String rev = "";
		for(int i = str.length()-1;i>= 0;i--) {
			rev = rev + str.charAt(i);
			
		}
		if(rev.equals(temp)) {
			System.out.println("the strings are palindrome ");
		}
		else {
			System.out.println("the strings are not palindrome");
		}
	}

}
