package com.capgemini.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Practice33 {

	public static void main(String[] args) {
		List l = Arrays.asList(1,2,3,2,3);
		
		HashSet hs = new HashSet();
		 boolean flag;
		
		HashSet hs1 = new HashSet();
		for(Object i: l) {
			 flag = hs1.add(i);
			 
			if(flag == false) {
				System.out.println(i);
			}
		}
		
	}

}
