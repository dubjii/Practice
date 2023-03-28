package com.capgemini.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public   class Practice1 {
	
	public static void main(String[] args) {
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the size of array");
//	int size = sc.nextInt();
//	int arr[] = new int[size];
//	for(int i =0; i< arr.length; i++) {
//		Scanner s = new Scanner(System.in);
//		System.out.println(" enter the " + i+ "th element");
//		arr[i] = s.nextInt();
//		
//	}
//	for(int k: arr) {
//		System.out.println(k);
//	}
	  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
	 int  l =  myList.stream().max(Integer:: compare).get();
	 System.out.println(l);
	 int m = myList.stream().min(Integer::compare).get();
	 System.out.println(m);
	}
}
