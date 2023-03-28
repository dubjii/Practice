package com.capgemini.java8;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

public class Demo10 {
	Object
public static void main(String[] args) {
	String [] arr = {"1","2","5","10","13"};
	int max = 0  ;
	int count = 1;
	int [] arrr =  new int [arr.length];
	for(int i =0; i<= arr.length-1; i++) {
	
		arrr[i] = Integer.parseInt(arr[i]);
		 max = arrr[arr.length-1];
	}
	
	
	
	System.out.println(max);
	for(int k: arrr) {
	for(int i = 1; i<=max; i++) {
		 	while(k>=i)
			if(k%i!=0) {
				System.out.println(k);
			}
		
		 	
	}
		
		
	
			
	}
}
}
