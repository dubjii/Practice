package com.cpgemini.pattern;

import java.util.Scanner;

public class PatternDemo3 {

	public static void main(String[] args) {
		//1
		//1 2
		//1 2 3
		//1 2 3 4
		//1 2 3 4 5
		for(int row = 1; row<=5; row++) {
			for(int col =1 ; col<=row; col++ ) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
//		      *
//			 * *
//		    * * *
//		   * * * *
//		  * * * * *
//		   * * * *
//		    * * *
//		     * *
//		      *
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of u want");
		int n = sc.nextInt();
		for(int row = 1; row <= n; row++) {
			for( int col = 1 ; col<= n-row ; col++) {
				
					System.out.print(" ");
				}
			for( int col = 1; col <= row; col++ ) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
		for(int row = 1; row<=n-1; row++) {
			for(int col = 1; col <=row; col++) {
				System.out.print(" ");
			}
			for( int col = 1; col<=n-row; col++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	
	}

}
