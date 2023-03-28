package com.cpgemini.pattern;

public class PatternDemo1 {


	public static void main(String[] args) {
		// solve any pattern question with this method
		// way to approach
		// 1 no of lines = no of rows = no of times the outer loop will run
		// 2 identify for every row no how many columns are there
		//type 0f elemnets in the column and ther type it is star or element or what
		// note try to find formula that relates rows and columns
		// what u need to print
		
//		example
//		*
//		* *
//		* * *
//		* * * *
		//print it
		for(int row = 1; row<=4;row++) {
			for(int col = 1 ; col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		
			
		}
		System.out.println("another");
		// print
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		for(int row = 1;row<=5;row ++) {
			for(int col = 1;col<=5;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("another");
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		*
		for(int row = 1; row<=5;row++) {
			for(int col =1; col<=6-row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("another");
		for(int row = 1;row<=5; row++) {
			for(int col = 1; col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
