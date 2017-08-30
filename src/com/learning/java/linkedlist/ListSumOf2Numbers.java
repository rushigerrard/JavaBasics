package com.learning.java.linkedlist;

public class ListSumOf2Numbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;

		int carry = 0;
		int val = 0;
		ListNode l3 = new ListNode(-1);
		ListNode current = l3;
		while(l1 != null && l2 != null){
			val = l1.val + l2.val + carry;
			carry = val / 10;
			val = val % 10;

			l1 = l1.next; l2 = l2.next;

			current.next = new ListNode(val);
			current = current.next;

		}
		if(l1 == null && l2 != null){
			while(l2 != null){
				val = l2.val + carry;
				carry = val / 10;
				val = val % 10;
				l2 = l2.next;
				current.next = new ListNode(val);
				current = current.next;

			}
		}
		if(l1 != null && l2 == null){
			while(l1 != null){
				val = l1.val + carry;
				carry = val / 10;
				val = val % 10;
				l1 = l1.next;
				current.next = new ListNode(val);
				current = current.next;

			}
		}
		if(l1 == null && l2 == null){
			if(carry == 1){
				current.next = new ListNode(carry);
			}
		}

		return l3.next;    
	}
}
