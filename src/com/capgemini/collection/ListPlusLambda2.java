package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPlusLambda2 {

	public static void  main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(0);
		l.add(3);
		l.add(11);
		System.out.println(l);
		System.out.println("after sorting the list in decending order ");
		// here i will provide imlementaion here to compare method of Comparator interface
		//in sort method directly using lambda expression
		Collections.sort(l,(o1,o2)->{
			if(o1>o2) {
				return -1;
				}
			else if(o1<o2) {
				return 1;
				
			}
			else
				return 0;
		});
		System.out.println(l);
	}

}
