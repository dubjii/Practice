package com.capgemini.basics;
	
		// type casting  conversation from one data type to another
		//

public class BasicsDemo1 {
	

	public static void main(String[] args) {
		
			short x = 5;
			int y = x;// implicit type casting short converted to int
			
			System.out.println(y);
			double v2 = 20.0d;
			float v1 = (float)v2;// explicit type casting
			System.out.println(v1);
			String str = " My name is jagruti";
			String arr[] = str.split(" ");
			for(int i = arr.length-1;i>=0; i--) {
				System.out.print(arr[i] + " ");
			}
			
	}
}
