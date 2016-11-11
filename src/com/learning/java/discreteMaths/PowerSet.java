package com.learning.java.discreteMaths;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	
	static List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] c = new Character[]{'a', 'b', 'c', 'd'};
		powerSet(c, 0, "");
		list.add("");
		System.out.println(list.size());
		for(String s : list){
			System.out.println(s);
		}
	}
	
	private static void powerSet(Character[] c, int index, String set) {
		
		if(index + 1 < c.length){
			powerSet(c, index + 1, set + c[index] );
			powerSet(c, index + 1, set);
		}
		list.add(set + c[index]);
	}

}
