package com.learning.java.oops;

public class Reptile extends Animal implements IReptile{

	/* (non-Javadoc)
	 * @see com.learning.java.oops.IReptile#move()
	 */
	@Override
	public void move(){
		System.out.println("Reptiles crawl and slither");
	}


	/* (non-Javadoc)
	 * @see com.learning.java.oops.IReptile#skin()
	 */
	@Override
	public void skin(){
		System.out.println("Reptiles have scale");
	}
	
	private Boolean domesticated(){
		return false;
	}
}
