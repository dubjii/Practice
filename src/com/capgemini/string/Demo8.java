package com.capgemini.string;

public class Demo8 {

	public static void main(String[] args) {
		String str = "megha";
		char [] arr = str.toCharArray();
		for(int i =0 ; i< arr.length; i++) {
			for(int j =0; j<= i; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
		for(int i =arr.length-2 ; i >=0 ; i--) {
			for(int j = 0; j<=i ; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}

	}

}
