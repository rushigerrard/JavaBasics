package com.learning.java.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paranthesis {

	StringBuilder s = new StringBuilder();
	
	public List<String> generateParenthesis(int n) {
		
		//StringBuilder s = new StringBuilder();
		String s = new String();
		ArrayList<String> as = new ArrayList<>();
		helper(n, n, s, as);
		return as;
		
    }

	private void helper(int left, int right, String s, ArrayList<String> as) {
		
		if(right < left)
			return ;
		
		if(left == 0 && right == 0){
			as.add(s);
		}
		
		if(left > 0)
			helper(left - 1, right, s + "(", as);
		
		if(right > 0)
			helper(left, right - 1, s + ")", as);
		
	}

	public static void main(String[] args){

		Paranthesis p = new Paranthesis();
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		ArrayList<String> s = (ArrayList<String>) p.generateParenthesis(n);
		for(String e : s){
			System.out.println(e);
		}
			
	}
}
