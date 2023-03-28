package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo9 {
	// set  in set there is no insertion order is preserved no  duplicate value allowed 
	// hashSet the underlying ds is hashtable
	//the hashtable is best for searching operation
	// hashing  is a technique to convert Key value pair into indices  
	// elements in hashset are inserted in form of hashcode value 
	// hashing fastest algorithm for searching even google uses it
	// set do not have own methods so methods of collection interface is used by set
	// f(x) = x%10;
	// when remainder of two things is same then there is a situation this hash collision
	// handelled by channing 
	// at same index no create a linked list then search there
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();// 1st constructor with default capacity 16
		HashSet hs1 = new HashSet(30);// 2nd constructor capacity 30
		// load factor is represents at what level hashmap capacity should change 
		// by default it is 75 % for example if capacity is 100 after 75 a new hashset will 
		// be created with 200 size 
		HashSet hs2 = new HashSet(100, 0.8f);// here after 80 size will be 200 3rd constructor
		ArrayList l = new ArrayList();
		
		HashSet hs4 = new HashSet(l);// 4th constructor 
		hs.add(3);
		hs.add("manish");
		hs.add("rutuja");
				
		System.out.println(hs);
		
	}

}
