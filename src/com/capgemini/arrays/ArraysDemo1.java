package com.capgemini.arrays;

import java.util.Scanner;

// Array is collection of homogeneous data types 
// index value in array start from 0 
// Array is an object in java as it is taking the new keyword so
// super class of Array is object class 
// array occupies memory in heap memory 
// all object in java stores in heap memory
// we can even store object in Array
// Array is not good for insertion and deletion operation

public class ArraysDemo1 {

	public static void main(String[] args) {
		int a = 8;
		int b= 9;
		
		int [] x = new int [1000];// here i have declared an array having size of 1000
		// here it can store 1000 int value homogeneous only and 
		//can not increase and decrease size of array at runtime
		// collection of homogeneous array
		// index starts from 0 goes to (n-1) here n is size of array
		//as new keyword used to create object so here we are creating array object
		// we have to provide length if we do not we will get error
		int [] y = new int [0];// size 0 possible
		int [ ]z = new int ['a'];// Possible converts char to its asci value here size is 97 
		// taking array as input from user
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		size= sc.nextInt();
		int [] arr = new int[size];
		for(int i =0; i<size; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the " + i+"th " + "element");
			arr[i]= s.nextInt();
		}
		for(int k: arr) {
			System.out.println(k);
		}
	}

}
