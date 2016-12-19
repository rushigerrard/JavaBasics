package com.learning.generics;

public class GenericMethod {

	static <T, V extends T> boolean isIn(T x, V[] y){
		for(int i = 0; i < y.length; i++){
			if(x.equals(y[i]))
				return true;
		}
		return false;
	}
	public static void main(String[] args){
		Integer[] nums = {1, 2, 3, 4, 5};
		if(isIn(2, nums))
			System.out.println("2 is in nums");
		
		String[] sList = {"Hello", "World", "Lets", "Try", "Generic", "Method"};
		if(isIn("Hello", sList));
			System.out.println("Hello is in sList");
		
		if(!isIn(4, sList))
			System.out.println("4 is not in sList");
		
			
	}
}
