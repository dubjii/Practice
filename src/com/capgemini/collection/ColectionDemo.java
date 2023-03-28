 package com.capgemini.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* in arrays we can store both primitive and non primitive data but in collection framework only n.p data
 * array homogeneous only c.f both 
 * array size fixed c.f size growable
 * collection framework is an API(Application programming interface)
     collection  it is a single entity or object which can store multiple data it is a interface
     interface ,interface extends each other
     framework  represents the library(who have predefined classes and library)
     c.f-> it is set of predefined classes and interfaces which is used to store multiple data
     c.f contains collection and map in collection direct store data in map in key value pair 
     */// get method is used to get the elements from a list using its index no
	// in tree set and tree map heterogeneous object not allowed in collection interface 
	// in arraylist once size is full new array is created of double size
	// first elements present in previous array is added to new array then new elements is added
	// when we remove data from arrayList internal shifting is happening so not good for deletion operation 

	
public class ColectionDemo {
		 
	public static void main(String[] args) {
		ArrayList al = new ArrayList();// here i have created object of arraylist class(collection object)
		al.add("akash");
		
		al.add(10);// here 10 is integer not int study warper class
		al.add('C');
		HashSet h = new HashSet();//object of hashset this is a (collection object)
		h.add("manish");
		List l = new ArrayList();// creating object of ArrayList using reference of list
		HashMap  hm = new HashMap();// creating object of hashmap
		hm.put(101, "rahul");// storing data in key value pair
		System.out.println(al);
		
		System.out.println(hm);
		
		
	}

}
