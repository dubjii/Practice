package com.capgemini.collection;

import java.util.ArrayList;

public class CollectionDemo5 {
	// syntax class ArrayList implements List{
	// constructors
	//methods
    //} ArrayList is basically growable array
	// index based d.s
	// non homogeneous data types store  duplicate allowed  follows insertion order(first go first out)
	// non synchronized
	public static void main(String[] args) {
			ArrayList al = new  ArrayList();// this is empty constructor having initial capacity as 10
											// we can provide initial capacity (7) here capacity 7
			al.add(19);//can go with index value also
			al.add(129);
			al.add(191);//collection by smart programming
			al.add(193);
			al.add(190);
			al.add("akash");//Heterogeneous 
			al.add("akash");//duplicate multiple null also allowed no in built sorting
			
			System.out.println(al);
			al.remove(2); // it will remove 191 here 2 is index value 
			System.out.println(al);
			System.out.println(al.get(4));// akash
			al.set(4, "manish"); // set karega
			System.out.println(al.get(4));// manish
			al.removeAll(al);// removes all elements mostly used for
			//collection se collection remove karane ke liye
			al.clear();// used to clear collection
			System.out.println(al);
			
	}

}
