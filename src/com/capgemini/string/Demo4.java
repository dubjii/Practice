package com.capgemini.string;

public class Demo4 {

	public static void main(String[] args) {
		String name = "deepak";
		String name1 = "AKASh";
		
		System.out.println(name.toUpperCase());//DEEPAK
		System.out.println(name1.toLowerCase());//akash
		//......................................
		int a = 10;
		String s = String.valueOf(a);// used to convert any data type into string 
		System.out.println(a);
		//The method parseInt() belongs to the Integer class which is under java.lang package. 
		//It is used to parse the string value as a signed decimal value. 
		//It is used in Java for converting a string value to an integer by using the method parseInt().
		//example
		String str = "133";
		int b = Integer.parseInt(str);
		System.out.println(b);
		char[] c = name.toCharArray();
		System.out.println(c);
		String str1 = "     Geeks     for Geeks     ";
		 
        // Call the replaceAll() method
		// it will remove the spaces between the strings
		
        str1 = str1.replaceAll("\\s", "");
 
        System.out.println(str1);
	}

}
