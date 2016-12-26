package com.learning.java.comparision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoStudentComparator {

	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<>();
		a.add(new Student(1, 56));
		a.add(new Student(2, 66));
		a.add(new Student(3, 26));
		a.add(new Student(4, 36));
		a.add(new Student(5, 66));
		a.add(new Student(6, 26));

		
		Comparator<Student> com = (o1, o2)->
		{
			return o1.marks < o2.marks? 1 : o1.marks > o2.marks? -1 : 0;
		};
	
		System.out.println("======================");
		Collections.sort(a, com);
		for(Student s : a){
			System.out.println(s.toString());
		}
		System.out.println("======================");
		Collections.sort(a);
		for(Student s : a){
			System.out.println(s.toString());
		}
		
		PriorityQueue<Student> pqueue = new PriorityQueue<>();
		pqueue.add(new Student(1, 56));
		pqueue.add(new Student(2, 66));
		pqueue.add(new Student(3, 26));
		pqueue.add(new Student(4, 36));
		pqueue.add(new Student(5, 66));
		
		System.out.println("Priority queue implementation is as follows : ");
		System.out.println(pqueue);
		while(!pqueue.isEmpty()){
			System.out.println(pqueue.poll().toString());
		}
	}

}
class Student implements Comparable<Student>{
	int rollNo;
	int marks;
	
	public Student(int rollNo, int marks){
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	@Override
	public String toString(){
		return "Student with rollNo : " + rollNo + " and marks " + marks ;
		
	}

	@Override
	public int compareTo(Student s) {
		if(equals(s))
			return 0;
		return this.marks < s.marks ? 1 : -1; 
	}
	
	public boolean equals(Student s){
		return (this.rollNo == s.rollNo);
	}
}