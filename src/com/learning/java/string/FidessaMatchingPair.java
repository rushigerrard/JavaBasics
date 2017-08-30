package com.learning.java.string;

import java.util.HashMap;
import java.util.Stack;

public class FidessaMatchingPair {

	/*
    static int findMatchingPair(String input) {
    	HashMap<Character, Integer> hm = new HashMap<>();
    	int lastIndex = -1;
    	
    	for(int i = 0; i < input.length(); i++){
    		if('A' <= input.charAt(i) && input.charAt(i) <= 'Z'){
    			int count = 1;
    			if(hm.containsKey(input.charAt(i))){
    				count = count + hm.get(input.charAt(i));
    			}
    			hm.put(input.charAt(i), count);
    		}
    		if('a' <= (int) input.charAt(i) && input.charAt(i) <= 'z'){
    			Character key =  (char)((int)input.charAt(i) - 32);
    			if(hm.containsKey(key)){
    				int value = hm.get(key);
    				lastIndex = i;
    				if(value == 1)
    					hm.remove(key);
    				else
    					hm.put(key, value - 1);
    			}else{
    				return -1;
    			}

    		}	
    	}
    	return lastIndex;

    }*/
    static int findMatchingPair(String input){
        int lastIndex = -1;
        if(input.length() == 0)
            return -1;
        Stack<Character> stack = new Stack<Character>();
        int i;
        int flag = 0;
        for(i = 0; i<input.length(); i++){
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
                stack.push(input.charAt(i));
            }
            else if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){
                flag = 1;
                if(stack.isEmpty()){
                    return i-1;
                }
                else if((input.charAt(i) - 'a') != (stack.peek() -'A')){
                    return lastIndex;
                }
                else{
                    stack.pop();
                    lastIndex = i;
                    if(i == input.length()-1)
                        return i;
                }
            }
        }
        i--;
        int ret = input.length()-1;
        if(!stack.isEmpty() && stack.peek() >= 'A' && stack.peek() <= 'Z' && flag == 1){
            stack.pop();
            i--;
            ret = i;
        }
        return ret;
        
    }
	public static void main(String[] args) {
		Character a = 'a';
		Character z = 'z';
		Character A = 'A';
		Character Z = 'Z';
		System.out.println(findMatchingPair("ABab"));
	}

}
