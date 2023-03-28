package com.capgemini.programingquestions;

import java.util.Arrays;

public class EqualityOfTwoArrays16 {

	public static void main(String[] args) {
		// here i am going to check two arrays are equal or not
		int[] a = {1,2,3,4,5};
		int [] b = {1,2,3,4,5,6};
		// by using equals method of array class
//		boolean result=	Arrays.equals(a, b);
//		System.out.println(result);
//		if(result) {
//			System.out.println("both arrays are equal");
//		}
//		else {
//			System.out.println("not equal");
//		}
				
		// without using equals method of Arrays class
		// first the length of both arrays must be same
		 boolean status = true;
		if(a.length ==b.length) {
			for(int i =0 ; i<a.length;i++) {
				if(a[i] !=b[i]) {
				status = false;
				}
			}
		}
		else {
			status =  false;
		}
		if(status == true) {
			
			System.out.println("arrays are equal");
		}
		else {
			System.out.println("arrays are not equal");
		}
		}

	}


