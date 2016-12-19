package com.learning.generics;

public class GenericDemo<T> {
	T object;
	public GenericDemo(T o){
		this.object = o;
	}
	
	public T getObject(){
		return object;
	}
	public void setObject(T o){
		this.object = o;
	}
	public void showType(){
		System.out.println("Object is of class " + object.getClass().getName());
	}
}
