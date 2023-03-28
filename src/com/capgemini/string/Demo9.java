package com.capgemini.string;

public class Demo9 {

	public static void main(String[] args) {
	String str = " my    name   is akash  dubey";
	String[] str1 = str.split(" ");
		
		for(int i =0; i<=str1.length-1; i++) {
			if(str1[i]!= " ") {
			System.out.print(str1[i]);
			}
		}
	
	}
}
