package com.learning.java.string;

public class ReverseWordOrder {

	public static String reverseWords3(String s) {
		int start = 0;
		char[] word = s.toCharArray();
		int end = word.length - 1;

		for (int i = 0; i < word.length; i++) {
			if (i > 0 && word[i] == ' ') {
				if (i == start) {
					i++;
					start++;
				} else {
					end = i - 1;
					while (start < end) {
						Character tmp = word[start];
						word[start] = word[end];
						word[end] = tmp;
						start++;
						end--;
					}
					start = i + 1;
					System.out.println("start : " + start);
				}
			}
		}
		if (start != word.length) {
			end = word.length - 1;
			while (start < end) {
				Character tmp = word[start];
				word[start] = word[end];
				word[end] = tmp;
				start++;
				end--;
			}
		}

		if (start == 0 && end == word.length - 1) {
			return new StringBuffer(s).reverse().toString();
		} else
			return new String(word);

	}

	private static String reverseWordOrder(String s) {
		
		StringBuilder sb = new StringBuilder();
		s = sb.append(s).reverse().toString();
		
		int start = 0, end, mark = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != ' '){
				mark++;
			}
			else{
				end = mark;
				StringBuilder ss = new StringBuilder();
				String original = s.substring(start, end);
				String reversed = ss.append(s.substring(start, end)).reverse().toString();
				String newString =  s.replaceAll( original, reversed);
				//System.out.println(s + start + end);
				mark++;
				start = mark;
			}
		}
		
		
		return s;
	}

	public static void main(String[] args) {
		String s = "Hello how are you";
		System.out.println(reverseWordOrder(s));
		System.out.println(reverseWords3(s));
	}


}
