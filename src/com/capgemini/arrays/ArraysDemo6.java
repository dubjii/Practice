package com.capgemini.arrays;
// bubble sort
public class ArraysDemo6 {

	public static void main(String[] args) {
		// sorting is the process of arranging the data in some logical order in case of numeric values
		// logical order may be in ascending order or descending order 
		// in case of alphanumeric values it can be dictionary order 
		/*Bubble sort also refereed as sinking sort is a comparison  based algorithm
		 *  i.e Comparing each pair of adjacent items and swaping them if they are in wrong order
		 *  the pass through the list is repeated until no swaps are 
		 *  needed which indicates that the list is sorted 
		 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements 
		 * if they are in the wrong order. This algorithm is not suitable for large data sets as its 
		 * average and worst-case time complexity is quite high.
		 *no of rounds is (no of values in list-1)
		 * */
		int [] a = {36,19,29,12,5};
		int temp;
	
		
		for(int i = 0; i<a.length;i++) {
			int flag =0;
			for(int j= 0;j< a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					// for string
					// if(a[j] .compareTo(a[j+1]>0)
					temp = a[j];
					a[j]= a[j+1];
					a[j+1] = temp;
					flag = 1;
				}
			}
			if(flag ==0) {
				break;
		}
		
		}
		
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
