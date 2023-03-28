		package com.capgemini.string;
		// string methods

			public class Demo1 {
					// study about the split method of string
				
				public static void main(String[] args) {
					String s = "akash";
					System.out.println(s.length());// 5
					
					System.out.println(s.isEmpty());// false 
					String str = "     manish   ";
					System.out.println(str.length());// 14
					System.out.println(str.trim());
					// manish it will remove spaces of front and back 
					// but can remove space if any present in middle 
					System.out.println(s.equals(str));// false
					String s1 = "DEpak";
					String s2 = "dePAK";
					System.out.println(s1.equalsIgnoreCase(s2));// true
					String s3 = "a";
					String s4 = "A";
					System.out.println(s3.compareTo(s4));// 32
					System.out.println(s3.compareToIgnoreCase(s4));// 0 ignores the case
					// adding two strings in java using + operator 
					System.out.println(s3 + s4);//aA output
					System.out.println(s3+10);//a10
					System.out.println(s3+10+20);// a1020
					System.out.println(10+20+s3);// 30a
					//System.out.println(s3 +10-5);// error not possible
					System.out.println(s1.concat("java"));//Depakjava
					String s5 = "manish";
					String s6 ="depak";
					System.out.println(String.join( ";",s5, s6));//manish;depak
					System.out.println(s5.subSequence(0, 4));// mani
					System.out.println(s5.substring(1));// anish
					System.out.println(s5.substring(0, 4));//mani
	}

}
