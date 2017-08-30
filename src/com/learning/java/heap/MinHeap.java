package com.learning.java.heap;

public class MinHeap<T> implements Comparable<Integer> {

	HeapNode root = null;

	public MinHeap() {

	}

	public MinHeap(Integer val) {
		HeapNode root = new HeapNode(val);
	}

	public void insert(Integer val){
		if (root == null) {
			root = new HeapNode(val);
			return;
		}
		if (root.left == null) {
			// insert(root.left, val);
		}
	}
	@Override
	public int compareTo(Integer o) {

		return 0;
	}
}
