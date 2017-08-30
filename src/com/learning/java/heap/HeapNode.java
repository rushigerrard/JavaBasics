package com.learning.java.heap;

public class HeapNode {

	protected Integer val;
	protected HeapNode left;
	protected HeapNode right;

	HeapNode(Integer val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}
