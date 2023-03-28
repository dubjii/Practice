package com.capgemini.practice;
		interface A22{
			int findLength(String str);
		}
public class Practice22 {

	public static void main(String[] args) {
		A22 obj = (str ) -> str.length();
			System.out.println(obj.findLength("akash dubey"));
	}

}
