package com.capgemini.java8;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		// finding prime no in a list
		   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
		   numbers.stream().filter(Demo4::isPrime).forEach(System.out::println);
	}
		   public static boolean isPrime(int number) {
			   for(int i =2; i<=number/2; i++) {
				   if(number%i==0) {
					   return false;
				   }
				   
					
			   }
			   return true;
		   }
}


