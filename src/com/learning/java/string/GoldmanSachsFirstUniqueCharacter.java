package com.learning.java.string;

import java.util.HashMap;

public class GoldmanSachsFirstUniqueCharacter {

	
	static String runLengthEncode(String input){
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i = 0; i < input.length(); i++){
			if(hm.containsKey(input.charAt(i))){
				hm.put(input.charAt(i), 1 + hm.get(input.charAt(i)));
			}else{
				hm.put(input.charAt(i), 1);
			}
		}
		String output = "";
		for(int i = 0; i < input.length();){
			int j = i + 1;
			int count = 1;
			while(j < input.length() && input.charAt(i) == input.charAt(j)){
				count++;
				j++;
			}
			output = output + count + input.charAt(i);
			i = i + count;
		}
		return output;
	}
	

	static String firstUniqueChr(String input) {
		
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < input.length(); i++) {
			
			int count = 1;
			if (charMap.containsKey(input.charAt(i))) {
				count = charMap.get(input.charAt(i)) + 1;
			}
			charMap.put(input.charAt(i), count);
		}

		for (int i = 0; i < input.length(); i++) {
			if (charMap.get(input.charAt(i)) == 1)
				return input.charAt(i) + "";
		}

		return null;
	}

	
	public static void main(String[] args) {
		String a = "";
		System.out.println(runLengthEncode(a));
	}

}
