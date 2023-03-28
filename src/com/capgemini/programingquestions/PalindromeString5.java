package com.capgemini.programingquestions;

import java.util.Scanner;

public class PalindromeString5 {

	public static void main(String[] args) {
		// example mam , madam , mom
		Scanner sc = new Scanner(System.in)	;
			System.out.println("enter the string");
			String str = sc.nextLine();
			String org_string = str;
			String rev = "";
			
			for (int i = str.length()-1;i>=0;i--) {
				rev = rev+str.charAt(i);
				
			}
			if(rev.equals(org_string)) {
				System.out.println("palindrome");
			}
			
			else {
				System.out.println("not palindrome");
			}
	}

}
