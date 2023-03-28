package com.capgemini;

public class LambdaDemo2Imp  implements LambdaDemo2{

	
		@Override
		public void sayHello() {
			System.out.println("i am learnig intereface and lamba expression");
			
		}
	public static void main(String[] args) {
			LambdaDemo2Imp obj = new LambdaDemo2Imp();
			obj.sayHello();

	}

}
