package com.advanced.datastructures.linkedlist;

import java.util.ArrayList;

public class useList {

	public static void main(String[] args) {
		List l1 = new List();
		/*
		 * [7,2,4,3]
[5,6,4]
		 * */
		l1.Insert(9);
		l1.Insert(9);
		l1.Print();
		List l2 = new List();
		l2.Insert(1);

		l2.Print();
		l1.addTwoNumbers(l1, l2);
		//l1.addTwoNumbers(l1, l2);
		
		
	}

}
