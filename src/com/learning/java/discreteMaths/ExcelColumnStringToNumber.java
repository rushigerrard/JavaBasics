package com.learning.java.discreteMaths;

import java.util.HashMap;

public class ExcelColumnStringToNumber {

	static HashMap<Character, Integer> mp = new HashMap<>();
	
	static{
		int i = 1;
		for (char ch = 'A'; ch <= 'Z'; ++ch){
			mp.put(ch, i);
			i++;
		}
	}
	

	public int titleToNumber(String s) {
		int number = 0;
		int factor = 1;
		for(int i = s.length() - 1; i >= 0; i--){
			number = number + factor * mp.get(s.charAt(i));
			factor = factor * 26;
		}
		return number;
    }
	public static void main(String[] args) {
		ExcelColumnStringToNumber ecst = new ExcelColumnStringToNumber();
		System.out.println(ecst.titleToNumber("AAA"));
	}
}
