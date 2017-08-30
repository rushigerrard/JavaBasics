package com.learning.java.discreteMaths;

public class GreatestPowerOf2 {

	int getSegmentTreeSize(int N){
		int size = 1;
		for (; size < N; size <<= 1);
		
		return size;
	}
	
	public static void main(String[] args) {
		GreatestPowerOf2 gp2 = new GreatestPowerOf2();
		System.out.println(gp2.getSegmentTreeSize(3));
		System.out.println(gp2.getSegmentTreeSize(4));
		System.out.println(gp2.getSegmentTreeSize(5));
		System.out.println(gp2.getSegmentTreeSize(8));
	}

}
