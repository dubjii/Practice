package com.capgemini.practice;

import java.util.Comparator;

class IdComaprator implements Comparator<Child>{

	@Override
	public int compare(Child o1, Child o2) {
	
		return -(o1.getId()-o2.getId());
	}

	
	
}
public class Practice32 {

	public static void main(String[] args) {
	
	}

}
