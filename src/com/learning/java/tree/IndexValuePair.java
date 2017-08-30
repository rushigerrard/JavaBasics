package com.learning.java.tree;

public class IndexValuePair {
	int index;
	int value;

	public IndexValuePair() {

	}

	public IndexValuePair(int index, int value) {
		this.index = index;
		this.value = value;
	}

	public String toString() {
		return "index : " + this.index + " value : " + this.value;
	}

	/*
	 * public int compareTo(IndexValuePair ivp) { return this.value - ivp.value;
	 * }
	 */
}
