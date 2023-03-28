package com.capgemini.basics;

public class BasicsDemo4 {
	// switch case

	public static void main(String[] args) {
		int x = 6;
		char z = 'a';
//		if(x==1) {
//			System.out.println("the value of x is 1");
//		}else if(x==2) {
//			System.out.println("the value of x is 2");
//		}
//			else if(x==3) {
//				System.out.println("the value of x is 3");
//			}
//			else {
//				System.out.println("the value of x is not 1,2,3");
//			}
		switch (x) {// in switch the sequence does not matter we can even
		//put default case before everything
		case 1:
			System.out.println("the value of x is 1");
			break;
		case 2:
			System.out.println("the value of x is 2");
			break;

		case 3:
			System.out.println("the value of x is 3");
			break;
		default:
			System.out.println("the value of x is not 1,2,3");
			break;
		}
		switch (z) {// in switch the sequence does not matter we can even
		//put default case before everything
		case 'a':
			System.out.println("the value of x is a");
			break;
		case 'b':
			System.out.println("the value of x is b");
			break;

		case 'c':
			System.out.println("the value of x is c");
			break;
		default:
			System.out.println("the value of x is not a,b,c");
			break;
		}

	}

}
