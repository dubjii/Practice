package com.capgemini.practice;

public class Practice16 {

	public static void main(String[] args) {
		int [] a = new int[6];
		a[0]= 90;
		a[1]= 34;
		a[2] =90;
		a[3] = 9;
		try {
			a[6]=8;
			int k = 9/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("stay in your limit");
			
		}
		catch(ArithmeticException e) {
			System.out.println("mathematical exception can not divide by zero ");
			
		}
		catch(Exception e) {
			System.out.println("something is wrong");
		}
		finally {
			System.out.println("hi man");
		}

	}

}
