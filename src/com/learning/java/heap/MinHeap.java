package com.learning.java.heap;

public class MinHeap<T> implements Comparable<Integer> {

	private T[] heap; 
	
	public MinHeap(int capacity){
		heap = (T[]) new Object[capacity];
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
