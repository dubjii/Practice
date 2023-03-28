package com.capgemini.programingquestions;

public class MaxAndMinValueInArray18 {

	public static void main(String[] args) {
		// find min amd max value of the array
		int[] a = {50,30,40,20,60};
//		int max = a[0];
//		for(int i = 1; i<a.length; i++) {
//			if(a[i]> max) {
//				max= a[i];
//			}
//		}
		
		//System.out.println(max);
		int min = a[0];
		for(int i = 1; i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

}
