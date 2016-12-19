package com.learning.generics;

public interface GenericInterface<T extends Comparable<T>> {
	T min();
	T max();
}
