package com.capgemini.collection;

import java.util.LinkedHashSet;

public class CollectionDemo10 {
		// linked HashSet
		// duplicate not allowed but insertion order is maintained 
		// as it is child of HashSet so all properties of HashSet
		// insertion order is preserved
	
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();// first c initial capacity 16
		LinkedHashSet lhs1 = new LinkedHashSet(30); // second c capacity 30
		LinkedHashSet lhs2 = new LinkedHashSet(123,0.8f);
		// the underlying ds = linkedlist + hash table
		lhs.add("akash");
		lhs.add("manish");
		lhs.add("kunal");
		lhs.add("nitsh");
		System.out.println(lhs);
	}

}
