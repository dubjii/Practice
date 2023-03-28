package com.capgemini.programingquestions;

import java.util.HashSet;

public class DuplicteElementInArray19 {

	public static void main(String[] args) {
		// in this array i have to find the duplicate elements if found then msg if not found then also msg
		
	 int[] a = { 1,2,3,4,5,5};
	 boolean flag = false;
	 boolean flag1 = true;
	 
	 for(int i =0; i<a.length; i++) {
		 
		 for(int j = i+1; j<a.length;j++) {
			 if( a[i]== a[j]) {
			 System.out.println("found duplicate element " + a[i]);
			 flag = true;
			 }
		 }
	 }
	 if(flag == false) {
		 System.out.println("there is no duplicate element");
	 }
	 	// second way using hashSet as hashSet does not contain duplicate elements
	 	HashSet<Integer> hs = new HashSet<>();
	 	for(int num: a) {
	 		 flag1 =hs.add(num);
	 	}
	 	if(flag1 == false) {
	 		System.out.println("duplicate found");
	 	}
	 	else {
	 		System.out.println("no duplicate");
	 	}
	}

}
