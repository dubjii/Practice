package com.capgemini.collection;

import java.util.Vector;

public class CollectionDemo7 {
	//Array list acts as list LInked list acts as list and Dequee.
	// underlying ds for both is different
	//in a.l elements stored in continuous memory location in l.l not
	//ArrayList  is good for retrieval operation LinkedList good for insertion and deletion(very imp property)
	//legacy classes are vector stack hashtable dictionary they were
	//reenginered to fit into collection framework.
	//class vector implements List{
	// Constructor 
	// methods
      //} the underLying ds is growable array
	// property or vector it is index based store heterogeneous duplicate allowed multiple null allowed
	// follows insertion order vector are synchronized collection.
	// all legacy classes are Synchronized.
	// methods it contains list and collection interface methods 
	// addElemnet(object obj);
	// firstElement();
	//lastElement();
	// removeElement();
	// removeAllElement();
	//capacity(); it tells what is capacity of our vector

	public static void main(String[] args) {
	
			Vector v = new Vector(); // initial capacity 10
			v.add("akash");
			v.add("akash");
			v.add(null);
			v.add(null);

			v.add(8);
			v.add(9.7);
			System.out.println(v);
			System.out.println(v.firstElement());
			System.out.println(v.lastElement());
			System.out.println(v.capacity()); //by default capacity gets double 10 to 20
			
	}

}
