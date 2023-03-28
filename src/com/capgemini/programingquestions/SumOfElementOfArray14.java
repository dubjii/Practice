package com.capgemini.programingquestions;

public class SumOfElementOfArray14 {

	public static void main(String[] args) {
		// sum of element of Array
		int a[] = {5,6,7,8,9,6};
		int sum = 0;
		int add = 0;
		for(int i = 0; i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println(" the sum is :" + sum );
		// using enhanced for loop
		for(int num : a) {
			add = add + num;
		}
		System.out.println(" using enhanched for loop :" + add);
	}
	

}
