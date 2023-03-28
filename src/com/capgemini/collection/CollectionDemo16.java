package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo16 {

	public static void main(String[] args) {
	ArrayList<Emp> l = new ArrayList<>();
	l.add(new Emp("akash", "988667",12));
	// here i have created an object
	//and added that object of employee class present in  Demo 15 
	// in this ArrayList   
	l.add(new Emp("akasha", "9886675",17));
	
	l.add(new Emp("ankit", "9886677",14));
	// if default sorting order not available or we r not satisfied with  default natural sorting order then 
	//we can go for customized sorting by using Comparator 
	//Collections.sort(l);// this does not work here as it can not compare objects 
	// because there are 3 type of variable so kis wise compare kare use kaise pta 
	// ye batane ke liye hum Comparable aur Comparator ka use karate hai
	//Comparator  ka use tab karate hai jab hume multiple logic ke according data sort karna hota hai
	//Comparable ka use tab karate hai jab single sorting logic ka use karna hota hai 
	
	System.out.println("before  the sorting ");
	System.out.println(l);
	System.out.println("after the sorting ");
	Collections .sort(l);
	System.out.println(l);
	System.out.println("using Compartor for id sorting-----");
	Collections.sort(l,new IdComparator());
	// Collections.reverse() // this method is used to reverse a collection
	System.out.println(l);
	
	Collections.sort(l,new NameComparator());
	System.out.println("name wise sorting using the Comparator ");
	System.out.println(l);
	
	}							
//                              	 
}
