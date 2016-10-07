
package com.learning.java.basics;

import java.util.HashMap;

public class Stringer {



	public String replace(String str) {
		System.out.println(str);
		String[] words = str.split(" ");
		System.out.println("Word length is " + words.length);
		StringBuilder sentence = new StringBuilder(words[0]);
		
		for (int i = 1; i < words.length; ++i) {
			sentence.append("%20");
			sentence.append(words[i]);
		}

		System.out.println(sentence.toString());
		return sentence.toString();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sc = { "funk", "trunk", "free", "tree"};
		
		String a = "Borisbecker";
		
		for(String s : sc){
			if(s.startsWith("tr"))
				System.out.println(s + " "
						+ "start with tr");
			if(s.endsWith("unk"))
				System.out.println(s + " ends with unk" );
			
		}
		
		Stringer st = new Stringer();
		st.replace("  Radha How Is   Sudha?");
		Stringer str = new Stringer();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public char uniqueCharacters(String a){
		char[] sa = a.toCharArray();
		//Using hashmap
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (char c = 'a' ; c <= 'z'; c++){
			hm.put(c, 0);
		}
		
		for(char c : sa){
			if(hm.get(c) == 1)
				return c;
			hm.put(c, 1);
			
		}
		return (Character) null;
	}
}
