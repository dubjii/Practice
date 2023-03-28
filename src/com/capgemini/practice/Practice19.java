package com.capgemini.practice;

import java.util.Scanner;

	class YoungerAgeException extends RuntimeException{
		YoungerAgeException(String msg){
			super(msg);
	}
			
		}
public class Practice19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("hi please enter your age ");
		int age = sc.nextInt();
		try{
		if (age<18) {
			throw new YoungerAgeException("hi man your age is less than 18 so u can not vote ");
		}
		else {
			System.out.println("thanks for voting");
		}
		}
		catch(YoungerAgeException e) {
			System.out.println(e);
		}
		finally{
			System.out.println("as a responsiblle citizens of india we must vote ");
		}
	}

}
