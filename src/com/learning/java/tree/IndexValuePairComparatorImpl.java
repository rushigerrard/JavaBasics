package com.learning.java.tree;

import java.util.Comparator;

public class IndexValuePairComparatorImpl implements Comparator<IndexValuePair> {

	@Override
	public int compare(IndexValuePair o1, IndexValuePair o2) {
		return o1.value > o2.value ? -1 : 1;
	}


}
