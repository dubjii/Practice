package com.capgemini.programingquestions;

import java.util.Scanner;

public class EvenAndOddNoArray15 {

	public static void main(String[] args) {
		// finding the even and odd no from an array
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i = 0;i<a.length;i++) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("enter the"+ i+"th"+ "no");
			a[i] = s.nextInt();
			
		}
		for(int num :a) {
			if(num%2==0) {
				System.out.println("even no");
				System.out.println(num);
			}
			else {
				System.out.println("odd no");
				System.out.println(num);
			}
			
		}
		
		
	}


}
