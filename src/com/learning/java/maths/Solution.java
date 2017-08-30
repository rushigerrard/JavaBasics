package com.learning.java.maths;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String parseExpression(String input){
    	if(!input.contains("/"))
    		return input;
		String[] tokens = input.split("/");
		if(tokens.length == 1)
			return tokens[0];
		if(tokens[1].isEmpty() || tokens[1].equals("") )
			return input;
		StringBuilder sb = new StringBuilder(tokens[0]);
		
		String currentString = tokens[0];
		
		for(Character c : tokens[1].toCharArray()){
			if(c == 'R'){
				sb.reverse();
				//invert all brackets again
				for(int i = 0; i < sb.length(); i++){
					if(sb.charAt(i) == '('){
						sb.setCharAt(i, ')');
					}
					else if(sb.charAt(i) == ')'){
						sb.setCharAt(i, '(');
					}
				}
			}
			
			if(c == 'S'){
				int count = 0;
				for(int i = 0; i < sb.length(); i++){
					if(sb.charAt(i) == '(' && count == 0){
						sb.deleteCharAt(i);
						count = 1;
					}
					else if(sb.charAt(i) == ')' && count == 1){
						sb.deleteCharAt(i);
						break;
					}
					
				}
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            String input = sc.nextLine();
            System.out.println(parseExpression(input));
            	
		}
	}
}