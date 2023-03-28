package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo13 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("scoot","david", "jhon");
		List<String> list2 = Arrays.asList("mary","luna", "tom");
		List<String> list3 = Arrays.asList("ken","jhony", "kity");
		List<List<String>> finalList = Arrays.asList(list1,list2,list3);
		// using flatmap
		finalList.stream().flatMap(n->n.stream()).forEach(System.out:: println);
	}

}
