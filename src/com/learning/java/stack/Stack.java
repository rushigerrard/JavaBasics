package com.learning.java.stack;


public class Stack{
	
	private int top;
	private int stackSize;
	private Object[] object;
	
	public void initialise(){
		top = -1;
		stackSize = 1;
		object = new Object[stackSize];
	}
	
	public void push(Object item){
		if(top < stackSize){
			resize();
		}
		object[++top] = item;
	}
	
	public Object pop(){
		if(top < 0){
			return null;
		}
		Object item = object[top--];
		return item;
	}
	
	private void resize(){
		Object tmp[] = object;
		stackSize = stackSize * 2;
		object = new Object[stackSize];
		
		for(int i = 0; i < tmp.length; i++){
			object[i] = tmp[i];
		}
				
	}
	
}