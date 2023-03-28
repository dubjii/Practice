package com.capgemini.java8;

public class Demo6 {

	public static void main(String[] args) {
		System.out.println("hii");
		System.out.println("hello");
		System.exit(0);
		System.out.println("you");
	}
		static int add() {
		try{
			//Exception Occurs in statement   
			throw new ArithmeticException();
		//	return 1;
			}catch(Exception e){
			System.exit(0);
			return 2;
			}finally{
			return 3;
			}
		}
	}


