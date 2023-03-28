package com.capgemini.basics;

public class BasicsDemo7 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;// this will break the flow of program o/p is 012345

			}

		}
		for (int i = 0; i <= 10; i++) {

			if (i == 5) {
				continue;// it will just skip the conditional part that is 5 

			}
			System.out.println(i);
		}

	}
}
