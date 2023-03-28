package com.capgemini;
		

		interface SumInter{
			int sum(int a,int b);
		}
public class LambdaDemo3 {

	public static void main(String[] args) {
		SumInter s =(a,b) ->	a+b; // here we have used lambda expression for some method
	
		;
			System.out.println(s.sum(2, 3));
			System.out.println(s.sum(7, 9));
	}

}
