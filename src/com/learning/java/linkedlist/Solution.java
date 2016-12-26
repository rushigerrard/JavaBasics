package com.learning.java.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

import com.learning.java.maths.AddDigits;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		ListNode l = new ListNode(1);
		s.insert(l, 8);
		ListNode m = new ListNode(1);
		s.insert(m, 8);
		ListNode l3 = s.addTwoReverseNumbers(l, m);
		while(l3 != null){
			System.out.println(l3.val);
			l3 = l3.next;
		}
		
	}
	public ListNode addtwoReverseNumbers(ListNode l1, ListNode l2, Integer alpha){
		ListNode current = l1;
		int l1_count = 1;
		while(current.next != null){
			l1_count++;
			current = current.next;
		}
		int l2_count = 2;
		current = l2;
//		int l2_count = 1;
		while(current.next != null){
			l1_count++;
			current = current.next;
		}
		return l2;
	}
	public ListNode addTwoReverseNumbers(ListNode l1, ListNode l2){

		int sum = 0;
		int carry = 0;
		ListNode l3 = new ListNode(0);
		ListNode current ;
		boolean flag = true;
		while(l1 != null || l2 != null){
			sum = l1.val + l2.val + carry;
            if(sum > 9){
                sum = sum % 10;
                carry = 1;
            }else{
                carry = 0;
            }
            current = new ListNode(sum);
            if(flag){
            	l3.next = current;
            	flag = false;
            }
            current = current.next;
            l1 = l1.next; l2 = l2.next;
		}
		if(l1 == null && l2 == null){
			if(carry == 1){
				current = new ListNode(1);
			}
		}
		if(l1 == null && l2 != null){
			if(carry == 0){
				current = l2;
			}else{
				while(l2 != null){
					sum = l2.val + carry;
					if(sum > 9){
		                sum = sum % 10;
		                carry = 1;
		            }else{
		                carry = 0;
		            }
					current = new ListNode(sum);
					current = current.next;
				}
				if(carry == 1)
					current = new ListNode(1);
			}
		}
		if(l1 != null && l2 == null){
			if(carry == 0){
				current = l1;
			}else{
				while(l2 != null){
					sum = l2.val + carry;
					if(sum > 9){
		                sum = sum % 10;
		                carry = 1;
		            }else{
		                carry = 0;
		            }
					current = new ListNode(sum);
					current = current.next;
				}
				if(carry == 1)
					current = new ListNode(1);
			}
		}
		return l3.next;
	}
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            
            ArrayList<Integer> a1 = new ArrayList<>();
            ArrayList<Integer> a2 = new ArrayList<>();
            ArrayList<Integer> a3 = new ArrayList<>();
            
            ListNode current = l1;
            
            while(current != null){
                a1.add(current.val);
                current = current.next;
            }
            
            current = l2;
            
            while(current != null){
                a2.add(current.val);
                current = current.next;
            }
  /*          
            Collections.reverse(a1);
            Collections.reverse(a2);
  */          
            int carry = 0;
            int count = 0;
            int sum = 0;
            
            if(a1.size() < a2.size()){
                while(count < a1.size()){
                    sum = a1.get(count) + a2.get(count) + carry;
                    if(sum > 9){
                        sum = sum % 10;
                        carry = 1;
                    }else{
                        carry = 0;
                    }
                    a3.add(sum);
                    count++;
                }
                while(count < a2.size()){
                    sum = a1.get(count) + carry;
                    if(sum > 9){
                        sum = sum % 10;
                        carry = 1;
                    }else{
                        carry = 0;
                    }
                    a3.add(sum);
                }
                if(carry == 1)
                    a3.add(1);
                    
            }else if(a1.size() > a2.size()){
                while(count < a2.size()){
                    sum = a1.get(count) + a2.get(count) + carry;
                    if(sum > 9){
                        sum = sum % 10;
                        carry = 1;
                    }else{
                        carry = 0;
                    }
                    a3.add(sum);
                    count++;
                }
                while(count < a1.size()){
                    sum = a1.get(count) + carry;
                    if(sum > 9){
                        sum = sum % 10;
                        carry = 1;
                    }else{
                        carry = 0;
                    }
                    a3.add(sum);
                }
                if(carry == 1)
                    a3.add(1);
            }else{
                while(count < a2.size()){
                    sum = a1.get(count) + a2.get(count) + carry;
                    if(sum > 9){
                        sum = sum % 10;
                        carry = 1;
                    }else{
                        carry = 0;
                    }
                    a3.add(sum);
                    count++;
                }
                if(carry == 1)
                    a3.add(1);
            }
//            Collections.reverse(a3);
            ListNode ln = new ListNode(count);
            for(Integer i3 : a3){
                insert(ln, i3);
            }
            return ln.next;
    }

	private void insert(ListNode ln, Integer i3) {
		ListNode newNode = new ListNode(i3);
		ListNode current = ln;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}
}
class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}