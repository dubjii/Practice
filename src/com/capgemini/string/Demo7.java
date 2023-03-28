package com.capgemini.string;

public class Demo7 {

	public static void main(String[] args) {
		// program to find minimum and maximum occurring character inn string
		//every character have unique integer value that is known as asci value 
		// ex  a = 97;
		String s = "abbccc";
		int arr[] = new int[256];// here u can put size as 127 or 256 just to be safer keep it 256
		// here the logic is that i am creatin array asd then charcter asci value is supposed to there 
		// index no now i am storing value of repetetion in that index no
		// can watch smart programing video for the same
		
		for(int i= 0; i< s.length();i++) {
			arr[s.charAt(i)]= arr[s.charAt(i)]+1;
			
		}
		int max = -1;
		for(int i =0; i< s.length(); i++) {
			if(max < arr[s.charAt(i)]){
				max = arr[s.charAt(i)];
			}
			
		}
		System.out.println(max);
		

	}

}
