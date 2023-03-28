package com.capgemini.practice;
			


		
public class Practice4 {
	public int add(int ...n) {
		int sum= 0;
		for(int i :n) {
			sum = sum +i;
			
		}
	return sum;
		
	}

	public static void main(String[] args) {
		Practice4 obj = new Practice4();
		int result =  obj.add(2,3,4,5,6);
		System.out.println(result);
		

	}

}
