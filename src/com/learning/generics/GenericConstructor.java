package com.learning.generics;

public class GenericConstructor {

	private int intVal;
	private double doubleVal;
	
	<T extends Number> GenericConstructor(T arg){
		intVal = arg.intValue();
		doubleVal = arg.doubleValue();
	}
	
	void showVal(){
		System.out.println("Integer Value : " + intVal + " Double Value : " + doubleVal);
	}
	
	public static void main(String[] args) {
		GenericConstructor gc0 = new GenericConstructor(112);
		GenericConstructor gc1 = new GenericConstructor(123.43F);
		GenericConstructor gc2 = new GenericConstructor(102.102);
		gc0.showVal();
		gc1.showVal();
		gc2.showVal();
	}

}
