package com.capgemini.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Practice27 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(300);
		al.add(200);
		al.add(400);
		al.add(500);
		System.out.println(al);
		al.forEach(n-> System.out.println(n));
//		
//		ListIterator itr = al.listIterator();
//		itr.next();
//		itr.next();
//		itr.next();
//		itr.next();
//		
//		while (itr.hasPrevious()) {
//		System.out.println(itr.previous());
//		
	//}
	}

}
