package com.capgemini.collection;

import java.util.function.Consumer;

public class ConsumerDemo1 {

	public static void main(String[] args) {
		
		Consumer<Integer > obj = ( t)-> System.out.println(t); 
			
			obj.accept(10);

	}


}
