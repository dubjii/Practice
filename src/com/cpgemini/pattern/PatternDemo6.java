package com.cpgemini.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo6 {

	public static void main(String[] args) {
		// Regular expression a group of string objects according to a particular pattern
		// first application area is the validations
		// to develop pattern matching application
		// we can write a pattern to represent all the mobile numbers
		// same for email ids
		// question i have a pattern ab now check weather in ababbaba this pattern is available or not 
		// if it is then how many times
		int count = 0;
		Pattern p = Pattern.compile("ab");
		// here i am creating pattern object and my expression is ab i want to check for ab
		// creating object of Pattern class using compile() static method
		Matcher m = p.matcher("ababbaba");
		// here creating object of matcher class matcher() method  also present in Pattern class 
		//ababbaba is target string in this string we r searching for pattern
		while(m.find()){ // if match is present
			count++;
			// 	
			System.out.println(m.start());// it will print the index no of starting like 
			// here 0,2,5
		}
		System.out.println( " the no of pattern found is" + count);
		System.out.println("after using the end method also");
		// the end method 

	}

}
