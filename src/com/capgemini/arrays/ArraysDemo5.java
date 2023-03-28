package com.capgemini.arrays;

public class ArraysDemo5 {

	public static void main(String[] args) {
		// printing the elements of Array
		// 4 ways
		int a [] = {10,20,30};
		for(int i = 0;i< a.length;i++) {
			System.out.println(a[i]);
		}for(int i :a) {
			System.out.println(i);
		}
		int  i =0;
		
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
			
		}
	}

}
