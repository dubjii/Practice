		package com.capgemini.telusko;
		//topic 14 
		/* types of interface 
 		1 normal interface if in it more than one method.
 		2 single abstract method (sam) - in java 8 it is known as functional interface
 		// if we know functional interface we can use lambda expression
 		3 marker interface it does not have any method example Serializable interface */
		// serilization convertin object into byte stream so that can easily store in database file etc
		// used inhibernate jpa etc here everuthing is done by jvm
		// externalization in this no role of jvm 
		 interface Writer{// in interface all methods are declared we can 
			 //not define them so by default all methods in interface are public abstract
			public abstract void write(); //so even if we remove public abstract it will work fine
				 //void Write();			
		}
		class Pen implements Writer{
			public void write() {
				System.out.println("i am a pen");
			}
		}
		class Pencil implements Writer{
			public void write() {
				System.out.println("i am a pencil");
			}
		}
		class Kit{
			public void DoSomething(Writer p) {/*passing object of pen in do something
			if we call object of pc then it will not work to deal with that create writer class*/
				p.write();
			}
		}
		public class InterfaceDemo14 {

			public static void main(String[] args) {
		
			Kit k = new Kit();
			Writer p = new Pen();// creating object of pen using writer class reference
			Writer pc = new Pencil();
			k.DoSomething(pc);
	}
			// we can not create object of interface but we can create 
			//reference of interface we can implement multiple interface 
			// by default all methods are public abstract so we can not define it.
			// in class we extend in interface we use implements
			// we can implement multiple interfaces but we can not extend multiple classes 
			// main difference between abstract class and interface 
			// all methods in interface is public abstract but in abstract class it can be 
			// abstract as well as concrete
}
