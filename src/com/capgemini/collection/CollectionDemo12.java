package com.capgemini.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class CollectionDemo12 {
	// NavigableSEt

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<Integer>();// generics integer type 
		ns.add(1000);
		ns.add(2000); 
		ns.add(67);
		ns.add(1500);
		System.out.println(ns);
		// methods floor(element)
		// returns the closest element from bottom If none then null
		System.out.println(ns.floor(1555));// here 1500 output
		System.out.println(ns.lower(1500)); // output is 1000
		System.out.println(ns.ceiling(65)); // output 67
		System.out.println(ns.higher(1000));//  output 1500
		System.out.println(ns.pollFirst());
		// it will remove the first element from NavigableSet and returns that element
		System.out.println(ns);
		System.out.println(ns.pollLast());
		// it will remove the last element from NavigableSet and returns that element
		System.out.println(ns);
		System.out.println(ns.descendingSet());
		// prints the NavigableSet in descending order
	}

}
