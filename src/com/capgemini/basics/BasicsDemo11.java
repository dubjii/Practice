package com.capgemini.basics;

	// 		here we have to make a method which takes int and float value and returns 
	//a boolean whether the no is prime or not
				/*literals in java are a sequence of characters that represents the
				 * constant values to be stored in variables */
			/*Literals in Java are a synthetic representation of boolean,
			 *  character, numeric, or string data. They are a means of expressing 
			 *  particular values within a program. They are constant values that directly 
			 * appear in a program and can be assigned now to a variable */
public class BasicsDemo11 {

	public static void main(String[] args) {
		isPrime(7);

	}

	public static void isPrime(int num) {// here the method is static so
		// the me can use it without creating its object
		int count = 0;

		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0) {
				count = count + 1;

			}
		}
		if (num != 1 && count == 0) {
			System.out.println("the no is prime");
		} else {
			System.out.println("no is not prime");
		}

	}

}
