package com.capgemini.programingquestions;

public class InttoString23 {

	public static void main(String[] args) {
		//here i have written the code to convert string into int and int into string
		// convert string into int 
		String str = "133";
		//int num = str; wrong way can not do it
		int num = Integer.parseInt(str);
		System.out.println(num);// 133 
		// convert num into string
		int num2 = 123;
		//String str2 = num2; wrong way can not do this
		String str1 = Integer.toString(num2);
		System.out.println(str1);// 123
		String str2 = String.valueOf(num2);
		System.out.println(str2);//123
	}

}
