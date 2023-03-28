package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Product{
	int id ;
	String name;
	double price;
	public Product(int id,String name ,double price){
		this.id = id;
		this.name=name ;
		this.price = price;
	}
	
}
public class StreamApiDemo7 {

	public static void main(String[] args) {
		//in this i will learn how to process objects using filter 
		// i want to filter the objects on the basis of prize if prize is 
		// greater than 25000  then add them to another list or  print the price of laptop
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"hp laptop",25000));
		productList.add(new Product(2," dell laptop",30000));
		productList.add(new Product(3,"lenovo laptop",28000));
		productList.add(new Product(4,"sony laptop",23000));
		productList.add(new Product(5,"apple laptop",90000));
		List<Product> al  = new ArrayList();
		// here p is product object
//		 al =productList.stream().filter(p->p.price>25000).collect(Collectors.toList());
//		 System.out.println(al);
		// or
		productList.stream().filter(p-> p.price>25000).forEach(p-> System.out.println(p.price));
		// or
		//productList.stream().filter(p-> p.price>25000).forEach(System.out::println);
		
	}

}
