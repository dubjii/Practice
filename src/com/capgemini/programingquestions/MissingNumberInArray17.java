package com.capgemini.programingquestions;

public class MissingNumberInArray17 {

	public static void main(String[] args) {
		// to find missing no in array there should be no duplicate no in array
		// there is no need to array be in sorted order
		// these vlaues must be in some range
		// here example from 1 to 5
		// first find sum of elements of array 12 sum1
		// sum of all the values including missing no 15 sum2
		int [] a = {1,2,4,5};
		int sum1 = 0;
		for(int i = 0; i<a.length;i++) {
			sum1 = sum1+a[i];
		}
		int sum2 = 0;
		for(int i = 1; i<= 5; i++) {
			sum2 = sum2+i;
		}
		int missing_no = sum2- sum1;
		System.out.println(missing_no);
	}

}
