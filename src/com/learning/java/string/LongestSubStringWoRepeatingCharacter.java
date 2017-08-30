package com.learning.java.string;

import java.util.HashSet;

public class LongestSubStringWoRepeatingCharacter {

    public int lengthOfLongestSubstring(String s) {
        int currSeq = 0;
        int longSeq = 0;

        for(int i = 0; i < s.length(); i++){
            HashSet<Character> hs = new HashSet<>();
            currSeq = 0;
            for(int j  = i; j < s.length(); j++){
                if(hs.add(s.charAt(j)) == true){
                    currSeq += 1;
                }else{
                    if(longSeq < currSeq)
                        longSeq = currSeq;
                    break;
                }
            }
            if(longSeq < currSeq)
                longSeq = currSeq;

        }
        if(longSeq < currSeq)
            longSeq = currSeq;
        return longSeq;

    }
    public int lengthOfLongestSubstringOn(String s){
    	
    	if(s.length() <= 1)
            return s.length();
        
        int start = 0;
        int end = 0;
        HashSet<Character> hs = new HashSet<>();
        int maxLength = 0, currLength = 0;
        while(end < s.length()){
        	System.out.println("Start : " + start + " End : " + end);
            while(end < s.length() && !hs.contains(s.charAt(end))){
                hs.add(s.charAt(end++));
            }
            currLength = end - start;
            if(maxLength < currLength)
                maxLength = currLength;
                
            while(start < s.length() && s.charAt(start) != s.charAt(end)){
                hs.remove(s.charAt(start++));
            }
            if(s.charAt(start) == s.charAt(end)){
            	hs.remove(s.charAt(start++));
            }
        }
        return maxLength;
    }
    
	public static void main(String[] args) {
		LongestSubStringWoRepeatingCharacter lswrc = new LongestSubStringWoRepeatingCharacter();
		System.out.println(lswrc.lengthOfLongestSubstringOn("abcabcbb"));
	}

}
