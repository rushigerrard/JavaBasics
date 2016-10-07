package com.learning.java.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class StandardLinkedList{
	
	
	public static void main(String[] args){
		LinkedList<String> ll = new LinkedList<>();
		String[] ss = {"Hello", "Ahoy", "Arnab", "Goswami"};
		for(String s : ss){
			ll.add(s);
		}
		LinkedList<String> l1 = new LinkedList<>();
		l1.addAll(ll);
		
		ArrayList<Integer> arr = new ArrayList<>();
		
	}
}