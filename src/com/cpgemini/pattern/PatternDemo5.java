package com.cpgemini.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
class Product {
	private int id;
	private String name;
	private int price;
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
public class PatternDemo5 {

	public static void main(String[] args) {
		List<Integer> al  = Arrays.asList(2,3,2,3,1,1);
		// this is a code to remove duplicate elements from list
		al.stream().collect(Collectors.toSet()).forEach(System.out:: println);
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight", "train");
		vehicles.stream().map(str-> str.length()*3).forEach(System.out:: println);
		List<Integer> list = Arrays.asList(1,2,8,3,7,4,5,9);
		 Optional<Integer> max = list.stream().max((val1,val2)-> {return val1.compareTo(val2);});
		 System.out.println(max.get());
		 Optional<Integer> min = list.stream().min((val1,val2)-> {return val1.compareTo(val2);});
		System.out.println(min.get());
		list.stream().sorted().forEach(e-> System.out.print(e));
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}
}
