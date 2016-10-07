package com.learning.java.oops;

//public class Dog implements IAnimal, IMammal{
public class Dog extends Mammal{

	@Override
	public void move() {
		System.out.println("Dogs can walk, run and jump");
	}

	@Override
	public void skin() {
		System.out.println("Animals have fur");
		// TODO Auto-generated method stub
		
	}

	public Boolean domesticated(){
		return true;
	}
}
