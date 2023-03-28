package com.capgemini.arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// two types of array single dimensional(1d) multi dimensional array(2d,3d)Array of Arrays
		// declaration of Array
		// int[] a;(prefered) or int []a; or int a[]; or int[]a;
		//int [] a,b ; here both a and b are array
		// int []a,b;  here both a and b are array
		// int a[],b; a array but b not b simple variable 
		// do not declare size at time of deceleration
		//creation of Array
		//int [] a ;  // decleration
		//a = new int[5];// creation(size must be provided)
		int [] a = new int[5];// Combing both lines 
		int [] b = new int [0];// valid program compiles and run both
		int [] c = new  int [-2];// compile but at run provides NegativeArraySizeException
		// as we create Arrays default values of them is 0 if data type is int and null if data type is String
		// Initialization
		a[0]  = 34;// 34 at index position zero
		// if i do not initialize value at any position then it will be the default one in int 0
		a[6]= 90;//will throw exception ArrayOutOfBound Exception
		//or i can do deceleration creation and initialization at same time 
		int[] d = {1,2,3,4,5}; 
		//or 
		int [] e = new int[] {1,2,3};// it is also valid 
		
		
		
	}

}
