package com.capgemini.string;

public class Demo5 {

	public static void main(String[] args) {
		// program to reverse a string 
		String name = "akash";
		// here length is 5 and index no is 4 so used length-1
		
		// here taking empty string so the i can store the value here 
		String reverse = "";
		for(int i = name.length()-1;i>=0;i--) {
			reverse = reverse +name.charAt(i);
		}
		
		System.out.println(reverse);

	}

}
