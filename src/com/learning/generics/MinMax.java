package com.learning.generics;

import java.util.ArrayList;

public class MinMax<T extends Comparable<T>> implements GenericInterface<T> {

	private T[] args;
	public MinMax(T[] obj){
		args = obj;
	}
	public static void main(String[] args) {
		Integer[] intList = {1, 2, 3, 4};
		MinMax<Integer> mm = new MinMax<>(intList);
		System.out.println("Minimum in the given list is : " + mm.min());
		System.out.println("Maximum in the given list is : " + mm.max());
		
		String[] sList = {"Hello", "World", "You", "Are", "Awesome"};
		MinMax<String> smm = new MinMax<>(sList);
		System.out.println("Minimum in the given list is : " + smm.min());
		System.out.println("Maximum in the given list is : " + smm.max());
		
	}

	@Override
	public T min() {
		T v = args[0];
		for(int i = 1; i < args.length; i++){
			if(v.compareTo(args[i]) > 0)
				v = args[i];
		}
		return v;
	}

	@Override
	public T max() {
		T v = args[0];
		for(int i = 1; i < args.length; i++){
			if(v.compareTo(args[i]) < 0)
				v = args[i];
		}
		return v;
	}

}
