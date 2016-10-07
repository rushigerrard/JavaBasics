package com.learning.java.stack;

public class UseStack{
	
	public static void main(String[] args){
		Stack s = new Stack();
		
		s.initialise();
		s.push(4.2332);
		s.push(5.2121);
		s.push("Ole");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}