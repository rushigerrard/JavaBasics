package com.advanced.datastructures.linkedlist;

import java.util.ArrayList;

class ListNode {
	int val;
	ListNode next;
	
	ListNode(int x){
		val = x; 
	}
	ListNode(){
		
	}
}
public class List {
	
	
	ListNode head;
	static int size;
	
	List(){
		head = null;
		size = 0;
	}
	/*public void InsertAll(ArrayList[] a){
		
	}*/
	public void Insert(int x){
		size++;
		ListNode newNode = new ListNode(x);
		if(head == null){
			head = newNode;
			head.next = null;
			return ;
		}
		
		ListNode tmp = head;
		while(tmp.next != null){
			tmp = tmp.next;
		}
		tmp.next = newNode;
		
	}
	public void Insert(int index, int x){
		size++;
		ListNode newNode = new ListNode(x);
		if(index == 1){
			newNode.next = head;
			head = newNode;
			return ;
		}
		if(index > size){
			size--;
			System.out.println("Array index out of range exception");
			return;
		}
			
		ListNode tmp = head;
		for(int i = 1; i < index - 1; i++){
			tmp = tmp.next;
		}
		ListNode saved = tmp.next;
		tmp.next = newNode;
		newNode.next = saved;
		
	}

	public void Remove(){
		if(head == null)
			return;
		ListNode current = head;
		ListNode prev = null;
		while(current.next != null){
			prev = current;
			current = current.next;
		}
		current = prev;
		current.next = null;
		size--;
	}
	public void reverse(){
		ListNode currNode = head;
		ListNode prevNode = null;
		ListNode nextNode = null;
		
		while(currNode != null){
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
		
	}
	public ListNode reverse(ListNode start){
		ListNode currNode = start;
		ListNode prevNode = null;
		ListNode nextNode = null;
		
		while(currNode != null){
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		return prevNode;
		
	}
	public void Print(){
		System.out.print("[");
		ListNode tmp = head;
		while(tmp.next != null){
			System.out.print(tmp.val + ", ");
			tmp = tmp.next;
		}
		System.out.print(tmp.val);
		System.out.println("]");
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		
		l1 = reverse(l1);
		l2 = reverse(l2);
		int carry = 0;
		ListNode tmp1 = l1.next;
		ListNode tmp2 = l2.next;
		
			
		l2.val = l2.val + l1.val;
		l1.val = l2.val;
		if(l2.val >= 10){
			l2.val = l2.val % 10;
			l1.val = l2.val;
			carry = 1;
		}
		while(tmp1 != null && tmp2 != null){
			tmp2.val = tmp1.val + tmp2.val + carry;
			if(tmp2.val >= 10){
				tmp2.val = tmp2.val % 10;
				
				carry = 1;
			}
			else{
				carry = 0;
			}
			tmp1.val = tmp2.val;
			tmp1 = tmp1.next;
			tmp2 = tmp2.next;
		}
		int flag = 0;
		if(tmp2 != null){
			flag = 2;
		}
		if(tmp1 != null){
		    flag = 1;
		}
		while(carry == 1 && tmp2 != null){
		    
			tmp2.val = tmp2.val + carry;
			
			if(tmp2.val >= 10){
				tmp2.val = tmp2.val % 10;
				carry = 1;
	
				if(tmp2.next != null)
				    tmp2 = tmp2.next;
			}
			else{
				carry = 0;
				
			}
		}

		while(carry == 1 && tmp1 != null){

			tmp1.val = tmp1.val + carry;
		
			if(tmp1.val >= 10){
				tmp1.val = tmp1.val % 10;
				carry = 1;
	
				if(tmp1.next != null)
				    tmp1 = tmp1.next;
			}
			else{
				carry = 0;
			}
			
		}
		
		if(flag == 2){
    		if(carry == 1){
    		    ListNode f = new ListNode(1);
    		    tmp2.next = f;
    		}
    		
            l2 = reverse(l2);
    	    return l2;		    
    		}
		else if(flag == 1){
		    if(carry == 1){
		        ListNode f = new ListNode(1);
		        tmp1.next = f;
		    }
		    l1 = reverse(l1);
		    return l1;
		}
        else{
            if(carry == 1){
                ListNode f = new ListNode(1);
                l1.next = f;
            }
            l1 = reverse(l1);
            return l1;
        }
    }	
	public void addTwoNumbers(List l1, List l2) {
		addTwoNumbers(l1.head, l2.head);
		
	}
	
}



/* 
 if(tmp1 == null && tmp2 != null){
			tmp2.val = tmp2.val + carry;
			if(tmp2.val >= 10){
			    tmp2.val = tmp2.val % 10;
    		    ListNode f = new ListNode(1);
	            tmp2.next = f;		    
			}
		    l2 = reverse(l2);
			return l2;
		}
		
		if(tmp1 != null && tmp2 == null){
			tmp1.val = tmp1.val + carry;
			if(tmp1.val >= 10){
			    tmp1.val = tmp1.val % 10;
    		    ListNode f = new ListNode(1);
	            tmp1.next = f;		    
			}
			l1 = reverse(l1);
			return l1;
		}
		if(carry == 1){
		    ListNode f = new ListNode(1);
		    l2.next = f;
		}
		
        l2 = reverse(l2);
	    return l2;
	    */
 