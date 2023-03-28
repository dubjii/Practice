package com.capgemini.arrays;

public class ArraysDemo4 {

	public static void main(String[] args) {
		// Anonymous Array Array without name just for creating and using instantly 
		// new int[]{10,20,30};Anonymous Array(can be sigle and multi both dimensional)
		// we can pass Anonymous Array as an argument in an method  
		ArraysDemo4.sum(new int[] {10,20,30});
		
	}
	static void sum(int[] no) {
		int total = 0;
		for(int i :no) {
			total = total+i;
		}
		System.out.println(total);
	}

}
