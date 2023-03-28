package com.capgemini.collection;

import java.util.Hashtable;

// Linked HashMap child class of HashMap 
		// it is exactly same as hashmap (Including method and constructor)
		//except the  following differences 
		// In hm the under lying ds is hashtable 
		// in lhm the under lying ds is Linked list +HashTable
		// in hm the insertion order is not preserved and it is based on Hashcode of keys 
		// in lhm the insertion order is preserved 
		
public class CollectionDemo22 {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		// in hashtable we can not put null as key or value
		ht.put(null, 102);
		ht.put(2, null);
		// both not allowed
		
	}

}
