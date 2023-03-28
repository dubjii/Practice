package com.capgemini.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

		/*Enumeration is the cursor which is 
		 * used to retrieve collection objects one by one
		 * Enumeration cursor used only with legacy class i.e vector and stack
		 * it is get by elements () method
		 * 
		 * Enumeration e = v.elements();
		 * methods in enumeration hasmoreElements() , nextElement() both methods work in forward 
		 * direction only for read operation */

public class CollectionDemo4 {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("akash");
		v.add(10);
		v.add(15.4);
		System.out.println(v);
		Enumeration e = v.elements();
		while (e.hasMoreElements())    // to print elements using Enumeration
		{
			System.out.println(e.nextElement());
		}
		Iterator i = v.iterator();// using normal iterator
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
