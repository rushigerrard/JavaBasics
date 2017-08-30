package com.learning.java.string;

/**
 * This is an implementation of KMP algorithm. I am not smart enough to come up
 * with the logic myself. Explained by my friend, Tushar Roy.
 * 
 * @author rushikesh
 *
 */
public class LeetImplementStrStr {

	// step 1 : Longest proper prefix which is also a suffix
	public int[] computeLps(String needle) {
		int[] lps = new int[needle.length()];
		if (needle.length() == 0)
			return lps;

		for (int i = 0, j = 1; j < needle.length(); j++) {
			if (needle.charAt(i) == needle.charAt(j)) {
				lps[j] = 1 + lps[j - 1];
				i++;
				j++;
			} else {
				if (i == 0) {
					lps[j] = 0;
					j++;
				}
				i = lps[j - 1];

			}
		}
		return lps;
	}

	// step 2 : kmp algorithm
	public int strStr(String haystack, String needle) {
		int[] lps = computeLps(needle);
		int startIndex = -1;

		return startIndex;
	}


	public static void main(String[] args) {
		LeetImplementStrStr liss = new LeetImplementStrStr();
		String haystack = "abcabcabd";
		String needle = "abcabd";
		liss.strStr(haystack, needle);

	}

}
