package com.capgemini.collection;

import java.util.PriorityQueue;

//q represents the group of objects that is about to be processed
		//Q is open at both ends and one end for insertion and another is
		//for deletion of elements or object
		// first in first out in Q
		// in priority queue the insertion order is not preserved and duplicates not allowed 
		// in priority queue null insertion is not allowed 
public class CollectionDemo19 {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		// first empty constructor having default size 11 
		// DNSO default natural sorting order
		PriorityQueue pq1= new PriorityQueue(40);// initial capacity 40
		//PriorityQueue pq2= new PriorityQueue(int intialcapacity ,Comparator c);// initial capacity 40
		// and object of comparator class
		//PriorityQueue pq2 = new PriorityQueue(Collection c);//here i can pass any 
		//collection object to get its equivalent priority queue  
	}

}
