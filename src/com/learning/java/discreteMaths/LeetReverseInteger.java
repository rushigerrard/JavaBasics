package com.learning.java.discreteMaths;

public class LeetReverseInteger {

	public int reverse(int x) {

		int result = 0;

		while (x != 0) {
			int tail = x % 10;
			int newResult = result * 10 + tail;

			// have result and newresult separate. Try to get result from
			// reversing newResult
			if ((newResult - tail) / 10 != result) {
				return 0;
			}
			result = newResult;
			x = x / 10;
		}

		return result;
	}
	public static void main(String[] args) {
		
		LeetReverseInteger l = new LeetReverseInteger();
		System.out.println(l.reverse(-12));
		
	}

}
