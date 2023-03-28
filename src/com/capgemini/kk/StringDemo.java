package com.capgemini.kk;
		// string is collection of characters
		// String (data type) reference variable name = "value";// here value is object 
		//AnyThing that starts with capital letter in java is a class 
		//So String is a class 
		// every string we create is actually an object of type String 
		// String a = "akash";
		// String b = "akash";
		// here do we have two Objects or single object  which two reference are pointing
		//String pool it is separate memory structure inside the heap memory
		// dew to pool no same object is created in string so here reference variable 
		// a and b both are pointing towards same kunal(object)
		// here we can not change object  by changing in one reference variable 
		// strings are immutable in java (for security reasons)
		// 
public class StringDemo {

	public static void main(String[] args) {
		String a = "akash";
		System.out.println(a);//output is akash 
		// here dubey is akash is  not changing but dubey is being created
		// so string is immutable 
		a = "dubey";
		System.out.println(a);// output is dubey
		String name = "akash";
		String name1 = "akash";
		// here name and name1 both ref variable pointing towards same object 
		// what if i want to create 2 object then what i will do
		String s = new String("akash");
		String sr = new String("akash");
		//here i have two object having name akash 
	}

}
