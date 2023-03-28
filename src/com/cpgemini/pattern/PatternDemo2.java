package com.cpgemini.pattern;

public class PatternDemo2 {

	public static void main(String[] args) {
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		for(int row = 1; row<= 5; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row= 1;row <=4; row++) {
			for(int col = 1; col<=5-row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("another");
		for(int row = 1; row<=5; row++) {
			for(int col = 1; col<=5; col++) {
				if(col<=5-row) {
				System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}