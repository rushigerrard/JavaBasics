package com.learning.java.stack;

import java.util.Stack;

public class JavaStack{
	
	public static void main(String[] args){
		Stack sk = new Stack();
		if(sk.empty())
			System.out.println("Stack is empty");
		sk.push("Hello");
		sk.push(4);
		sk.push(6.42323);
		System.out.println(sk.peek());
		System.out.println(sk.pop());
		System.out.println(sk.pop());
		System.out.println(sk.pop());
		if(!sk.isEmpty())
			System.out.println(sk.pop());
				
	}
}