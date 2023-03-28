 package com.capgemini.collection;
		// from Durga sir + sdet qa automation techie
 		//laern by bhanu is also good
		// map when we want key value pair 
 		//map do not maintain insertion order
		// map is interface which is used for mapping between key and value 
		// it is part of collection framework but not the child interface of collection 
		// key and value both are objects only  and can be of any data types 
		// duplicate keys not allowed values can be same(duplicate)
		//each key value pair is known as one entry hence map is collection of entry objects
		// object put(object key, object value)
		// we can not use collection methods here
public class CollectionDemo20 {

	public static void main(String[] args) {
		// methods of map 
		// object put(object key, object value)
		// to add one entry to map 
		// if key already present then old value replaced by new value and returns old value  
		// here object is null if direct entry if we keep key same and value change then that value will get
		// Replaced by new value and that is returned 
		// when our frequent operation is searching go for hashMap
		//void putAll(map m)
		//  object get(key) here it will return the value of that particular key
		// object getValue()
		//  object remove(key)// removes entry of that key 
		//boolean containsKey(key)
		//boolean  containsVlaue(value)
		//  boolean isEmpty()
		//  int size()no of key value pair 
		// void clear()
		// set keySet() only keys returns all the keys in map
		// collection values() it will return all the values from map
		// set entrySet() returns all the entryset 
		// entry means combination of key and value pair 
		// there is a entry interface map is combination of entry 
		// every entry can be represented by entry interface
		
		// Entry(I)it is sub interface created for map interface
		// so method of entry interface can be used with only entry object
		// map is grp of key value pair each key value pair is entry 
		// without existing map object there is no chance of existing of entry object 
		// hence entry interface is defined inside map interface  
		// entry interface methods 
		//getKey()
		// getValue()
		// setValue(object)
		//example  x key 101 value this is an entry
		// entry is subset of map interface
	} 

}
