package com.capgemini.string;

public class Demo10 {

	public static void main(String[] args) {
		// reverse a string only words 
		// here i have first spited the string before the spaces then stored them into the 
		// string array then traversed the array from back
		
		String name = "My Name is Sachin";
		// we want "Sachin is Name My"
		String arr[]=name.split(" ");
		for(int i=arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i]+" ");
			// remove the spaces in an array
			String str = "Akash Dubey";
			String str1 = " ";
			String [] a= str.split(" ");
			System.out.println(a.length);
//			for(int n =0; n< a.length; n++) {
//				 str1 =a[i]+ str1;
//			}
//			System.out.println(str1);
			
		}

	}

}
