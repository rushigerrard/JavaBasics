package com.learning.java.string;

public class LeetReverseWordsWithinString {

	public String reverseWords(String s){
		s = s.trim();
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();

		int start = 0;
		int end;
		for(int i = 0; i < sb.length(); i++){
			if(sb.charAt(i) == ' '){
				end = i - 1;
				while(start < end){
					char tmp = sb.charAt(start);
					sb.setCharAt(start, sb.charAt(end));
					sb.setCharAt(end, tmp);
					start++; end--;
				}
				start = i + 1;
			}
			
			
		}
		end = sb.length() - 1;
		while(start < end){
			char tmp = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, tmp);
			start++; end--;
			
		}
		System.out.println(sb);
		for(int i = 0; i < sb.length(); i++){
			if(sb.charAt(i) == ' '){
				int j = i + 1;
				while(sb.charAt(j) == ' '){
					System.out.println(j);
					sb.deleteCharAt(j);
					
				}
				i = j - 1;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		LeetReverseWordsWithinString lrwws = new LeetReverseWordsWithinString();
		System.out.println(lrwws.reverseWords("     a  b   c "));
	}

}
