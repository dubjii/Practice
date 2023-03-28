package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo14 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		//List l1 = List.of(8,56,67,9,10,23);
		// it is also a way of creating list but this list is immutable 
		// here i have created a collection of generic integer
		l.add(12);
		l.add(34);
		l.add(9);
		l.add(90);
		l.add(78);
		System.out.println(l);//
		//here i have printed the order in insertion order
		// sorting the numbers
		Collections.sort(l);
		System.out.println(l);
		// this line will sort the ArrayList in proper acceding order
		Collections.sort(l,Collections.reverseOrder());// used to sort in reverse order
		
		
		System.out.println(l);
		System.out.println("using streams");
		l.stream().sorted(Comparator.reverseOrder()).forEach(e-> System.out.println(e));
		System.out.println("printing normal order using stream");
		l.stream().sorted().forEach(System.out::println);
		
		
		
		// here the game of  sorting is easy as it contains only numbers 
		// if it was collection of object the what will happen there we will use 
		// Comparable and Comparator to sort the collection 
		// that we will do it demo 15
		
		
		
	}

}
