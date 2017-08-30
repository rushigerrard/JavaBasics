package com.learning.java.string;

import java.util.ArrayList;
import java.util.Stack;

public class LeetLongestValidParenthesis {

	protected class DS {
		boolean isValidToPush;
		boolean isValidToPop;
		int count;
		Stack<Character> stack;

		DS() {
		}

		DS(boolean isValidToPush, boolean isValidToPop, int count, Stack<Character> stack) {
			this.isValidToPush = isValidToPush;
			this.isValidToPop = isValidToPop;
			this.count = count;
			this.stack = stack;
		}
	}

	public int longestValidParenthesis(String pattern){
		int maxCount = 0;
		ArrayList<DS> list = new ArrayList<>();
		for (int i = 0; i < pattern.length(); i++) {
			if (pattern.charAt(i) == '(') {
				list.add(new DS(true, true, 0, new Stack<Character>()));

				for (DS ds : list) {
					if (ds.isValidToPush) {
						ds.stack.push(pattern.charAt(i));
						ds.count++;
						ds.isValidToPop = true;
					}
				}

			} else {
				for (DS ds : list) {
					if (ds.isValidToPop) {
						ds.stack.pop();
						ds.count++;
						if (ds.stack.size() == 0) {
							if (ds.count > maxCount) {
								maxCount = ds.count;
							}
							ds.isValidToPop = false;
						}
					} else {
						ds.isValidToPush = false;
					}
				}
			}
		}
		return maxCount;
	}
	public static void main(String[] args) {
		LeetLongestValidParenthesis llvp = new LeetLongestValidParenthesis();
		System.out.println(llvp.longestValidParenthesis("()()"));
	}

}
