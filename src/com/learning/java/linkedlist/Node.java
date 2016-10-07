package com.learning.java.linkedlist;


/*******************************************************
 *
 *  The Node class
 *
 ********************************************************/

public class Node {
	
	public Object data;
	public Node next;
	
	public Node(Object data, Node next){
		this.setData(data);
		this.setNext(next);
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}