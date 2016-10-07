package com.learning.java.queue;

public class UseQueue{
	
	public static void main(String[] args){
		CircularQueue cq = new CircularQueue();
		System.out.println("Item\t Head\t Tail\t QueueSize");
		cq.enqueue(5.3232);
		System.out.println("5.3232 " + cq.head + " " + cq.tail + " " + cq.queueSize);
		cq.enqueue("Mahesh");
		System.out.println("Mahesh " + cq.head + " " + cq.tail + " " + cq.queueSize);
		cq.enqueue('c');
		System.out.println("c " + cq.head + " " + cq.tail + " " + cq.queueSize);
		
		System.out.println(cq.dequeue() + " " + cq.head + " " + cq.tail + " " + cq.queueSize);
		System.out.println(cq.dequeue() + " " + cq.head + " " + cq.tail + " " + cq.queueSize);
		System.out.println(cq.dequeue() + " " + cq.head + " " + cq.tail + " " + cq.queueSize);
		System.out.println(cq.dequeue() + " " + cq.head + " " + cq.tail + " " + cq.queueSize);
	}
	
}