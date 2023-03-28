package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

		/* when we want to print one one element then we have to use cursors 3 types of cursors 
		 * 1) Iterator
		 * 2) ListIterator
		 * )Enumeration
		 * iterator cursor can used with any collection object
		 *   listItertor only with list implemented classes means arraylist linkedlist vector stack */
			// hashnext(); next(); remove(); methods of Iterator only forward 
			//  hashnext(); next(); remove(); hashPrevoius(); previous(); set(); 6 methods both
			// using  iterator cursor  we can only read and remove elements
			// using ListIterator we can read remove replace and add the elements
			// java revisit and java guide read from these sites

public class CollectionDemo3 {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("akash");
		l.add(10);
		l.add(38);
		l.add("manish");
		System.out.println(l);
		/*Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}*/
		
		
		ListIterator litr = l.listIterator();
		litr.next();// to move the cursor
		litr.next();
		litr.next();
		litr.next();
		while(litr.hasPrevious()) {
			System.out.println(litr.previous()); //it will print in reverse order
		}

	}

}
