package com.learning.generics;

public class TestGenericDemo {

	public static void main(String[] args) {
		GenericDemo<Integer> integerDemo = new GenericDemo<Integer>(5);
		integerDemo.showType();

		GenericDemo<String> stringDemo = new GenericDemo<>("Hello");
		stringDemo.showType();
	
		Integer[] list = {1, 2, 3, 4};
		BoundedType<Integer> integerBound = new BoundedType<Integer>(list);
		System.out.println("Average is " + integerBound.getAverage());
		
		Double[] dlist = {1.2, 2.4, 3.6, 4.8};
		BoundedType<Double> doubleBound = new BoundedType<>(dlist);
		System.out.println("Average is " + doubleBound.getAverage());
		
		System.out.println("Average of both is same? " + integerBound.sameAverage(doubleBound));
	}

}
