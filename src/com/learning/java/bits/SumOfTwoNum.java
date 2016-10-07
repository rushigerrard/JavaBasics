package com.learning.java.bits;

public class SumOfTwoNum{
	
	public static int bitsAddition(int a, int b){
		int carry;
		while(b != 0){
			carry = a & b;
			a = a ^ b;
			b = carry << 1;
			
			//System.out.println(a + " " + b +  " " + carry);
		}
		return a;
	}
	public static void main(String args[]){
		System.out.println(bitsAddition(4, 5));
	}
}