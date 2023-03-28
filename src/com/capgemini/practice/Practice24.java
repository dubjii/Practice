package com.capgemini.practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


	

 public class Practice24{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the strinng u want");
	String str = sc.nextLine();
	String arr[] = str.split(" ");
	
	String rev = " ";
	
	for(int i = arr.length-1; i>=0; i--) {
		rev = rev +arr[i];
	}
	System.out.println(rev);
}
}