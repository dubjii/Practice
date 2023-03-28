package com.capgemini.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* list and set are interface directly inherits collection 
		 	diff btw list and set
		 	list 						|				set
		 1)	 index based ds	like array	|		not index based according to hashcode value	
		 2)	we can store duplicate 
		 	Elements like 2 times 10 	|	no duplicate allowed
		 3) can store many null value	|	only one  null element
		 4)it follow insertion order	|	no insertion order	*
		 5) to iterate(get) the list 	|
		 elements by
		  Iterator(only forward direction)|
		   & 
		 ListIterator(both for back also)	|			| only by Iterator*
		 					
		 					
		 					*/
public class CollectionDemo2 {

	public static void main(String[] args) {
		List l = new ArrayList();// created object of array list taking reference of list interface
		l.add(0, 26);// index based or l.add(1) it will also add on 0 index
		l.add(20);
		l.add(39);
		l.add(39);// allowed
		l.add(null);
		l.add(null);
		Iterator itr = l.iterator(); // creating reference of Iterator interface 
		// here Iterator is interface and iterator() is a method
		//l.iterator() ek array return karta hai
		//Returns an array containing all of the elements in this list in proper
	     //* sequence (from first to last element).
		while (itr.hasNext()) {// hasnext means do it have next element returns boolean value
			System.out.println(itr.next());// next means move to next
		}
		System.out.println(l);
		ListIterator litr = l.listIterator(); // ListIterator method
		while (litr.hasNext()) {
			System.out.println(litr.next());  
		}
		
		Set s = new HashSet();// created object of hashset using set interface reference
		s.add(100);
		s.add(200);
		s.add(200);
		s.add(null);
		s.add(null);
		// it will not print this 200 as duplicate value
		System.out.println(s);// not index based
		itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());// Retrieving elements one by one

		}
	}

}
