package com.learning.java.linkedlist;

public class LinkedList {

	private Node head;
	
	public LinkedList(){
		head = null;
	}
	
	public Boolean IsEmpty(){
		return head == null;
	}
	
	public void Insert(Object data){
		Node newNode = new Node(data, null);
		
		if(head == null){
			 head = newNode;
			 return ;
		}
		Node tmp = head;
		
		while(tmp.getNext() != null){
			tmp = tmp.getNext();
		}
		tmp.setNext(newNode);
	}

	public void Remove() throws Exception{
		
		if(head == null){
			throw new Exception("Cannot delete");
		}
		Node curr = head;
		Node prev = null;
		
		while(curr.getNext() != null){
			prev = curr;
			curr = curr.getNext();
		}
		curr = null;
		prev.setNext(null);
	}
	public void Remove(Object obj) throws Exception{
		
		if(head == null){
			throw new Exception("Cannot delete");
		}
		Node curr = head;
		Node prev = null;
		
		while(!curr.getData().equals(obj) && curr.getNext() != null){
			prev = curr;
			curr = curr.getNext();
		}
		prev.setNext(curr.getNext());
		
	}
	
	public void Print(){
		System.out.print("[ ");
		Node tmp = head;
		while(tmp != null){
			System.out.print(tmp.getData() + ", ");
			tmp = tmp.getNext();
		}
		System.out.print(" ]");
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.Insert("Hello");
		ll.Insert(45);
		ll.Insert(12);
		ll.Remove();
		ll.Insert(4.2323);
		ll.Insert("Yes");
		ll.Remove(45);
		ll.Print();
	}
	
}
