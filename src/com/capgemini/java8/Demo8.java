package com.capgemini.java8;
// here i wanted to call the first method only  so i went for method hiding concept 
// i took  the reference of A to make object of b
// then i called the super.display() so i got the out put of  hioo
class A1 {
	public static  void display() {
		System.out.println("hioo");
	}
}
class B1 extends A1{
	public  static void display() {
		
		System.out.println("hiii");
	}
}

public class Demo8 {

	public static void main(String[] args) {
	A1 obj = new B1();
	obj.display();

	
	}

	}


