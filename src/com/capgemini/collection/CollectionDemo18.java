package com.capgemini.collection;

import java.util.Comparator;

class NameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getName().compareTo( o2.getName());
		// the compareTo method is used to compare to strings 
		
	}

	
		
	}

public class CollectionDemo18 {

	public static void main(String[] args) {
		

	}

}
