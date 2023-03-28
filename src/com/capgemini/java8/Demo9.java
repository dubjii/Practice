package com.capgemini.java8;
class K{
	protected void display() {
		System.out.println("hiii bro");
	}
}
class M extends K{
	@Override
	// here there is change in visibility of method 
	// it is possible to make visibility from protected to public but vice versa not possible 
	   public void display() {
		System.out.println("hiii you  bro");
	}
}
public class Demo9 {

	public static void main(String[] args) {
		
		
		
		
	}

}
