package com.capgemini.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionDemo13 {
	// TreeSet
	// it is an implemented class that implements SortedSet and Navigable set 
	// we can not enter heterogeneous elements here
	// the underlying data structure is balanced tree
	// it is based on balance tree duplicates not allowed and insertion order not preserved 
	//	elements having value less than the root <--root-->elements having value greater than the root
	// first element inserted is root
	//we can insert the null value `but at as first element only 
	// but after inserting null we can not enter anything else it will give null pointer exception
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();// by default constructor
		//TreeSet ts = new TreeSet(Comparator c);
		//in this constructor we can pass object for our way of sorting
		SortedSet s = new TreeSet();
		TreeSet ts1 = new TreeSet(s);// we can pass SortedSet object in TreeSet
		HashSet hs = new HashSet();
		TreeSet ts2 = new TreeSet(hs);
		// try to use generic in treeset 
		// TreeSet ts = new TreeSet(Comparator c);
		// this is used for customized sorting order
		ts.add(10);
		ts.add(56);
		ts.add(2);
		ts.add(90);
		System.out.println(ts);
		
		

	}

}
