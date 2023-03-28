package com.capgemini;

public class EnhanchedForLoop {
	public static void main(String[] args) {
		int num[] = new int[5];
		num[0] = 1;
		num[1] = 1;
		num[2] = 1;
		num[3] = 1;
		num[4] = 1;
		
		for(int i:num) {/* this is the enhanced for loop// for each loop 
		    for (int number: numbers) {
		        System.out.println(number)*/
			System.out.println(i);
		}
	}

}
// output is 11111
