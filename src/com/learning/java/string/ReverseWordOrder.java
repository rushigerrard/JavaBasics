package com.learning.java.string;

public class ReverseWordOrder {

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
				System.out.println(newString);
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
	}


}
