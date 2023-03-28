package com.capgemini.collection;

import java.util.Comparator;

class IdComparator implements Comparator<Emp>{

	// there is very good video of same topic by selenium express 

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.getEmpid()-o2.getEmpid();
		//  here Comparator sorted the objects so all variables 
		//can be sorted there is nothing specific
		// kisi bhi parameter ke basis pe sort kar sakte hai
	}
			
		}

public class CollectionDemo17 {

	public static void main(String[] args) {
		

	}

}
