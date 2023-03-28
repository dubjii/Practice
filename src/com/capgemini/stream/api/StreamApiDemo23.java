package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Students{
	String name;
	
	int score ;
	Students(String name , int score){
		this.name= name;
		this.score = score;
		
	}
	public String  getName() {
		return this.name;
		
	}
	public int getScore() {
		return this.score;
	}
	
}
public class StreamApiDemo23 {

	public static void main(String[] args) {
		//the powerfull feature of steams is that the stream pipelines may execute either sequentitially 
		// or in parallel  all collection support the 
		// parallelStream() method that returns a possibly parrallel stream 
		// Stream<Student> parallelStream= studentList.parralelStream()
		// when stream executes in parallel the java runtime divides the stream into multiple sub streams 
		// the agregerate operations iterate over the process thses sub streams in parallel and then 
		// combine the results 
		// stream = substream  substream substream 
		List<Students> studentList = Arrays.asList(
				new Students("David", 82),
				new Students("ram", 87),
				new Students("jhon", 72),
				new Students("Das", 95),
				new Students("jay", 67),
				new Students("ajay", 96),
				new Students("Jya", 90),
				new Students("kjo", 67)
				);
		// from this i want to filter student having marks greater than the 80
		// sequential normal stream
	 studentList.stream().filter(s->s.getScore()>=80).
	 forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));
			// using parallel stream
	 // here mutilpe streams will be created and the operation will be fast
	 
	 studentList.parallelStream().filter(s->s.getScore()>=80).
	 forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));
			// we can convert the normal stream into parallel stream by parallel method 	
	 // here i have converted a normal stream into parallel stream
	 	studentList.stream().parallel().filter(s->s.getScore()>=80).
	 	forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));
	}

}
