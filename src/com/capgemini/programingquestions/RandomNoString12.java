package com.capgemini.programingquestions;
// i have not watched this lecture completely 
import java.util.Random;

public class RandomNoString12 {

	public static void main(String[] args) {
		// ways to generate random no and string in java
		// Approach 1 using Random class
		Random obj = new Random();
		 int result =obj.nextInt(10);// it will generate random no 
		// by 10 i am telling generate random no from 0 to 10
		System.out.println(result);
		

	}

}
