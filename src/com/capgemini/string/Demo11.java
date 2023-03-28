package com.capgemini.string;

public class Demo11 {

	public static void main(String[] args) {
		//reverse a string 
		String str = "akash";
		// 1st way
		char[] c = str.toCharArray();
		for(int i = c.length-1; i>=0; i-- ) {
			System.out.print(c[i]);
		}
		System.out.println();
		// 2nd way
		System.out.println("second method");
		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

		System.out.println("third method");
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		System.out.println();
		System.out.println("fourth method");
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(sb1.reverse());
		// i want remove white spaces from string 
		String str1 = " my name is akash dubey";
		String str2 = str1.replaceAll(" " , "");
		System.out.println(str2);
		System.out.println("second method");
		char[] arr = str1.toCharArray();
		for(int i = 0; i<=arr.length-1; i++) {
		if(arr[i]!=  ' ') {
			System.out.print(arr[i]);
		}
		}
		 
	}

}
