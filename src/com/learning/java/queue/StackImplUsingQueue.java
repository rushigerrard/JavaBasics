package com.learning.java.queue;

public class StackImplUsingQueue {

	public static void main(String[] args) {
		StackUsingQueue q1 = new StackUsingQueue();
		q1.enque("3");
		q1.enque("4");
		q1.enque("5");
		
		System.out.println(q1.specialDeque());
		System.out.println(q1.specialDeque());
		q1.enque("6");
		q1.enque("7");
		System.out.println(q1.specialDeque());
		System.out.println(q1.specialDeque());
		System.out.println(q1.specialDeque());
	}
}
