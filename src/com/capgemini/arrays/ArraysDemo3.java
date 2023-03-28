package com.capgemini.arrays;

public class ArraysDemo3 {

	public static void main(String[] args) {
	// Retrieval of Array elements
		int [] a = {10,20,30};
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		// by using for each loop
		for(int i :a) {
			System.out.println("here i am using for each loop to print the Array");
			System.out.println(i);
		}
	}

}
