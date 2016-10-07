package com.learning.java.oops;

public class Animal implements IAnimal{
	
	protected String prot = "Protected";
	private String priv = "Private Animal";
	
	/* (non-Javadoc)
	 * @see com.learning.java.oops.IAnimal#move()
	 */
	@Override
	public void move(){
		System.out.println("Animals can move");
	}
	
	/* (non-Javadoc)
	 * @see com.learning.java.oops.IAnimal#skin()
	 */
	@Override
	public void skin(){
		System.out.println("Animal has skin");
	}
	
	private Boolean domesticated(){
		return false;
	}
}