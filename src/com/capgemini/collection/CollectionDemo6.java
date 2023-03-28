package com.capgemini.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

		/*LinkedList implemented class of list interface in java.util
		 * Syntax class LinkedLIst implements List ,deque {
		 *constructor 
		 *methods 
		 * }
		 * the underlying data structure of linked list in doubly Linked list or circular linked list*/
		// advantage insertion and deletion operation very fast
        //it occupies extra space 
		// non synchorinized
		// index based ,heterogeneous ,duplicate allowed insertion order follows 
		// contains collection ,list and Deque methods 
		// methods of LInkedlist
		// Void addFirst(object obj);
		// void addLast(object obj);
		//object getFirst();
		// object getLast();
		// object removeFirst();
		// object removeLast(); 
	    // Linkedlist is best for insertion and deletion operation
		// but  not recommend for retrieval operation
public class CollectionDemo6 {

	public static void main(String[] args) {
		
			LinkedList l1 = new LinkedList();// two constructer in linked list first empty one 
			// Linkedlist()
			
			// second collection one 
			// LinkedList(collection object)
			// how to convert a list into set
			List<Integer> al = Arrays.asList(1,4,6,7,9,7,6);
			// here i have converted a list into set by passing list into constructor of set
			
			Set <Integer> hs = new HashSet<Integer>(al);
			System.out.println(hs);
			
			l1.add(11);
			l1.add(12.32);
			l1.add(12.32);//duplicate
			l1.add("akash");
			l1.add("c");
			System.out.println(l1);
			l1.addFirst("aaa");
			l1.addLast(23);
			System.out.println(l1.getFirst());
			System.out.println(l1.getLast());
			System.out.println(l1.removeFirst());
					System.out.println(l1);
					
	}

}
