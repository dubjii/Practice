package com.capgemini.collection;

import java.util.function.Supplier;

public class SupplierDemo1 {

	public static void main(String[] args) {
	Supplier<String> obj = ()->  "hi i am suppliying nothing just getting";
		System.out.println(obj.get());
	

	}

}
