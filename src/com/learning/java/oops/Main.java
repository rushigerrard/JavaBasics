package com.learning.java.oops;

public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Mammal d2 = new Dog();
		Animal d3 = new Dog();
		
		System.out.println(d1.domesticated());
		d2.move();
		
	}

}
