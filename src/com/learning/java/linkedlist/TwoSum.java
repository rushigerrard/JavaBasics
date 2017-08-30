package com.learning.java.linkedlist;

import java.util.HashMap;
import java.util.Stack;

public class TwoSum {

	  static int countPairs(int k, int []a) {
		  HashMap<Integer, Integer> valueMap = new HashMap<>();
		  int ans = 0;

		  for (int i = 0; i < a.length; i++) {
		      int count = 1;
		      if (valueMap.containsKey(a[i])) {
		    count = valueMap.get(a[i]) + 1;
		      }
		      valueMap.put(a[i], count);
		  }

		  for (int i = 0; i < a.length; i++) {
		      if (valueMap.containsKey(k - a[i])) {
		    ans += valueMap.get(k - a[i]);
		    if (k - a[i] == a[i])
		        ans--;
		      }
		  }
		  Stack<String> stack = new Stack<>();
		  
		  return ans / 2;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
