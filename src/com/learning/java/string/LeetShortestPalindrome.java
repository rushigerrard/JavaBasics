package com.learning.java.string;

public class LeetShortestPalindrome {

	public String shortestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        while(!middleOutPalindromeCheck(sb)){
        	sb.insert(count, sb.charAt(sb.length() - 1 - count));
        	count++;
        }
		return sb.toString();
    }
	public boolean middleOutPalindromeCheck(StringBuilder s){
		if(s.equals(""))
			return true;
		int start, end;
		if(s.length() % 2 == 0){
			start = s.length() / 2 - 1;
			end = s.length() / 2;
		}else{
			start = s.length() / 2;
			end = start;
		}
		while(start >= 0){
			if(s.charAt(start) != s.charAt(end)){
				return false;
			}else{
				start--; end++;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		LeetShortestPalindrome lsp = new LeetShortestPalindrome();
		System.out.println(lsp.shortestPalindrome("abcd"));
		System.out.println(lsp.shortestPalindrome("aacecaaa"));
		System.out.println(lsp.middleOutPalindromeCheck(new StringBuilder("abbc")));
	}
	
}
