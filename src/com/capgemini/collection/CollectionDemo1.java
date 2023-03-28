package com.capgemini.collection;

import java.util.ArrayList;

/*collection is an interface which is present in java.util package
     Syntax of collection interface 1.2 version
     public interface collection<E> extends Iterable<E>{
    methods 
     } 
     no class directly inherit collection interface
      methods of collection interface 
      1 public boolean add(object obj)//can add elements using this method
      public boolean addAll(collection c)// to add another collection object in collection 
      object (ek collection se dusare collection me)
       collection interface hai aur collections class hai
        public boolean remove (object obj)
           public boolean removeAll(collection c)
            void clean();
            bollean contains (object obj)
            bollean containAll(collection c) 
            boolean isEmpty()
            int size()
            Iterator iterator()*/
	// ArrayList works on index based method 
	// in ArrayList any random element can be accessed with same speed
	// so good for Retrieval  operation(retrieving)
	 // but ArrayList is not good for insertion and deletion operation
public class CollectionDemo1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("akash");// adding elements in collection object
		al.add(100);
		al.add('c');
		System.out.println(al);
		//indexOf() method retuns first occurence of specified element in the list and -1 if not present
		// lastIndexOf() will tell last index and -1 if not present
		// there is a remove if method present it will take predicate and remove element on a particular condition
		// example al.removeIf(n-> n%2 ==0)) it will remove all the even no from list
		System.out.println(al.indexOf(100));//1
		System.out.println(al.indexOf(200));//-1
		System.out.println(al.add("vvv"));// true as it is boolean
		System.out.println(al);
		ArrayList al1 = new ArrayList();
		System.out.println(al.contains(200));// false as it does not contains 200
		System.out.println(al.isEmpty());// false as it is not empty
		System.out.println(al.size());// 4 as al contains 4 elements
		System.out.println(al.remove(1));// it will remove 100 as it is catching index no
		System.out.println(al);
		al1.add("aaa");
		al1.add("bbb");
		al.addAll(al1);// adds collection object al1 to al collection object
		System.out.println(al);
		System.out.println(al.removeAll(al1));// it will remove all the elements of collection al1 from al
		System.out.println(al);
		al.clear();// clears all the elements of al collection object
		System.out.println(al);
		// there is a clone method in arraylist
		//Clone method is there two type of cloning shallow copy and deep copy
		//in shallow copy both  will refer to same object
		// in deep copy both will get them a separate object
		// ArrayList clone method is used to create a shallow copy of the list 
		// we use Collections.sort() method when we have primitive data
		// here collections is classs
		//it will sort in acceding order
		// but we can not sort object as i does not know sort on which basis
		
		
	}

}
