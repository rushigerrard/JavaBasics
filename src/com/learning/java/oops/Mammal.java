package com.learning.java.oops;

public class Mammal extends Animal{
	
	@Override
	public void move(){
		System.out.println("Mammals make moves using Muscle");
	}

	@Override
	public void skin(){
		System.out.println("Mammals have hair");
	}
	
	private Boolean domesticated(){
		return false;
	}
}
