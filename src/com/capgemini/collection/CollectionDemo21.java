package com.capgemini.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

		//HashMap is first implementation class of map interface 
		// underlying ds for hashmap is hashtable 
		//no insertion order is preserved 
		// hash code of keys is considered for insertion order 
		// duplicates keys not allowed duplicate values allowed 
		//Heterogeneous object allowed for both key and value 
		//null for key only ones allowed
		// null for values as many many times as u want
		// best for search operation 
		// HashMap is best if our frequent operation is search operation 
public class CollectionDemo21 {

	public static void main(String[] args) {
		HashMap m = new HashMap();// default capacity 16 fill ratio 0.75 
		//HashMap m1 = new HashMap(int initialcapacity);
		//HashMap m2 = new HashMap(int initialcapcity ,float fillratio);
		//HashMap m3 = new HashMap(Collection c);
		// putAll() method
		// get(key) this will return the value of that particular key
		//remove(key)// if we delete key value also will be deleted
		//containskey(key)// true if key false if not
		// containsVlaue(value) true if yes false if no
		//isEmpty() true false
		//size() it will give no of entries 
		//clear()
		m.put(101,"akash");
		m.put(103,"ved ");
		m.put(102, "rehan");
		System.out.println(m);
		System.out.println(m.get(102));// rehan
		
		for(Object i :m.keySet()) {
			System.out.println(i);// it will  print key one by one 102,102,103
		}
		for(Object i: m.values()) {
			System.out.println(i);// it will print values one by one
		}
		for(Object i:m.keySet()) {
			System.out.println(i +"    "+ m.get(i));// it will print entry one by one
		}
		// entry methods
		// we can also use this for the single sigle entry or we can use iterator
		//for(Map.Entry entry :m.entrySet()) {// here Map.Entry is return type of the entry set
			//System.out.println(entry.getKey() + "         "+entry.getvalue());
			
		//}
		System.out.println(m.containsKey(101));// true
		m.put("sayali", 56);// here sayali is key 56 is value 
		System.out.println(m);
		System.out.println(m.put("sayali", 67));// prints 56 as it have sayali as a key already 
		System.out.println(m);
		Set s = m.keySet();
		System.out.println(s);// prints set of keys 101 , 102, 103, sayali 
		
		Collection c = m.values();
		System.out.println(c);// prints only values 
		Set s1 = m.entrySet();// here i have created a set s1 having all the value
		System.out.println(s1);//output in [] brackets  
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();//Map.Entry is type of variable 
			System.out.println(m1.getKey()  + "....." +m1.getValue());
			 
			
		// difference between HashMap and HashTable 
		/*       
		 * HashMap 									|		hashtable 
		 * every method is not synchronized			|		Synchronized
		 * not thread safe 							|		safe 
		 * Performance high							|		low 
		 * null allowed for key and value 			|		not allowed(will get null pointer exception) 
		 * not legacy 								|       legacy 
		 * 
		 * 
		 * */
		}  
	}
}

