package com.capgemini.programingquestions;

public class SearchingElementInArray20 {

	public static void main(String[] args) {
		// linear search i want to find out if a particular no is present in my array or not
		// in this case i want to check weather 50 Is present in my array or not
		int [] a = {10,20,30,40,50};
		boolean flag = false;
		for(int num: a) {
			if( num == 50) {
				System.out.println("number found ");
				flag = true;
				break;
			}
			
		}
		if( flag == false) {
			System.out.println("number not found");
		}

	}

}
