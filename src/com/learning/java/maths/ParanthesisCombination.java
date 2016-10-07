package com.learning.java.maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParanthesisCombination{
	

	public List<String> generateParenthesis(int n) {
		
		List<String> str = new ArrayList<String>();

        if(n == 0)
        	return str;
		
        str.add("(" + generateParenthesis(n - 1) + ")");
        str.add("()" + generateParenthesis(n - 1));
        return str;
    }
	
	public static void main(String args[]){
		ParanthesisCombination pc = new ParanthesisCombination();
		Scanner input = new Scanner(System.in);
		List<String> str = pc.generateParenthesis(input.nextInt());
		for(String s : str)
			System.out.println(s + " ");
		
	}
	
}