package com.capgemini;


		interface LengthInter{
			int getLength(String str);
		}
public class LambdaDemo4 {
			// in data structure we store data using efficient way (time and space complexity)
	//2 types of ds 1 premitive and non premitive
	public static void main(String[] args) {
	 LengthInter l = (str)-> str.length();//
	 	System.out.println(l.getLength("hellohiih"));
	}

}
