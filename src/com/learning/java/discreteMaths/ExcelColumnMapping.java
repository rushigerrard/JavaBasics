package com.learning.java.discreteMaths;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ExcelColumnMapping {

	static HashMap<Integer, String> mp = new HashMap<>();
	static{
		int i = 1;
		for (char ch = 'A'; ch <= 'Z'; ++ch){
			mp.put(i, String.valueOf(ch));
			i++;
		}
		mp.put(0, String.valueOf('Z'));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int no = 0; no < 704; no++){
			
			System.out.println(no + "," + convertToTitle(no));
		}
	}

	public static String convertToTitle(int n) {

		StringBuilder s = new StringBuilder();
		int remainder;
		while(n > 26){
			remainder = n % 26;
			s.append(mp.get(remainder));
			if(remainder == 0)
				n = n - 1;
			n = n / 26;
		}
        s.append(mp.get(n));
        return s.reverse().toString();
    }


}
