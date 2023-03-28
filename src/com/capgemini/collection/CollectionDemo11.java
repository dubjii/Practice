package com.capgemini.collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionDemo11 {
	//SortedSet interface 
	//soterset(I)--> navigableSet(I)-->Treeset(c)
	// as it is an interface so we can not create its object 
	// so we will use treeSet for creating object 
	// used when some sorting order is required like rollno 
	// ex 101,102,103 etc
	// duplicate not allowed
	// for numbers the by default sorting is acceding order
	//for String the sorting is in alphabetic order
	//sorted set excepts only homogeneous elements as it compares them

	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add(1);
		s.add(7);
		s.add(0); 
		s.add(56);
		s.add(89);
		s.add(9);
		s.add(8);
		System.out.println(s);
		// methods of SortedSet
		// object first();
		System.out.println(s.first());// prints 0 as it is first element
		// last();
		System.out.println(s.last());// it will print 89
		// SortedSet headSet(object,o);
		System.out.println(s.headSet(8));// it will print all the elements before 8 so 0,1,7 
		// SortedSet tailSet(object ,o);
		  System.out.println(s.tailSet(8));// it will print the 8 9 56 89
		// SortedSet headSet(object o , object p);
		  System.out.println(s.subSet(7,56));// it will print 7 8 and 9 it is including 7 also 
		  
		//Comparator comparator();
		  // it returns the sorting order
		  // for this question as it is following natural sorting order so it will return null
		System.out.println(s.comparator());// o/p null
		
	}

}
