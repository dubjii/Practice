package com.capgemini.programingquestions;

public class ReverseString3 {

	public static void main(String[] args) {
		// reverse a string
		// 1st logic using concatenation operator
		String str = "abcd";
		String rev= "";
		for(int i = str.length()-1; i>=0;i--) {
			rev = rev + str.charAt(i);
		}	
		System.out.println(rev);
		// 2nd logic using character Array
		char [] a = str.toCharArray();// this method will convert the string into character array
		for (int i = a.length-1;i>=0;i--) {
			rev = rev+a[i];
			
		}
		System.out.println(rev);
		// 3rd way using string buffer class 
		// Learning from sDet qa automation techie frequently asked java code
	}

}
