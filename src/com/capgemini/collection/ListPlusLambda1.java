package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListPlusLambda1 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(0);
		l.add(3);
		l.add(11);
		System.out.println(l);
		Collections.sort(l);// sort method of collection class is used for sorting 
		// as this is sorting the list but in acceding order 
		//what if we want to sort in descending order
		// then we have to use comparator 
		System.out.println("after sorting the list in accending order ");
		System.out.println(l);
		System.out.println("after sorting the list in decending order ");
		Collections.sort(l,new MyComparator() );
		System.out.println(l);
	}

}
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>02) {
			return -1;}
		
			else if(01<o2) {
				return 1;
				
			}else {
				return 0;
			}
		
	
	}
	
}
